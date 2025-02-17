package t1_awt_Basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 종료버튼 처리 (인터페이스를 이용)
public class Test3 extends Frame implements WindowListener {
	
	// 객체를 생성시에 UI설계 처리를 한다
	public Test3() {
		super("AWT 프레임");
		setSize(300, 250); // 프레임의 크기(폭, 높이) : 픽셀단위
		
		setVisible(true);
		
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new Test3();
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); // 실행종료(윈도우 창 닫기)
	}

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
