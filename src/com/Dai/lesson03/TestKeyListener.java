package com.Dai.lesson03;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @auther Daisy
 * @date 2020/6/15 - 16:57
 */
public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame();
    }
}
class KeyFrame extends Frame{
    public KeyFrame(){
        setBounds(100,200,300,400);
        setVisible(true);

        this.addKeyListener(new KeyAdapter() {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                //获取键盘按下的键,键盘当前的码
                int keyCode = e.getKeyCode();//不需要记录这个数值，直接使用静态属性 VK_XXX
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
                //根据按下不同操作，产生不同结果
            }
        });
    }
}
