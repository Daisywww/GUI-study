package com.Dai.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 17:10
 */
public class JFrameDemo {
    //init();初始化
    public void init(){
        JFrame frame = new JFrame("这是一个JFrame窗口");
        frame.setVisible(true);
        frame.setBounds(100,100,200,200);
        frame.setBackground(Color.pink);
        //设置文字 Label
        JLabel label = new JLabel("啦啦啦啦");
        frame.add(label);

        //容器实例化


        //关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
