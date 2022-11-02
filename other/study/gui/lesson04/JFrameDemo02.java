package other.study.gui.lesson04;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo02
{
    public static void main(String[] args)
    {
        new MyJFrame2().init();
    }
}

class MyJFrame2 extends JFrame{
    public void init(){
        this.setVisible(true);
        this.setBounds(200,200,300,300);

        //获得一个容器！！！
        Container contentPane = this.getContentPane();
        contentPane.setBackground(Color.YELLOW);//颜色要在容器里

        JLabel label = new JLabel("欢迎来到英雄联盟");
        this.add(label);

        //标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);

    }
}
