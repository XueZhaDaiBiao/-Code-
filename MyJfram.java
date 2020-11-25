package StudentManageSy;

import javax.swing.*;
import java.awt.*;

public class MyJfram extends JFrame {
    public MyJfram(){
        //窗体设置
        setSize(1000,800);
        setLocation(500,100);
        //////////////////////////
        Container container = getContentPane();
        LogingJpan logingJpan = new LogingJpan();

        container.add(logingJpan, BorderLayout.CENTER);

        //////////////////////////


       setResizable(false);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}
