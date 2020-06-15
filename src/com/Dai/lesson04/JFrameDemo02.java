package com.Dai.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 17:19
 */
public class JFrameDemo02 {
    public static void main(String[] args) {
        new MyFrame2().init();
    }
}
class MyFrame2 extends JFrame{
    public void init(){
        this.setBounds(100,100,400,400);
        this.setVisible(true);

        JLabel label = new JLabel("嘟嘟嘟daladala");
        this.add(label);
        //让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

        //获得一个容器
        Container container = this.getContentPane();
        container.setBackground(Color.pink);
    }
}
