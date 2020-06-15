package com.Dai.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @auther Daisy
 * @date 2020/6/15 - 19:32
 */
public class JButtonDemo01 extends JFrame {

    public JButtonDemo01(){
        Container container = this.getContentPane();
        //将一个图片变为图标
        URL resource = JButtonDemo01.class.getResource("dairy.png");
        Icon icon = new ImageIcon(resource);

        //把这个图标放在按钮上
        JButton button = new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");

        //add
        container.add(button);

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new JButtonDemo01();
    }
}
