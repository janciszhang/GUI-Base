package other.study.gui.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint{
    public static void main(String[] args)
    {
        new MyPaint().loadFrame();

    }
}


class MyPaint extends Frame
{
    //Frame
    public void loadFrame()
    {
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
    }

    //画笔
    @Override
    public void paint(Graphics g){
        //画笔，需要有颜色，画笔才可以画画
        g.setColor(Color.RED);
        g.drawOval(100,100,100,100);//空心圆
        g.fillOval(200,100,100,100);//实心圆

        g.setColor(Color.GREEN);
        g.fillRect(150,200,200,200);

        //养成习惯，画笔用完，将他还原到最初的颜色（黑色）
        g.setColor(Color.BLACK);
    }
}
