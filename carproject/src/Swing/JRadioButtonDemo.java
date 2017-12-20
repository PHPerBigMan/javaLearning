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
		setTitle("��ѡ��ť");
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		// ��ʼ������ѡ��ť
		JRadioButton jRadioButton = new JRadioButton("��ͨ����");
		JRadioButton jRadioButton2 = new JRadioButton("���ܷ���");
		
		// ����ѡ��ť�������ť�� ʵ�ֵ�ѡ
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton);
		buttonGroup.add(jRadioButton2);
		container.add(jRadioButton);
		container.add(jRadioButton2);
		
		// ��ʼ������ѡ�¼�
		jRadioButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jRadioButton.isSelected()) {
					JOptionPane.showMessageDialog(JRadioButtonDemo.this, "��ѡ������ͨ����");
				}
			}
		});
		
		jRadioButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(jRadioButton2.isSelected()) {
					JOptionPane.showMessageDialog(JRadioButtonDemo.this, "��ѡ���˼��ܷ���");
				}
			}
		});
		
		// ���õ�һ����ѡΪĬ��ѡ��
		jRadioButton.setSelected(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JRadioButtonDemo();
	}
}
