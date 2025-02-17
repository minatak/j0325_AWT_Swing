package T5_Adapter;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {
	Button btnExit;
	
	public Test2() {
		super("어뎁터를 활용한 종료");
		setBounds(300, 350, 300, 280);
		
		btnExit = new Button("Exit");
		add(btnExit);
		
		setVisible(true);
		
		// 어댑터를 이용한 윈도우 종료(익명 이너클래스)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { 
				Button btnLabel = (Button) e.getSource();
//				if(btnLabel.setLabel("Stop"); // 이어서 나중에 고치기...
				System.out.println("출발~~~");
				
			}
		});
		
		// 버튼 클릭시 익명클래스를 이용한 종료
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
