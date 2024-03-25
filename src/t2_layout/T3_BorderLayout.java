package t2_layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T3_BorderLayout extends Frame implements WindowListener, ActionListener {
	Button btn1, btn2, btn3, btn4, btn5;
	
	public T3_BorderLayout() {
		super("BorderLayout 연습!");
		setBounds(300, 250, 300, 300);
		setLayout(new BorderLayout());
		
		btn1 = new Button("북쪽");
		btn2 = new Button("남쪽");
		btn3 = new Button("서쪽");
		btn4 = new Button("동쪽");
		btn5 = new Button("중앙(종료)");
		
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		add(btn3, BorderLayout.WEST);
//		add(btn4, BorderLayout.EAST);
//		add(btn5, BorderLayout.CENTER);
		
		add(btn4, "East"); // 이렇게 쓰는 방법도 있다. 주의) 대/소문자 틀리면 안됨
		add(btn5, "Center");
		
		setVisible(true);
		
		addWindowListener(this);
		btn5.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new T3_BorderLayout();
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
