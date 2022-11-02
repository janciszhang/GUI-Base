package other.study.gui;

//Panel不能单独存在！！！

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //布局
        Panel panel = new Panel();

        //设置布局
        frame.setLayout(null);

        //Frame设置
        frame.setVisible(true);
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(108, 206, 36));

        //Panel设置（位置相对于frame）
        panel.setBounds(50,50,400, 400);
        panel.setBackground(new Color(99, 0, 147));

        //把Panel加进Frame
        frame.add(panel);

        //监听事件，监听窗口关闭事件 System.exit(0)
        //适配器模式：
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候要做的事情 (Closing不是Closed！！！)
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); // 1是异常退出
            }
        });




    }
}
