package other.study.gui.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Swing
public class JFrameDemo
{
    //init() 初始化
    public void init(){
        //顶级窗口JFrame
        JFrame jf = new JFrame("这是一个JFrame窗口");
        jf.setVisible(true);
        jf.setBounds(200,200,300,300);
        //jf.setBackground(Color.BLUE);// 颜色无法显示，颜色需要加在容器里！！！

        //关闭事件（swing有自带的默认关闭窗口监听方法）
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置文字JLabel
        JLabel label = new JLabel("欢迎来到英雄联盟");
        jf.add(label);
    }
    public static void main(String[] args)
    {
        //建立一个窗口
        new JFrameDemo().init();
    }
}
