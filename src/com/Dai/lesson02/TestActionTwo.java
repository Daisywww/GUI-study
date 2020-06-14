package com.Dai.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @auther Daisy
 * @date 2020/6/13 - 15:02
 */
public class TestActionTwo {

    public static void main(String[] args) {
        //两个按钮 实现同一个监听
        //开始  停止
        Frame frame = new Frame("开始 - 停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        MyMonitor myMonitor = new MyMonitor();

        //可以显示的定义触发会返回的命令，如果显示定义，则会走默认的值
        //可以多个按钮写一个监听类
        button2.setActionCommand("button2-stop");
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.setLocation(200,200);
        frame.setSize(200,200);
        frame.setVisible(true);
        close(frame);

    }
    public static void close(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //
        System.out.println("clicked:msg " + e.getActionCommand());
        if(e.getActionCommand().equals("start")){

        }
    }
}
