package StudentManageSy;

import javax.swing.*;
import java.awt.*;

public class OptetionPanl extends JPanel {
    public OptetionPanl(){
       // setSize(1000,700);
        //设置容器
        setLayout(new BorderLayout());
        //创建一个菜单
        JMenuBar jMenuBar = new JMenuBar();
        JMenu open = new JMenu("打开");
        JMenu view = new JMenu("设置");
        JMenu help = new JMenu("帮助");
        JMenu about = new JMenu("关于");
        JMenu communtion = new JMenu("客服");
        JMenuItem newData = new JMenuItem("新建表");
        JMenuItem del = new JMenuItem("删除");
        JMenuItem file = new JMenuItem("文件");
        JMenuItem save = new JMenuItem("保存");
        JMenuItem anthore = new JMenuItem("另存为");
        jMenuBar.add(open);
        jMenuBar.add(view);
        jMenuBar.add(help);
        jMenuBar.add(about);
        jMenuBar.add(communtion);
        open.add(newData);
        open.addSeparator();
        open.add(del);
        open.addSeparator();
        open.add(file);
        open.addSeparator();
        open.add(save);
        open.addSeparator();
        open.add(anthore);
        ////////////////////////
        //添加组件
        LeftView leftView = new LeftView();
        SearchPan searchPan = new SearchPan();
        ////////////////////////
        //将组件添加到面板中
        setBackground(Color.cyan);
        add(jMenuBar,BorderLayout.NORTH);
        add(leftView,BorderLayout.WEST);
        add(searchPan,BorderLayout.CENTER);
    }

}
