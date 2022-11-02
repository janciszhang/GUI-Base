package other.study.gui.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//键盘监听
public class TestKeyListener
{
    public static void main(String[] args)
    {
        new MyKeyFrame();
    }
}

class MyKeyFrame extends Frame{

    public MyKeyFrame(){}
    {
        setVisible(true);
        setBounds(200,0200,300,300);
        setBackground(Color.BLUE);

        //加键盘监听器（适配器模式）
        addKeyListener(new KeyAdapter()
        {
            //键盘按下
            @Override
            public void keyPressed(KeyEvent e)
            {
                //获得键盘按下的键是哪一个，当前键盘的码（每个键都有对应静态属性VK_xxx、码（十进制）、16进制的数，）
                //使用时直接使用静态属性VK_xxx，不需要记数值
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按下了上键");
                }
                //根据按下的不同操作，产生不同结果
            }
        });
    }
}
