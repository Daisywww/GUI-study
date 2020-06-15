package com.Dai.lesson06;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @auther Daisy
 * @date 2020/6/15 - 20:16
 *
 * 应用场景
 *      选择地区，或者一些单个选项
 *      列表，展示信息，一般是动态扩容
 */
public class TextComboboxDemo02 extends JFrame {
    public TextComboboxDemo02(){

        Container container = this.getContentPane();

        //生成列表的内容
        //String[] contents = {"1","2","3"};
        Vector contents = new Vector();
        JList jList = new JList(contents);

        contents.add("jkk");
        contents.add("bjt");
        contents.add("Niko");

        container.add(jList);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextComboboxDemo02();
    }
}