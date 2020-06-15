package com.Dai.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @auther Daisy
 * @date 2020/6/15 - 19:57
 */
public class JButtonDemo02 extends JFrame{
    public JButtonDemo02(){
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo02.class.getResource("dairy.png");
        Icon icon = new ImageIcon(resource);

        //单选框
        JRadioButton radioButton01 = new JRadioButton("01");
        JRadioButton radioButton02 = new JRadioButton("02");
        JRadioButton radioButton03 = new JRadioButton("03");

        //由于单选框只能选择一个 分组 一个组中只能选择一个
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);

        container.add(radioButton01,BorderLayout.CENTER);
        container.add(radioButton02,BorderLayout.NORTH);
        container.add(radioButton03,BorderLayout.SOUTH);

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo02();
    }
}
