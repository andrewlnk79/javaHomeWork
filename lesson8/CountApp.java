package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountApp extends JFrame {
    private int valeu;

    public CountApp() {
        setBounds(500, 500, 300, 150);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Font font = new Font("Arial", Font.BOLD, 32);
        JLabel label = new JLabel(String.valueOf(valeu));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        //инфопанель
        JLabel infoLabel = new JLabel();
        add(infoLabel, BorderLayout.NORTH);
        //кнопки
        JButton decriseButton = new JButton("<");
        decriseButton.setFont(font);
        add(decriseButton, BorderLayout.WEST);
        JButton plusButton = new JButton(">");
        plusButton.setFont(font);
        add(plusButton, BorderLayout.EAST);
        decriseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valeu--;
                label.setText(String.valueOf(valeu));
                if (Math.abs(valeu) > 10) {
                    infoLabel.setText("Value out of range");

                } else {
                    infoLabel.setText("");
                }

            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valeu++;
                label.setText(String.valueOf(valeu));
                if (Math.abs(valeu) > 10) {
                    infoLabel.setText("Value out of range");

                } else {
                    infoLabel.setText("");
                }
            }



        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountApp();
    }
}

