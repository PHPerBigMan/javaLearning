package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonDemo extends JFrame{
	public JRadioButtonDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 300, 300, 300);
		setTitle("单选按钮");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		// 开始创建单选按钮
		JRadioButton jRadioButton = new JRadioButton("普通发送");
		JRadioButton jRadioButton2 = new JRadioButton("加密发送");
		
		// 将单选按钮添加至按钮组 实现单选
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		container.add(jRadioButton);
		container.add(jRadioButton2);
		
		// 开始监听单选事件
		jRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(JRadioButtonDemo.this, "您选择了普通发送");
				}
			}
		});
		
		jRadioButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jRadioButton2.isSelected()) {
					JOptionPane.showMessageDialog(JRadioButtonDemo.this, "您选择了加密发送");
				}
			}
		});
		
		// 设置第一个单选为默认选中
		jRadioButton.setSelected(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRadioButtonDemo();
	}
}
