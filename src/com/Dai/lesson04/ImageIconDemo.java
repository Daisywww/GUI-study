package com.Dai.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @auther Daisy
 * @date 2020/6/15 - 19:07
 */
public class ImageIconDemo extends JFrame {

    public ImageIconDemo(){
        //获取图片的地址
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("dairy.png");

        Icon icon = new ImageIcon(url);//命名不要冲突
        label.setIcon(icon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(100,100,100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
