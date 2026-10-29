package ua.com.kisit.lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClockFrame {

    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        label = new JLabel();

        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(300, 70);

        ClockExt clockExt = new ClockExt(18, 2, 23);

        label.setText(clockExt.toString());

        Timer timer = new Timer(1000, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt.nextSecond();
                label.setText(clockExt.toString());
            }
        }
        );

        timer.start();

        frame.setVisible(true);

    }
}
