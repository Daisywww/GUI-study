package com.Dai.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @auther Daisy
 * @date 2020/6/15 - 16:43
 */
public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}
class WindowFrame extends Frame{
    public WindowFrame() {
        setBackground(Color.pink);
        setBounds(100,100,200,200);
        setVisible(true);
        //addWindowListener(new MyWindowListener());
        this.addWindowListener(new WindowAdapter() {//匿名内部类
            //关闭窗口
            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame source = (WindowFrame) e.getSource();
                source.setTitle("activated");
                System.out.println("windowActivated");
            }
            //激活窗口
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                System.exit(0);//正常退出
            }
        });
    }
    class MyWindowListener extends WindowAdapter{

    }
}
