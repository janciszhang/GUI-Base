package other.study.gui.lesson04;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame
{
    public ImageIconDemo(){
        //获取图片地址
        JLabel label = new JLabel("ImageIcon");
        URL url = ImageIconDemo.class.getResource("bkq.jpg"); //必须记住这个写法！！！

        ImageIcon imageIconDemo = new ImageIcon(url); //注意名字不要冲突了
        label.setIcon(imageIconDemo);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setBounds(1100,100,500,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new ImageIconDemo();
    }


}
