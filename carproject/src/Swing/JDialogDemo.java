package Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JDialogDemo extends JDialog{
	public JDialogDemo(JFrame jFrame) {
		super(jFrame, "�л�", true);
		// TODO Auto-generated constructor stub
		Container container = getContentPane();
		container.add(new JLabel("This is A JDialog"));
		setTitle("�л��û�");
		setBounds(100, 100, 150, 100);
	}
	
	public static void main(String[] args) {
		// ����������
		JFrame jFrame = new JFrame();
		// ��ȡ����������
		Container c = jFrame.getContentPane();
		jFrame.setTitle("���Ǹ�����");
		// �޸ĸ����ڵ�λ��
		jFrame.setBounds(400, 200, 300, 240);
		// ����������Ӱ�ť
				JButton jButton = new JButton("����л��û�");
				c.add(jButton);
				// ���ð�ťʱ���¼�
				jButton.addActionListener(new ActionListener() {
					// ����ť��ӵ������෽��
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JDialogDemo jDialogDemo = new JDialogDemo(jFrame);
						jDialogDemo.setVisible(true);
					}
				});
		// �����ڿɼ�
		jFrame.setVisible(true);
//		c.add(new JLabel("������ "));
		
	}
}
