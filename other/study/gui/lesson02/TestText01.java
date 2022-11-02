package other.study.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestText01 {
    //Frame
    private static Frame myFrame(String title, int x, int y, int w, int h) {
        Frame frame = new Frame(title);
        frame.setVisible(true);
        frame.setBounds(x, y, w, h);
        return frame;
    }

    //监听关闭窗口的事件
    private static void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        //启动
        Frame frame = new MyFrame();



    }


}

class MyFrame extends Frame {
    public MyFrame() {
        setVisible(true);
        setSize(500,500);
        //pack();
        TextField textField = new TextField();
        add(textField);

        //监听这个文本框输入的文字
        MyMonitor2 myMonitor2 = new MyMonitor2();
        //按下回车，就会触发这个输入框事件
        textField.addActionListener(myMonitor2);

        //设置替换密码
        textField.setEchoChar('*');

    }
}

class MyMonitor2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource(); //获得一些资源，返回一个对象
        System.out.println(field.getText());//获得输入框的文本

        //回车后清空输入
        field.setText(""); //null ""

    }
}
