package T6_Swing;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Test2 extends JFrame implements WindowListener {
	
	public Test2() {
		super("스윙연습1");
		
		setBounds(300,250,300,250);
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { System.exit(0);}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}
}
