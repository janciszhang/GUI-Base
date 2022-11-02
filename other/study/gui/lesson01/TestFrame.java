package other.study.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame {


    public static void main(String[] args) {

        //Frame
        Frame frame = new Frame("Welcome");

        //设置可见性!!! （默认false，不可见）
        frame.setVisible(true);

        //设置初始位置 （不设置默认左上角）
        frame.setLocation(200, 200);

        //设置w,h
        frame.setSize(400, 400);

        //一次性设置初始位置和w, h
        frame.setBounds(200, 200, 400, 400);

        //设置Color, Color需要new （不设置默认白色）
        frame.setBackground(new Color(42, 64, 142));


        //设置大小固定 (不设置默认可变)
        frame.setResizable(false);

        //监听事件，监听窗口关闭Closing事件 System.exit(0)
        //适配器模式：
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


    }


}
