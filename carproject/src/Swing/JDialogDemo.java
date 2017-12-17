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
		super(jFrame, "切换", true);
		// TODO Auto-generated constructor stub
		Container container = getContentPane();
		container.add(new JLabel("This is A JDialog"));
		setTitle("切换用户");
		setBounds(100, 100, 150, 100);
	}
	
	public static void main(String[] args) {
		// 创建父窗口
		JFrame jFrame = new JFrame();
		// 获取父窗口容器
		Container c = jFrame.getContentPane();
		jFrame.setTitle("这是父窗口");
		// 修改父窗口的位置
		jFrame.setBounds(400, 200, 300, 240);
		// 给父窗口添加按钮
				JButton jButton = new JButton("点击切换用户");
				c.add(jButton);
				// 设置按钮时间事件
				jButton.addActionListener(new ActionListener() {
					// 给按钮添加的匿名类方法
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JDialogDemo jDialogDemo = new JDialogDemo(jFrame);
						jDialogDemo.setVisible(true);
					}
				});
		// 父窗口可见
		jFrame.setVisible(true);
//		c.add(new JLabel("请点击看 "));
		
	}
}
