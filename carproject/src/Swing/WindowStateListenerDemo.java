package Swing;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class WindowStateListenerDemo extends JFrame{
	public WindowStateListenerDemo() {
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowStateListener(new myWindowState());
		setVisible(true);
	}
	
	private class myWindowState implements WindowStateListener{
		@Override
		public void windowStateChanged(WindowEvent e) {
			// TODO Auto-generated method stub
			int old = e.getOldState();
			String oldText;
			switch (old) {
			case Frame.NORMAL:
				oldText = "����ҳ��";
				break;
			case Frame.MAXIMIZED_BOTH:
				oldText = "���";
				break;
			default:
				oldText = "��С��";
				break;
			}
			System.out.println(oldText);
		}
		
	}
	public static void main(String[] args) {
		new WindowStateListenerDemo();
	}
}
