package Exp10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp {
    private int elapsedSeconds = 0;
    private Timer timer;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StopwatchApp().createGUI());
    }

    private void createGUI() {
        JFrame frame = new JFrame("Simple Stopwatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        JLabel timeLabel = new JLabel("Elapsed Time: 0 s", SwingConstants.CENTER);
        timeLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        JButton startButton = new JButton("Start");
        JButton stopButton = new JButton("Stop");
        JButton resetButton = new JButton("Reset");


        timer = new Timer(1000, e -> {
            elapsedSeconds++;
            timeLabel.setText("Elapsed Time: " + elapsedSeconds + " s");
        });


        startButton.addActionListener(e -> {
            if (!timer.isRunning()) {
                timer.start();
            }
        });

        stopButton.addActionListener(e -> {
            if (timer.isRunning()) {
                timer.stop();
            }
        });

        resetButton.addActionListener(e -> {
            timer.stop();
            elapsedSeconds = 0;
            timeLabel.setText("Elapsed Time: 0 s");
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);

        frame.setLayout(new BorderLayout());
        frame.add(timeLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

