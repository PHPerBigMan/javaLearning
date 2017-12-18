package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// 绝对布局
public class Absolute extends JFrame{
	public Absolute() {
		// TODO Auto-generated constructor stub
	  setTitle("绝对布局");
	  setBounds(100, 200, 300, 150);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  Container container = getContentPane();
	  container.setLayout(null);
	  // 添加button
	  JButton b1 = new JButton("按钮1"), b2 = new JButton("按钮2");
	  // 设置按钮的位置
	  b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JNew jNew = new JNew();
		}
	});
	  b1.setBounds(20, 20, 250, 50);
	  b2.setBounds(30, 50, 100, 120);
	  container.add(b1);
	  container.add(b2);
	  // 设置显示
	  setVisible(true);
	}
	
	class JNew{
		
		public JNew() {
			// TODO Auto-generated constructor stub
			JFrame nFrame  = new JFrame("新的窗体");
			nFrame.setBounds(20, 100, 500, 500);
			nFrame.setVisible(true);
		}
		
	}
	public static void main(String[] args) {
		new Absolute();
	}
}
