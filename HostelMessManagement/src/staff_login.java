

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;


public class staff_login {

	private JFrame frame;
	private JTextField txtstaff;
	private JPasswordField txtPassword;
	protected JFrame frmSTAFF_LOGIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staff_login window = new staff_login();
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
	public staff_login() {
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
		
		JLabel lblstaff = new JLabel("STAFF_LOGIN");
		lblstaff.setForeground(Color.WHITE);
		lblstaff.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblstaff.setBounds(144, 11, 200, 30);
		frame.getContentPane().add(lblstaff);
		
		JLabel lblstaffid = new JLabel("StaffName");
		lblstaffid.setForeground(Color.WHITE);
		lblstaffid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblstaffid.setBounds(51, 88, 96, 14);
		frame.getContentPane().add(lblstaffid);
		
		JLabel lblNpassword = new JLabel("Password");
		lblNpassword.setForeground(Color.WHITE);
		lblNpassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNpassword.setBounds(51, 133, 81, 14);
		frame.getContentPane().add(lblNpassword);
		
		txtstaff = new JTextField();
		txtstaff.setBounds(156, 85, 99, 20);
		frame.getContentPane().add(txtstaff);
		txtstaff.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(159, 130, 96, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(new Color(0, 0, 0));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=txtPassword.getText();
				String username=txtstaff.getText();
				if(password.contains("queen") && username.contains("Sindhu"))
				{
					txtPassword.setText(null);
					txtstaff.setText(null);
					staff info =new staff();
					staff.main(null);
				
			
				}
				else
				{
					JOptionPane.showConfirmDialog(null,"Invalid login","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtstaff.setText(null);
				}
				
			}
		});
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlogin.setBounds(43, 207, 89, 23);
		frame.getContentPane().add(btnlogin);
		
		JButton btnreset = new JButton("Reset");
		btnreset.setForeground(new Color(0, 0, 0));
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtstaff.setText(null);
				txtPassword.setText(null);
			}
		});
		btnreset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnreset.setBounds(166, 207, 89, 23);
		frame.getContentPane().add(btnreset);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setForeground(new Color(0, 0, 0));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSTAFF_LOGIN=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmSTAFF_LOGIN,"Confirmm if u want to exit","Student login",JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
					
				}
			}
		});
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnexit.setBounds(289, 207, 89, 23);
		frame.getContentPane().add(btnexit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 183, 398, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 52, 398, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\13.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\admin.jpg"));
		lblNewLabel_1.setBounds(0, 0, 436, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
