package other.study.gui.lesson03;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

//鼠标监听事件
public class TestMouseListener
{
    public static void main(String[] args)
    {
        new MyFrame("画图");
    }
}



class MyFrame extends Frame
{
    //需要ArrayList来存储监听鼠标获得的所有point
    ArrayList points;

    //Frame（需要监听鼠标当前的位置），new ArrayList<>()
    public MyFrame(String title)
    {
        super(title);
        setBounds(200, 200, 600, 500);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        //存鼠标点击的点
        points = new ArrayList<>();

        //add鼠标监听器
        this.addMouseListener(new MyMouseListener());
    }

    //画笔：画出ArrayList points里面存储的所有point（用迭代器Iterator，）
    @Override
    public void paint(Graphics g)
    {
        //画ArrayList points里面所有的point，监听鼠标事件
        Iterator iterator = points.iterator(); //不要用for循环，迭代用迭代器
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();//注意需要强制转换
            g.setColor(Color.BLUE);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加一个point到ArrayList points里
    public void addPaint(Point point){
        points.add(point);
    }

    //监听鼠标事件（内部类）
    //适配器模式：继承实现类，取代implement MouseListener接口（就不需要重写接口里面全部的方法，方便使用）
    private class MyMouseListener extends MouseAdapter
    {
        //监听鼠标按压：按下，弹起，按住不放
        @Override
        public void mousePressed(MouseEvent e)
        {
            MyFrame myFrame = (MyFrame) e.getSource();//注意需要强制转换

            //鼠标点击的时候，在界面画出的点
            //这个点就是鼠标的点
            myFrame.addPaint(new Point(e.getX(), e.getY()));

            //每次点击鼠标都需要重画一遍（画笔只会画一次）
            myFrame.repaint();//刷新
        }
    }


}


