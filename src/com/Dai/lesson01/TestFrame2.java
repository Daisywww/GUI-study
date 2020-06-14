package com.Dai.lesson01;

import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/13 - 13:46
 */
public class TestFrame2 {
    public static void main(String[] args) {
//        展示多个窗口
        MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.BLACK);
        MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.white);
        MyFrame myFrame3 = new MyFrame(100,300,200,200,Color.pink);
        MyFrame myFrame4 = new MyFrame(300,300,200,200,Color.green);

    }

}
class MyFrame extends Frame {
    static int id = 0;
    public MyFrame(int x, int y, int w, int h,Color color){
        super("MyFrame"+(++id));
        setBounds(x,y,w,h);
        setBackground(color);
        setVisible(true);
    }
}

