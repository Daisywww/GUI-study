package com.Dai.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @auther Daisy
 * @date 2020/6/13 - 14:00
 */
public class TestFlowLayout {
//    流式布局
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

//        设置为流式布局 默认为防止中间
//        frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(400,400);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
