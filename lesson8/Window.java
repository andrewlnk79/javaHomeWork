package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        /** JButton button1 =new JButton("Button1");
         JButton button2 =new JButton("Button2");
         JButton button3 =new JButton("do not press");
         add(button1, BorderLayout.NORTH);
         add(button2, BorderLayout.SOUTH);
         * add(button3,BorderLayout.CENTER);*/
        setLayout(null);
//        for (int i = 1; i <10 ; i++) {
//            JButton button=new JButton("#"+i);
//            add(button);
        JTextField textField = new JTextField();
        textField.setBounds(20, 20, 120, 32);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Enter pressed");
            }
        });
        add(textField);
        JButton button = new JButton("press");
        button.setBounds(20, 60, 120, 32);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button pressed");
            }
        });
        add(button);



        setVisible(true);
    }


    public static void main(String[] args) {
        new Window();

    }
}


