package com.Dai.lesson01;

import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/13 - 13:36
 */
public class TestFrame {

    public static void main(String[] args) {

        Frame frame = new Frame("我的java图像界面窗口");

//        需要设置可见性
        frame.setVisible(true);
//        设置窗口大小
        frame.setSize(400,400);
        //        弹出的初始位置
        frame.setLocation(200,200);
//        设置大小固定
        frame.setResizable(false);
//        设置背景颜色
        frame.setBackground(new Color(201, 243, 51));



    }

}
