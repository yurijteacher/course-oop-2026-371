package ua.com.kisit.unit8;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class Calculation {

    // awt swing FX

    // Frame JFrame
    // Table JTable
    // Panel JPanel
    // Button JButton
    // TextArea JTextArea

    //      Calculation     - x
  /*
   7  8  9  +
   4  5  6  -
   1  2  3  *
   0  .  =  /
    */

    JFrame frame;
    JTextArea display;
    JPanel panel;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;

    double firstNumber = 0;
    double secondNumber = 0;

    String operation = "";

    public Calculation() {

        frame = new JFrame("Calculation");
        display = new JTextArea();

        panel = new JPanel();
        b1 = new JButton("0");
        b2 = new JButton(".");
        b3 = new JButton("=");
        b4 = new JButton("/");

        b5 = new JButton("1");
        b6 = new JButton("2");
        b7 = new JButton("3");
        b8 = new JButton("*");

        b9 = new JButton("4");
        b10 = new JButton("5");
        b11 = new JButton("6");
        b12 = new JButton("-");

        b13 = new JButton("7");
        b14 = new JButton("8");
        b15 = new JButton("9");
        b16 = new JButton("+");

        panel.setLayout(new GridLayout(4, 4));

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);

        b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        Stream.of(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, display)
                .forEach(
                        el -> el.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20)));


// v.1
//        b1.addActionListener(new AbstractAction() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                display.setText(display.getText() + b1.getText());
//            }
//        });

        // v2.
//        b1.addActionListener(e -> display.setText(display.getText() + b1.getText()));
        Stream
                .of(b1, b5, b6, b7, b9, b10, b11, b13, b14, b15)
                .forEach(e -> e.addActionListener(el -> display.setText(display.getText() + e.getText())));


        b2.addActionListener(e -> {

            boolean login = false;

            char[] arr = display.getText().toCharArray();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '.') {
                    login = true;
                }
            }

            if (!login) display.setText(display.getText() + ".");
        });

//        b16.addActionListener(e -> {
//            firstNumber = Double.parseDouble(display.getText());
//            // firstNumber = Double.valueOf(display.getText());
//            operation = b16.getText();
//            display.setText("0");
//        });

        Stream.of(b4, b8, b12, b16).forEach(e -> e.addActionListener(el -> {
            firstNumber = Double.parseDouble(display.getText());
            // firstNumber = Double.valueOf(display.getText());
            operation = e.getText();
            display.setText("0");
        }));

        b3.addActionListener(e -> {

            secondNumber = Double.parseDouble(display.getText());

            switch (operation) {
                case ("+"):
                    display.setText(String.valueOf(firstNumber + secondNumber));
                    break;
                case ("-"):
                    display.setText(String.valueOf(firstNumber - secondNumber));
                    break;
                case ("*"):
                    display.setText(String.valueOf(firstNumber * secondNumber));
                    break;
                case ("/"):
                    if (secondNumber != 0) {
                        display.setText(String.valueOf(firstNumber / secondNumber));
                    } else {
                        display.setText("0");
                    }
            break;
                default:
                    display.setText("0");
        }


    });

        frame.setVisible(true);


}
}
