package com.Dai.lesson06;

import javax.swing.*;
import java.awt.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 20:09
 */
public class TextComboboxDemo01 extends JFrame {
    public TextComboboxDemo01(){

        Container container = this.getContentPane();

        JComboBox status = new JComboBox();

        status.addItem(null);
        status.addItem("正在热映");
        status.addItem("已下架");
        status.addItem("即将上映");

        container.add(status);

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextComboboxDemo01();
    }
}
