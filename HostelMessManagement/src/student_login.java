

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class student_login {

	private JFrame frame;
	private JTextField txtuser;
	protected JFrame frmSTUDENT_LOGIN;
	private JOptionPane label;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_login window = new student_login();
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
	public student_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane();
		frame.setBounds(100, 100, 450, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblstudent = new JLabel("Student_Login");
		lblstudent.setForeground(Color.WHITE);
		lblstudent.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblstudent.setBounds(98, 0, 191, 36);
		frame.getContentPane().add(lblstudent);
		
		JLabel lbluser = new JLabel("StudentName");
		lbluser.setForeground(Color.WHITE);
		lbluser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbluser.setBounds(27, 58, 127, 28);
		frame.getContentPane().add(lbluser);
		
		JLabel lblpasswor = new JLabel("Password");
		lblpasswor.setForeground(Color.WHITE);
		lblpasswor.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblpasswor.setBounds(27, 116, 82, 28);
		frame.getContentPane().add(lblpasswor);
		
		txtuser = new JTextField();
		txtuser.setBounds(170, 64, 159, 20);
		frame.getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(new Color(0, 0, 0));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=txtPassword.getText();
				String username=txtuser.getText();
				if(password.contains("king") && username.contains("one"))
				{
					txtPassword.setText(null);
					txtuser.setText(null);
					student info=new student();
					student.main(null);
				
					
					
				}
				else
				{
					JOptionPane.showConfirmDialog(null,"Invalid login","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtuser.setText(null);
				}
				
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnlogin.setBounds(30, 192, 89, 23);
		frame.getContentPane().add(btnlogin);
		
		JButton btnreset = new JButton("Reset");
		btnreset.setForeground(new Color(0, 0, 0));
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtuser.setText(null);
			txtPassword.setText(null);
			}
		});
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnreset.setBounds(160, 192, 89, 23);
		frame.getContentPane().add(btnreset);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setForeground(new Color(0, 0, 0));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSTUDENT_LOGIN=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmSTUDENT_LOGIN,"Confirmm if u want to exit","Student login",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
					
				}
				
				
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnexit.setBounds(295, 192, 89, 23);
		frame.getContentPane().add(btnexit);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 168, 414, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(10, 42, 414, 2);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\admin.jpg"));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(0, -11, 434, 237);
		frame.getContentPane().add(lblNewLabel);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPassword.setForeground(Color.BLACK);
		txtPassword.setBounds(178, 122, 151, 20);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\13.jpg"));
		lblNewLabel_1.setBounds(0, 0, 424, 226);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
