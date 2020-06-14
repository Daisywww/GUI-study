package com.Dai.lesson02;

import java.awt.*;
import java.awt.event.*;

/**
 * @auther Daisy
 * @date 2020/6/14 - 20:59
 * oop原则 : 组合大于继承
 */
public class TextCalc {

    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

//计算器类
class Calculator extends Frame {

    //属性
    TextField num1,num2,num3;
    //方法
    public void loadFrame(){
        num1 = new TextField(10);//字符数
        num2 = new TextField(10);//字符数
        num3 = new TextField(10);//字符数
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener());
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //监听器类
    //内部类最大的好处，就是可以畅通无阻的访问外部的属性和方法
    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //获得加数和被加数
            //将这个值 + 运算后，放到第三个框
            //清楚前两个框
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());

            num3.setText(""+(n1+n2));
            num1.setText("");
            num2.setText("");

        }
    }
}


