package ArithmeticGui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MultiplyGuiExercise5 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MultiplyGuiExercise5 window = new MultiplyGuiExercise5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MultiplyGuiExercise5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(12, 11, 169, 46);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(255, 11, 169, 46);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(143, 134, 113, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(48, 65, 75, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Num2");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(309, 68, 75, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(143, 163, 113, 35);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JButton btnNewButton = new JButton("MULTIPLY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans = num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e ) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			}
		}
		});
		btnNewButton.setBounds(133, 84, 131, 39);
		frame.getContentPane().add(btnNewButton);
	}
}
