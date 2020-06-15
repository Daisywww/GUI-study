package com.Dai.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 20:22
 */
public class TestTextDemo01 extends JFrame {
    public TestTextDemo01(){

        Container container = this.getContentPane();
        JTextField textField = new JTextField("hello");
        JTextField textField02 = new JTextField("Daisy",20);

        container.add(textField,BorderLayout.NORTH);
        container.add(textField02,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo01();
    }
}
