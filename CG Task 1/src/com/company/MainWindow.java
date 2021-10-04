package com.company;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        DrawPanel panel = new DrawPanel();
        this.add(panel);
    }
}
