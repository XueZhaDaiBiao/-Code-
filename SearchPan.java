package StudentManageSy;

import javax.swing.*;
import java.awt.*;

public class SearchPan extends JPanel {
    //表格面板
    JPanel table = new JPanel();
    String[] title = new String[]{"姓名","学号","学院/系","课程"} ;
    String[][] data = new String[17][4];
    //标签
    JLabel name = new JLabel("姓名");
    JLabel id = new JLabel("学号");
    JLabel section = new JLabel("学院/系");
    JLabel leason = new JLabel("课程");
    //文本框
    JTextField namein = new JTextField(16);
    JTextField idin = new JTextField(16);
    JTextField sectionin = new JTextField(16);
    JTextField leasonin = new JTextField(16);
    public SearchPan(){
        setLayout(null);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(450,200));
        /////////////////////
        //表格
        JTable jTable = new JTable(data,title);
       // jTable.setPreferredSize(new Dimension(750,300));
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(760,300));
        //table设置
        table.add(jScrollPane);
        //JPanelTable添加组件
        //标签设置
        name.setBounds(20,20,80,20);
        namein.setBounds(50,20,100,20);
        id.setBounds(160,20,80,20);
        idin.setBounds(190,20,100,20);
        section.setBounds(300,20,80,20);
        sectionin.setBounds(350,20,100,20);
        leason.setBounds(460,20,80,20);
        leasonin.setBounds(490,20,100,20);
        table.setBounds(20,100,750,300);
        //添加控件
        add(name);
        add(namein);
        add(id);
        add(idin);
        add(section);
        add(sectionin);
        add(leason);
        add(leasonin);
        add(table);
    }

    private void addSeparator() {
    }

   /* public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        SearchPan searchPan = new SearchPan();
        jFrame.add(searchPan);
        jFrame.setSize(800,800);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setVisible(true);
    }*/
}
