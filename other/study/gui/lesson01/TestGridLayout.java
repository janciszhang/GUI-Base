package other.study.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setVisible(true);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(30, 69, 168));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        //设置网格式布局
        frame.setLayout(new GridLayout(3,2));
        //frame.pack(); //Java函数，自动选最优布局（最小间距填充）

    }
}
