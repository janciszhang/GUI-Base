package other.study.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionTwo {
    public static void main(String[] args) {
        //两个按钮，实现同一个监听
        //开始 停止
        Frame frame = new Frame("开始-停止");
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.pack();

        //动作监听
        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        //可以显示的定义触发会返回的命令（若不设置则默认获取按钮内容）
        button2.setActionCommand("button-stop");





    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //e.getActionCommand()
        System.out.println("按钮被点击了： " + e.getActionCommand());

        if (e.getActionCommand().equals("start")){
            System.out.println("abc");


        }

    }
}
