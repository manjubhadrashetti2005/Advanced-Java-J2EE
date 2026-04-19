package Swings;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorTabbedPane {

    JFrame f;
    JLabel label;

    ColorTabbedPane() {

        f = new JFrame("Color Tabbed Pane");

        // Label to display selected color
        label = new JLabel("Select a Tab", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));

        // Create panels
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Create tabbed pane
        JTabbedPane tp = new JTabbedPane();

        tp.addTab("Cyan", cyanPanel);
        tp.addTab("Magenta", magentaPanel);
        tp.addTab("Yellow", yellowPanel);

        // Add ChangeListener
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String title = tp.getTitleAt(index);

                label.setText("Selected Color: " + title);
                System.out.println("Selected Color: " + title);
            }
        });

        // Layout
        f.setLayout(new BorderLayout());
        f.add(label, BorderLayout.NORTH);
        f.add(tp, BorderLayout.CENTER);

        // Frame settings
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorTabbedPane();
    }
}