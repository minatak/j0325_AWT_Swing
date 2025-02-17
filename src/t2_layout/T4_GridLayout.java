package t2_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T4_GridLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5, btnExit;
	Label lbl1;
	
	public T4_GridLayout() {
		
		super("GridLayout 연습!");
		setLayout(new GridLayout(2,3));	// 2행 3열
		setBounds(300, 350, 300, 350);
		
		btn1 = new Button("첫번째");
		btn2 = new Button("두번째");
		btn3 = new Button("세번째");
		btn4 = new Button("네번째");
		btnExit = new Button("종료");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btnExit);
		
		setVisible(true);
		
		addWindowListener(this);
		btnExit.addActionListener(this);
			
	}
	
	
	public static void main(String[] args) {
		new T4_GridLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
