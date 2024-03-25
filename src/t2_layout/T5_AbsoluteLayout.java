package t2_layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T5_AbsoluteLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btnExit;
	
	public T5_AbsoluteLayout() {
		super("사용자 지정 레이아웃");
		setLayout(null); // 사용자 지정 레이아웃(수동레이아웃)
		setBounds(400, 300, 350, 400);
		
		btn1 = new Button("첫번째");
		btn2 = new Button("두번째");
		btn3 = new Button("세번째");
		btn4 = new Button("네번째");
		btnExit = new Button("종료");
		btn1.setBounds(100, 100, 150, 30);
		btn2.setBounds(100, 140, 150, 30);
		btn3.setBounds(100, 180, 150, 30);
		btn4.setBounds(100, 220, 150, 30);
		btnExit.setBounds(100, 260, 30, 30);
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
		new T5_AbsoluteLayout();
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


