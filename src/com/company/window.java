package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class window extends JFrame implements WindowListener, ActionListener {
    private TextField f = new TextField();
    private JButton b0 = new JButton("0");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");

    private JButton dell = new JButton("C");
    private String text = "";

    public window() {
        Font ex = new Font("Impact", Font.BOLD, 40);
        setLayout(null);
        setSize(400, 600);
        setVisible(true);
        setLocation(700, 250);
        f.setFont(ex);
        f.setSize(330, 60);
        f.setLocation(25, 25);
        f.setVisible(true);
        add(f);
        b0.setFont(ex);
        b0.setSize(60, 60);
        b0.setLocation(150, 450);
        b0.setVisible(true);
        add(b0);
        b1.setFont(ex);
        b1.setSize(60, 60);
        b1.setLocation(25, 315);
        b1.setVisible(true);
        add(b1);
        b9.setFont(ex);
        b9.setSize(60, 60);
        b9.setLocation(105, 225);
        b9.setVisible(true);
        add(b9);
        b7.setFont(ex);
        b7.setSize(60, 60);
        b7.setLocation(25, 225);
        b7.setVisible(true);
        add(b7);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b9.addActionListener(this);
        b7.addActionListener(this);
        dell.setFont(ex);
        dell.setSize(60, 60);
        dell.setLocation(265, 225);
        dell.setVisible(true);
        add(dell);
        dell.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            text = text + b0.getText();
            f.setText(text);
        }
        if (e.getSource() == b1) {
            text = text + b1.getText();
            f.setText(text);
        }

        if (e.getSource() == b7) {
            text = text + b7.getText();
            f.setText(text);
        }
        if (e.getSource() == b9) {
            text = text + b9.getText();
            f.setText(text);
        }
        if (e.getSource() == dell) {
            text = "";
            f.setText(text);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
