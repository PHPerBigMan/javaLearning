package Swing;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelSetIcon extends JFrame{
	// ���� ����
	public LabelSetIcon() {
		// TODO Auto-generated constructor stub
		setTitle("JLabel����ͼƬ");
		//���� �رպ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// ��ȡ����
		Container container = getContentPane();
		// ���ͼƬ
		JLabel jLabel = new JLabel();
		// ��ʼ���ͼƬ ʹ�� ImageIcon
		ImageIcon imageIcon = new ImageIcon("src/imgs/2.jpg");
		jLabel.setIcon(imageIcon);
		// ���ͼƬ��������
		container.add(jLabel);
		 setBounds(100, 200, 100, 100);
		 // ������ʾ�ɼ�
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelSetIcon();
	}
}
