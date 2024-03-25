package t7_windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Test2 extends JFrame {

	private JPanel contentPane;
		public Test2() {
			super("회원가입");
			setSize(600, 480);
			getContentPane().setLayout(null);
			
			JPanel pn1 = new JPanel();
			pn1.setBounds(31, 25, 520, 74);
			getContentPane().add(pn1);
			pn1.setLayout(null);
			
			JLabel label_1 = new JLabel("회원가입");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setFont(new Font("굴림", Font.PLAIN, 23));
			label_1.setBounds(95, -20, 310, 84);
			pn1.add(label_1);
			
			JPanel pn2 = new JPanel();
			pn2.setBounds(31, 109, 520, 233);
			getContentPane().add(pn2);
			pn2.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("성명");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(54, 38, 121, 40);
			pn2.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("성명");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(54, 88, 121, 40);
			pn2.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("성명");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(54, 151, 121, 40);
			pn2.add(lblNewLabel_2);
			
			JPanel panel = new JPanel();
			panel.setBounds(31, 352, 525, 79);
			getContentPane().add(panel);
			
			setVisible(true);
			
		}
		
	public static void main(String[] args) {
		new Test2();

	}
}
