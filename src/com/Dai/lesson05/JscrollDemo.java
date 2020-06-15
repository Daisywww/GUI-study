package com.Dai.lesson05;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 19:25
 */
public class JscrollDemo extends JFrame {
    public JscrollDemo(){
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("滴答 滴答");

        //Scroll面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JscrollDemo();
    }
}
