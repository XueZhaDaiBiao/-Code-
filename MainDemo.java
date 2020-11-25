package StudentManageSy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
* 回顾网格布局
* */
/*
*问题一，为什么JFram不能设置背景色，只能给内容窗格设置背景色
* 解决方法：回顾了解窗体与内容窗格的概念性
* 问题二，为什么setSize不能在有布局的情况下设置组件大小，而setPreferredSize可以
*
 *  */
public class MainDemo extends JFrame{
    public static void GUIshow(){
        MyJfram myJfram = new MyJfram();
    }
    public static void main(String[] args) {
        GUIshow();
    }
}
