package Exception;

import java.io.PrintStream;

import javax.swing.JOptionPane;

public class NohumanException extends Exception{
	String message;
	public NohumanException(String message) {
//		super(message);
		this.message = message;
	}
	
	@Override
	public void printStackTrace(PrintStream s) {
		// TODO Auto-generated method stub
		super.printStackTrace(s);
		JOptionPane.showMessageDialog(null, message, "¥ÌŒÛ–≈œ¢", JOptionPane.ERROR_MESSAGE);
	}
}
