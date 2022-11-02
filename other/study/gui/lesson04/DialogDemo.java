package other.study.gui.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame
{
    public DialogDemo(){
        this.setVisible(true);
        this.setBounds(200,200,700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //JFrame容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);
        //Button
        JButton button = new JButton("点击弹出一个对话框");//创建
        button.setBounds(30,30,200,50);

        //点击这个按钮的时候，弹出弹窗
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //弹窗
                new MyDialog();
            }
        });
        container.add(button);


    }

    public static void main(String[] args)
    {
        new DialogDemo();
    }
}

class MyDialog extends JDialog{
    public MyDialog(){
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        //this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//弹窗默认自带关闭功能，添加会报错！！！

        Container container = this.getContentPane();
        container.setLayout(null);

        JLabel label = new JLabel("好好学习天天向上");
        label.setBounds(50,50,400,400);
        container.add(label);

    }
}
