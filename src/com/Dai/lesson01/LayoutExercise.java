package com.Dai.lesson01;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @auther Daisy
 * @date 2020/6/13 - 14:17
 */
public class LayoutExercise {
    public static void main(String[] args) {
        Frame frame = new Frame("exercise");
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setVisible(true);

        frame.setLayout(new GridLayout(2,1));

        //四个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));

        //上面
        panel1.add(new Button("east-1"),BorderLayout.EAST);
        panel1.add(new Button("west-1"),BorderLayout.WEST);
        panel2.add(new Button("p2-btn-1"));
        panel2.add(new Button("p2-btn-2"));
        panel1.add(panel2,BorderLayout.CENTER);

        //下面
        panel3.add(new Button("btn5"),BorderLayout.EAST);
        panel3.add(new Button("btn6"),BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("for-"+(i+1)));
        }
        panel3.add(panel4,BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
