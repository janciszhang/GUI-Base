package other.study.gui.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//窗口监听
public class TestWindow
{
    public static void main(String[] args)
    {
        new WindowFrame();
    }
}

class WindowFrame extends Frame
{
    public WindowFrame(){
        setVisible(true);
        setBounds(200,200,300,300);
        setBackground(Color.BLUE);

        //addWindowListener(new MyWindowListener());

        this.addWindowListener(new WindowAdapter()
        {
            //匿名内部类，最推荐！

            //重写父类WindowAdapter的全部方法

            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("windowClosing");
            }

            //激活窗口 （点别的界面，再点这个界面）
            @Override
            public void windowActivated(WindowEvent e)
            {
                WindowFrame source = (WindowFrame) e.getSource(); //注意强制转换
                source.setTitle("被激活了");
                System.out.println("windowActivated");
            }

//            @Override
//            public void windowOpened(WindowEvent e)
//            {
//                System.out.println("windowOpened 一般监听不到");
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e)
//            {
//                System.out.println("windowClosed 强制结束会监听不到");
//            }
//
//
//
//            @Override
//            public void windowIconified(WindowEvent e)
//            {
//                System.out.println("与图标相关，现在不需要");
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e)
//            {
//                System.out.println("与图标相关，现在不需要");
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e)
//            {
//                System.out.println("不常用");
//            }
//
//            @Override
//            public void windowStateChanged(WindowEvent e)
//            {
//                System.out.println("不常用");
//            }
//
//            @Override
//            public void windowGainedFocus(WindowEvent e)
//            {
//                System.out.println("不常用");
//            }
//
//            @Override
//            public void windowLostFocus(WindowEvent e)
//            {
//                System.out.println("不常用");
//            }
        });
    }

//    class MyWindowListener extends WindowAdapter{
//        @Override
//        public void windowClosing(WindowEvent e)
//        {
//            setVisible(false);//隐藏窗口，通过按钮隐藏当前窗口
//            System.exit(0);//正常退出
//        }
//    }
}
