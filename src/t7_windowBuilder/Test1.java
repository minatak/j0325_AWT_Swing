package t7_windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1 extends JFrame {

	private JPanel contentPane;
	private JTextField textName, textKor, textEng, textMat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Test1();
	}

	/**
	 * Create the frame.
	 */
	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("그린중학교 성적표");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(63, 30, 648, 40);
		contentPane.add(title);
		
		JLabel Name = new JLabel("성명");
		Name.setFont(new Font("굴림", Font.PLAIN, 19));
		Name.setHorizontalAlignment(SwingConstants.CENTER);
		Name.setBounds(94, 105, 200, 67);
		contentPane.add(Name);
		
		textName = new JTextField();
		textName.setBounds(306, 107, 366, 67);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JButton btnReset = new JButton("다시 입력");
		
		btnReset.setBounds(315, 474, 176, 52);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("종료");
		btnExit.setBounds(535, 474, 176, 52);
		contentPane.add(btnExit);
		
		JButton btnInput = new JButton("입력");
		btnInput.setBounds(108, 474, 176, 52);
		contentPane.add(btnInput);
		
		textKor = new JTextField();
		textKor.setColumns(10);
		textKor.setBounds(303, 198, 366, 67);
		contentPane.add(textKor);
		
		JLabel Kor = new JLabel("국어점수");
		Kor.setHorizontalAlignment(SwingConstants.CENTER);
		Kor.setFont(new Font("굴림", Font.PLAIN, 19));
		Kor.setBounds(91, 196, 200, 67);
		contentPane.add(Kor);
		
		textEng = new JTextField();
		textEng.setColumns(10);
		textEng.setBounds(303, 277, 366, 67);
		contentPane.add(textEng);
		
		JLabel Eng = new JLabel("영어점수");
		Eng.setHorizontalAlignment(SwingConstants.CENTER);
		Eng.setFont(new Font("굴림", Font.PLAIN, 19));
		Eng.setBounds(91, 275, 200, 67);
		contentPane.add(Eng);
		
		textMat = new JTextField();
		textMat.setColumns(10);
		textMat.setBounds(303, 368, 366, 67);
		contentPane.add(textMat);
		
		JLabel Mat = new JLabel("수학점수");
		Mat.setHorizontalAlignment(SwingConstants.CENTER);
		Mat.setFont(new Font("굴림", Font.PLAIN, 19));
		Mat.setBounds(91, 366, 200, 67);
		contentPane.add(Mat);
		
		setVisible(true);
		
		// 다시입력버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textName.setText("");
				textKor.setText("");
				textEng.setText("");
				textMat.setText("");
			}
		});
		
		// 종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "작업을 종료하시겠습니까?", "", JOptionPane.YES_NO_OPTION);
				if(ans == 0) 	System.exit(0);
			}
		});
	}
}
