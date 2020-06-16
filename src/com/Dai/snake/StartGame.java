package com.Dai.snake;

import javax.swing.*;

/**
 * @auther Daisy
 * @date 2020/6/15 - 20:49
 * 游戏的主启动类
 */
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setBounds(10,10,900,720);
        frame.setResizable(false);//窗口大小不可变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new GamePanel());

        frame.setVisible(true);
    }
}
