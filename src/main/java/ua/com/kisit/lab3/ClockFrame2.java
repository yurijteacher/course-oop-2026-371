package ua.com.kisit.lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ClockFrame2 {
    JFrame frame;
    JPanel panel;
    JLabel label;

    public ClockFrame2() {

        frame = new JFrame("MyClock");
        panel = new JPanel();
        label = new JLabel();

        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(450, 90);

        ClockExt2 clockExt2 = new ClockExt2(18, 2, 23,0);

        frame.setBackground(Color.GREEN);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        label.setText(clockExt2.toString());

        Timer timer = new Timer(100, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clockExt2.nextMs();
                label.setText(clockExt2.toString());
            }
        }
        );

        timer.start();

        frame.setVisible(true);

    }
}

