package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample implements ActionListener {

    JFrame frame;
    JLabel messageLabel;
    JButton digitalClockBtn, hourGlassBtn;

    ImageButtonExample () {
        frame = new JFrame("Clock Button Example");

        // Label to display message
        messageLabel = new JLabel("Click a button", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        messageLabel.setBounds(50, 30, 400, 40);

        // Load images (make sure images are in project folder)
        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Buttons with images
        digitalClockBtn = new JButton(digitalIcon);
        digitalClockBtn.setBounds(80, 100, 120, 120);

        hourGlassBtn = new JButton(hourglassIcon);
        hourGlassBtn.setBounds(250, 100, 120, 120);

        // Add ActionListener
        digitalClockBtn.addActionListener(this);
        hourGlassBtn.addActionListener(this);

        // Add components to frame
        frame.add(messageLabel);
        frame.add(digitalClockBtn);
        frame.add(hourGlassBtn);

        // Frame settings
        frame.setSize(450, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == digitalClockBtn) {
            messageLabel.setText("You have pressed Digital Clock!");
        } else if (e.getSource() == hourGlassBtn) {
            messageLabel.setText("You have pressed Hour Glass!");
        }
    }

    public static void main(String[] args) {
        new ImageButtonExample();
    }
}