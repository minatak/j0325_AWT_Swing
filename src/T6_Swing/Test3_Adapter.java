package T6_Swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Test3_Adapter extends JFrame {
	
	public Test3_Adapter() {
		super("스윙연습1");
		
		setBounds(300,250,300,250);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test3_Adapter();
	}
	
}
