package com.Dai.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @auther Daisy
 * @date 2020/6/13 - 13:52
 */
//可以看成是一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
//        布局的概念
        Panel panel = new Panel();

//        坐标
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.pink);

//        panel设置坐标，相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(253, 68, 115, 247));

        frame.add(panel);
        frame.setVisible(true);

//        监听事件，监听窗口关闭事件
//        适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                结束程序
                System.exit(0);
            }
        });
    }


}
