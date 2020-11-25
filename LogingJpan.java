package StudentManageSy;

import com.oracle.deploy.update.Updater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogingJpan extends JPanel {
    //登录，注册
    JButton loging = new JButton("登录");
    JButton registe = new JButton("注册");
    //文本框
    JTextField username = new JTextField(16);
    JPasswordField myth = new JPasswordField(16);
    //标签
    JLabel nameIn = new JLabel("用户名",JLabel.RIGHT);
    JLabel mimaIn = new JLabel("密码",JLabel.RIGHT);
    JLabel log0 = new JLabel();
    public LogingJpan(){
        ImageIcon log = new ImageIcon("D:\\Java项目\\work\\src\\IMage\\1.png");
        log0.setIcon(log);
        //容器设置
        setLayout(null);
        setBackground(Color.GRAY);
        /////////////////////
        //组件设置
        nameIn.setFont(new Font("楷体",0,16));
        mimaIn.setFont(new Font("楷体",0,16));
        /////////////////////
        //组件的放置
        nameIn.setBounds((1000-nameIn.getWidth())/3,(800-nameIn.getHeight())/3,80,80);
        mimaIn.setBounds((1000-mimaIn.getWidth())/3,(800-mimaIn.getHeight())/3+32,80,80);
        username.setBounds((1000-username.getWidth())/2-70,(800-username.getHeight())/3+30,160,20);
        myth.setBounds((1000-myth.getWidth())/2-70,(800-username.getHeight())/3+70,160,20);
        loging.setBounds((1000-myth.getWidth())/2+13,(800-username.getHeight())/3+100,60,26);
        registe.setBounds((1000-myth.getWidth())/2+108,(800-username.getHeight())/3+100,60,26);
        /////////////////////
        //密码判断
        loging.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String copyami = String.valueOf(myth.getPassword());
                //if(copyami.equals("cyz")&&username.getText().equals("cyz")){
                    removeAll();
                    setLayout(new BorderLayout());
                    OptetionPanl optetionPanl = new OptetionPanl();
                    add(optetionPanl,BorderLayout.CENTER);
                    repaint();
                updateUI();
              /* }else{
                    JOptionPane.showMessageDialog(new JPanel(),"密码或用户名错误");
                }*/
            }
        });
        /////////////////////
        //组件添加到面板
        add(nameIn);
        add(mimaIn);
        add(username);
        add(myth);
        add(loging);
        add(registe);
    }
}
