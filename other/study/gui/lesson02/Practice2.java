package other.study.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 代码的优化： 面对过程：用num1，num2，num3。
 * 面对对象：用Calculator calculator。
 * 再优化：用内部类（把外部类放进内部，加修饰） - 更好地包装！
 */

//简易计算器
public class Practice2
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();


    }
}


//计算器类
class Calculator extends Frame
{
    //属性
    TextField num1, num2, num3;

    public Calculator()
    {
        //3 TextField, 1 Button, 1 Label
        num1 = new TextField(10); //字符数10，最多写10位
        num2 = new TextField(10); //字符数10
        num3 = new TextField(20); //字符数20
        Button button = new Button("=");
        Label label = new Label("+");


        //加动作监听器
        button.addActionListener(new MyCalculatorMonitor());


        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

    }


    //监听器类
    //内部类最大的好处：可以畅通无阻地访问外部的属性和方法
    private class MyCalculatorMonitor implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            //1. 获得两个加数
            //2. 计算+运算结果，把结果放到第三个框
            //3. 清除前两个框
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
            num1.setText("");
            num2.setText("");
        }


    }
}


