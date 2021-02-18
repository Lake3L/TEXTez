package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    JTextField textfld;

    public Window(){
        setBounds(20,21,800,600);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("GUI");
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        addVidgets(panel);
    }
    void addVidgets(JPanel panel) {
        JLabel firsttf = new JLabel("Моя первая надпись.");
        firsttf.setBounds(190, 200, 500, 50);
        Font lblFont = new Font(Font.SERIF, 2, 50);
        firsttf.setHorizontalTextPosition(2);
        firsttf.setFont(lblFont);
        panel.add(firsttf);
    }
}
