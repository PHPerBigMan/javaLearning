package Swing;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelSetIcon extends JFrame{
	// 创建 窗体
	public LabelSetIcon() {
		// TODO Auto-generated constructor stub
		setTitle("JLabel设置图片");
		//设置 关闭后
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 获取窗体
		Container container = getContentPane();
		// 添加图片
		JLabel jLabel = new JLabel();
		// 开始添加图片 使用 ImageIcon
		ImageIcon imageIcon = new ImageIcon("src/imgs/2.jpg");
		jLabel.setIcon(imageIcon);
		// 添加图片至窗体中
		container.add(jLabel);
		 setBounds(100, 200, 100, 100);
		 // 窗体显示可见
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelSetIcon();
	}
}
