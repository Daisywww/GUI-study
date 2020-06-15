package com.Dai.lesson03;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @auther Daisy
 * @date 2020/6/15 - 6:16
 * 鼠标监听事件
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图 - drawing");
    }
}

//自己的类
class MyFrame extends Frame{
    //画画需要画笔，需要监听鼠标当前的位置
    ArrayList points;
    public MyFrame(String title){
        super(title);
        setBounds(200,200,500,400);
        //存鼠标点击的点
        points = new ArrayList<>();
        setVisible(true);
        //鼠标监听器，正好对这个窗口
        this.addMouseListener(new MyMouseListener());

        this.addWindowListener(new MyWindowListener());

    }

    @Override
    public void paint(Graphics g) {
        //画画需要监听鼠标的时间
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.pink);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }

    //适配器模式
    private class MyMouseListener extends MouseAdapter {
        //鼠标按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame) e.getSource();
            //这里我们点击的时候就会在界面上产生一个点
            //这个点就是鼠标的点
            frame.addPoint(new Point(e.getX(),e.getY()));

            //每次点击鼠标都需要重新画一遍
            frame.repaint();//刷新
        }
    }
    private class MyWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
