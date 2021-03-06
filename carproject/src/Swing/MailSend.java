package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MailSend extends JFrame{
	public MailSend() {
		// TODO Auto-generated constructor stub
		setTitle("邮件发送");
		setBounds(350, 50, 880, 660);
		setResizable(false);
		Container container = getContentPane();
		container.setLayout(new GridLayout(2,1));
		// 开始添加面板
		// 顶部按钮组
		JPanel jPanel = new JPanel(new GridLayout(1,1));
		JButton jButtonTop = new JButton("发送");
		// 设置
		jPanel.add(jButtonTop);
		
		// 右边布局
		JPanel jPanel2 = new JPanel(new GridLayout(1, 1));
		// 最右边添加文本域
		JTextArea jTextArea = new JTextArea();
		jPanel2.add(jTextArea);
		JButton jButtonRight = new JButton("最右侧按钮");
		jPanel2.add(jButtonRight);
		container.add(jPanel);
		container.add(jPanel2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MailSend();
	}
}
