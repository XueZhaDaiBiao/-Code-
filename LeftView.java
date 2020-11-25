package StudentManageSy;

import javax.swing.*;
import java.awt.*;

public class LeftView extends JPanel {
    JButton search = new JButton("查询");
    JButton add = new JButton("添加");
    JButton del = new JButton("删除");
    JButton change = new JButton("修改");
    public LeftView(){
        setLayout(new FlowLayout(10,10,10));
        setPreferredSize(new Dimension(200,800));
        setBackground(Color.LIGHT_GRAY);
        ////////////////////////////
        //设置组件
        search.setPreferredSize(new Dimension(180,20));
        add.setPreferredSize(new Dimension(180,20));
        del.setPreferredSize(new Dimension(180,20));
        change.setPreferredSize(new Dimension(180,20));

        search.setBackground(Color.GREEN);
        add.setBackground(Color.GREEN);
        del.setBackground(Color.GREEN);
        change.setBackground(Color.GREEN);
        //添加组件
        add(search);
        add(add);
        add(del);
        add(change);

    }
}
