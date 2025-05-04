package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoListApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel inputPanel = new JPanel();
        JTextField taskField = new JTextField(20);
        JButton addButton = new JButton("Add");
        inputPanel.add(taskField);
        inputPanel.add(addButton);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(taskList);

        JButton removeButton = new JButton("Remove");

        addButton.addActionListener(e -> {
            String task = taskField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(listScrollPane, BorderLayout.CENTER);
        frame.add(removeButton, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
