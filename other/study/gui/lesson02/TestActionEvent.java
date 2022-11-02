package other.study.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLOutput;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮，触发事件
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(200, 200, 500, 500);

        Button button = new Button("Click");
        frame.add(button, BorderLayout.CENTER);

        //addActionListener()需要一个ActionListener，所以需要构造一个ActionListener
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        windowClose(frame);

    }


    //监听关闭窗口的事件
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}

//动作监听ActionListener
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaaa");
    }
}
