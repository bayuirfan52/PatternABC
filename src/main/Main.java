package main;

import form.MainForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame("ABC Detection");
        frame.setContentPane(new MainForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}