package other.study.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setVisible(true);
        frame.setBounds(300,300, 500, 500);
        frame.setBackground(new Color(24, 92, 160));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //组件-按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //把按钮add进去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        //设置为流式布局
        //frame.setLayout(new FlowLayout()); // 默认为center (1)
        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // left (0)
        //frame.setLayout(new FlowLayout(2)); // 2为right


    }
}
