package com.Dai.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @auther Daisy
 * @date 2020/6/15 - 20:05
 */
public class JButtonDemo03 extends JFrame{
    public JButtonDemo03(){
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo03.class.getResource("dairy.png");
        Icon icon = new ImageIcon(resource);

        //多选框
        JCheckBox checkBox01 = new JCheckBox("01");
        JCheckBox checkBox02 = new JCheckBox("02");

        container.add(checkBox01,BorderLayout.NORTH);
        container.add(checkBox02,BorderLayout.SOUTH);

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo03();
    }
}
