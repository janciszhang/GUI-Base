package other.study.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Practice1 {
    public static void main(String[] args) {
        //Frame
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(300, 400, 400, 300);

        //监听窗口关闭事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Frame布局
        frame.setLayout(new GridLayout(2,1));

        //4 Panel布局
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 3));

        //Add Button布局
        panel1.add(new Button("East-1"), BorderLayout.EAST);
        panel1.add(new Button("West-1"), BorderLayout.WEST);
        panel2.add(new Button("p2-1"));
        panel2.add(new Button("p2-2"));
        panel3.add(new Button("East-3"), BorderLayout.EAST);
        panel3.add(new Button("West-3"), BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("p4-" + i));
        }

        //组合布局
        panel1.add(panel2, BorderLayout.CENTER);
        panel3.add(panel4, BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

    }
}
