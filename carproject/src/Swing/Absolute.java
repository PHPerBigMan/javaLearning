package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// ���Բ���
public class Absolute extends JFrame{
	public Absolute() {
		// TODO Auto-generated constructor stub
	  setTitle("���Բ���");
	  setBounds(100, 200, 300, 150);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  Container container = getContentPane();
	  container.setLayout(null);
	  // ���button
	  JButton b1 = new JButton("��ť1"), b2 = new JButton("��ť2");
	  // ���ð�ť��λ��
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
	  // ������ʾ
	  setVisible(true);
	}
	
	class JNew{
		
		public JNew() {
			// TODO Auto-generated constructor stub
			JFrame nFrame  = new JFrame("�µĴ���");
			nFrame.setBounds(20, 100, 500, 500);
			nFrame.setVisible(true);
		}
		
	}
	public static void main(String[] args) {
		new Absolute();
	}
}
