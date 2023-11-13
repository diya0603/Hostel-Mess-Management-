
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import jdbcFood.Food;
import jdbcFood.FoodDAO;
import jdbcStaff.Staff;
import jdbcStaff.StaffDAO;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class insertstaff {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertstaff window = new insertstaff();
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
	public insertstaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 245, 238));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStaffid = new JLabel("StaffID\r\n");
		lblStaffid.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStaffid.setBounds(10, 11, 97, 26);
		frame.getContentPane().add(lblStaffid);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(10, 51, 97, 26);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(10, 88, 97, 26);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth\r\n");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDateOfBirth.setBounds(10, 125, 97, 26);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblAddress = new JLabel("Address\r\n");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(10, 162, 97, 26);
		frame.getContentPane().add(lblAddress);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(163, 16, 196, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 56, 196, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 93, 196, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(163, 130, 196, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(163, 167, 196, 20);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addstaff1();
				JOptionPane.showMessageDialog(null, "Staff added Succesfully",
                        "Staff Added", JOptionPane.INFORMATION_MESSAGE);
				adminp info = new adminp();
				adminp.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(163, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Mobile");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 197, 97, 26);
		frame.getContentPane().add(lblNewLabel);
		
		textField_5 = new JTextField();
		textField_5.setBounds(163, 198, 196, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
	protected void addstaff1()
	{
		int sid=Integer.parseInt(textField.getText());
		String fname=textField_1.getText();
		String lname=textField_2.getText();
		String dob=textField_3.getText();
		String address=textField_4.getText();
		String mobile=textField_5.getText();
		Staff s=new Staff(sid,lname,fname,dob,address,mobile,0);
		try
		{
			StaffDAO s1=new StaffDAO();
			s1.addStaff(s);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
