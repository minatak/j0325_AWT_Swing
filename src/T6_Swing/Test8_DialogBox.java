package T6_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Test8_DialogBox extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel lblMsg;
	
	public Test8_DialogBox() {
		super("DialogBox 연습");
		setLayout(new GridLayout(2, 1));
		setSize(400, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		
		pn1 = new JPanel();
		btn1 = new JButton("경고");
		btn2 = new JButton("입력");
		btn3 = new JButton("종료");
		btn4 = new JButton("종료(예/아니오)");
		btn5 = new JButton("예/아니오/취소");
		
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btn5);
		
		pn2 = new JPanel();
		lblMsg = new JLabel("메세지가 출력됩니다.", JLabel.CENTER);
		pn2.add(lblMsg);
		
		add(pn1);
		add(pn2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// -------------------------- setVisible을 기준으로 위쪽은 디자인(UI) --------------------------------
		setVisible(true);
		// --------------------------------- 아래쪽은 메소드(처리할 내용) -------------------------------------
		
		// 경고메세지
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("경고버튼을 누르셨습니다.");
//				JOptionPane.showMessageDialog(null, "경고합니다!!!!!!!!!!!!!!!!!!!!!!");
				JOptionPane.showMessageDialog(null, "경고합니다.", "경고메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		
		// 입력 메소드
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMsg.setText("입력버튼을 누르셨습니다.");
				
				String mid = JOptionPane.showInputDialog(null, "아이디를 입력하세용", "입력창", JOptionPane.INFORMATION_MESSAGE);
				if(mid != null) lblMsg.setText("아이디 : " + mid);
			}
		});
		
		// 종료 버튼 처리
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 예/아니오 버튼 처리
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {   
				lblMsg.setText("종료 여부 확인");
				
				int ans = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "작업 종료창", JOptionPane.YES_NO_OPTION);
				if(ans == 0) {
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
					System.exit(0);
				}
				else {
					JOptionPane.showMessageDialog(null, "작업을 계속합니다");
				}
			}
		});
		
		// 예/아니오/취소 메소드 
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {   
				
				// 0:예, 1:아니오, 2:취소
				int ans = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "작업 종료창", JOptionPane.YES_NO_CANCEL_OPTION);
				if(ans == 0) {
					JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
					System.exit(0);
				}
				else if(ans == 1) {
					JOptionPane.showMessageDialog(null, "작업을 계속합니다.");
				}
				else {
					JOptionPane.showMessageDialog(null, "종료를 취소합니다.");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new Test8_DialogBox();
	}
}
