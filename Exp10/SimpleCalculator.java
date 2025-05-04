package Exp10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private StringBuilder input;
    public SimpleCalculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        input = new StringBuilder();

        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                try {
                    double result = eval(input.toString());
                    textField.setText(String.valueOf(result));
                    input.setLength(0); // Clear input after result
                } catch (Exception ex) {
                    textField.setText("Error");
                    input.setLength(0);
                }
                break;
            case "C":
                input.setLength(0);
                textField.setText("");
                break;
            default:
                input.append(command);
                textField.setText(input.toString());
        }
    }

    // Simple expression evaluator (no parentheses or operator precedence)
    private double eval(String expr) {
        String[] tokens = expr.split("(?<=[-+*/])|(?=[-+*/])");
        double result = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String op = tokens[i];
            double num = Double.parseDouble(tokens[i + 1]);

            switch (op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": result /= num; break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleCalculator::new);
    }
}