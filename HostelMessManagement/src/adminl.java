
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class adminl extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	protected JFrame frmLogin;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminl frame = new adminl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public adminl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel frmLoginSystem = new JLabel("ADMIN LOGIN");
		frmLoginSystem.setFont(new Font("Tahoma", Font.BOLD, 18));
		frmLoginSystem.setForeground(new Color(255, 255, 255));
		frmLoginSystem.setBounds(219, 45, 229, 37);
		contentPane.add(frmLoginSystem);
		
		JLabel lblNewLabel_1 = new JLabel("Username\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(43, 143, 173, 37);
		contentPane.add(lblNewLabel_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(251, 143, 229, 30);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(43, 238, 173, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JLabel txtPassword = null;
				String password = txtPassword.getText();
				//JLabel txtUsername = null;
				String username = txtUsername.getText();
				if(password.contentEquals("king") && username.contains("one")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					
					adminp info = new adminp();
					adminp.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid login details", "login error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(30, 349, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(Color.BLACK);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(251, 351, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setForeground(Color.BLACK);
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmLogin = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLogin, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnexit.setBounds(458, 351, 89, 23);
		contentPane.add(btnexit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\admin.jpg"));
		lblNewLabel.setBounds(0, 0, 600, 403);
		contentPane.add(lblNewLabel);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(251, 238, 229, 30);
		contentPane.add(txtPassword);
	}
}
