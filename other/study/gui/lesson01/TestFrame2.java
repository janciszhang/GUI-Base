package other.study.gui;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.BLUE);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.GREEN);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.RED);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.ORANGE);
    }



}

class MyFrame extends Frame{
    //计数窗口数量
    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color){
        super("Myframe" + (++id));
        setVisible(true);
        setBounds(x, y, w, h);
        setBackground(color);

    }

}
