package t1_awt_Basic;

import java.awt.Frame;

// 직접 Frame 객체를 상속받아서 작업처리
public class Test2 extends Frame {
	
	// 객체를 생성시에 UI설계 처리를 한다
	public Test2() {
		super("AWT 프레임");
//		setTitle("AWT 프레임");
		setSize(300, 250); // 프레임의 크기(폭, 높이) : 픽셀단위
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
