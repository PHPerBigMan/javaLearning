package Swing;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScorllDemo extends JFrame{
	/*
	 * 滚动面板
	 */
	public JScorllDemo() {
		// TODO Auto-generated constructor stub
		setBounds(400,200,400,200);
		Container container = getContentPane();
		// 添加文本域
		JTextArea jTextArea = new JTextArea();
		// 添加滚动面板
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		container.add(jScrollPane);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JScorllDemo();
	}
}
