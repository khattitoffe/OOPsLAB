package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationForm().createForm());
    }

    private void createForm() {
        JFrame frame = new JFrame("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passLabel = new JLabel("Password:");
        JLabel confirmPassLabel = new JLabel("Confirm Password:");

        JTextField nameField = new JTextField(20);
        JTextField emailField = new JTextField(20);
        JPasswordField passField = new JPasswordField(20);
        JPasswordField confirmPassField = new JPasswordField(20);

        JLabel nameError = new JLabel(" ");
        JLabel emailError = new JLabel(" ");
        JLabel passError = new JLabel(" ");
        JLabel confirmPassError = new JLabel(" ");
        JLabel statusLabel = new JLabel(" ");

        nameError.setForeground(Color.RED);
        emailError.setForeground(Color.RED);
        passError.setForeground(Color.RED);
        confirmPassError.setForeground(Color.RED);
        statusLabel.setForeground(new Color(0, 128, 0));


        JButton registerButton = new JButton("Register");

        gbc.gridx = 0; gbc.gridy = 0; panel.add(nameLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; panel.add(nameField, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel.add(nameError, gbc);

        gbc.gridx = 0; gbc.gridy = 2; panel.add(emailLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 2; panel.add(emailField, gbc);
        gbc.gridx = 1; gbc.gridy = 3; panel.add(emailError, gbc);

        gbc.gridx = 0; gbc.gridy = 4; panel.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 4; panel.add(passField, gbc);
        gbc.gridx = 1; gbc.gridy = 5; panel.add(passError, gbc);

        gbc.gridx = 0; gbc.gridy = 6; panel.add(confirmPassLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 6; panel.add(confirmPassField, gbc);
        gbc.gridx = 1; gbc.gridy = 7; panel.add(confirmPassError, gbc);

        gbc.gridx = 1; gbc.gridy = 8; panel.add(registerButton, gbc);
        gbc.gridx = 1; gbc.gridy = 9; panel.add(statusLabel, gbc);

        registerButton.addActionListener(e -> {
            boolean valid = true;
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passField.getPassword());
            String confirmPassword = new String(confirmPassField.getPassword());

            nameError.setText(" ");
            emailError.setText(" ");
            passError.setText(" ");
            confirmPassError.setText(" ");
            statusLabel.setText(" ");

            
            if (name.isEmpty()) {
                nameError.setText("Name is required.");
                valid = false;
            }

            if (email.isEmpty()) {
                emailError.setText("Email is required.");
                valid = false;
            } else if (!email.contains("@")) {
                emailError.setText("Invalid email format.");
                valid = false;
            }

            if (password.isEmpty()) {
                passError.setText("Password is required.");
                valid = false;
            }

            if (!password.equals(confirmPassword)) {
                confirmPassError.setText("Passwords do not match.");
                valid = false;
            }

            if (valid) {
                statusLabel.setText("Registration Successful!");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
