package com.Dai.lesson03;

import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 6:04
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}
class MyPaint extends Frame{

    public void loadFrame(){
        setBounds(200,200,600,400);
        setVisible(true);
    }
    //画笔
    @Override
    public void paint(Graphics g) {
        //画笔 需要有颜色 画笔可以画画
        g.setColor(Color.pink);
        g.drawString("想见你！",100,100);
//        g.drawOval(100,100,100,100);
        g.fillOval(100,100,100,100);//实心的圆

        g.setColor(Color.green);
        g.fillRect(150,200,200,200);

        //养成习惯，画笔用完，将它还原到最初的颜色 黑色

    }
}
