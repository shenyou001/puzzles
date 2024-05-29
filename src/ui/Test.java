package ui;

import javax.swing.*;

/**
 * @Author: SillyCat
 * @Date: 2024/5/27 22:14
 * @Description:
 */
public class Test {
    public static void main (String [] args)
    {
         //创建一个游戏的主界面
        JFrame gameJframe =new JFrame();
        //JavaBean 类描述

        gameJframe.setSize(603,680);
        gameJframe.setVisible(true);
        // 创建一个登录页面
        JFrame LoginJframe=new JFrame();
        LoginJframe.setSize(488,430);
        LoginJframe.setVisible(true);
        //创建一个注册页面
        JFrame registerJframe=new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);



    }
}