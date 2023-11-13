
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import jdbcFood.FoodDAO;
import jdbcStaff.StaffDAO;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class deletestaff {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletestaff window = new deletestaff();
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
	public deletestaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("StaffID\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(27, 96, 97, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 101, 196, 20);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deletestaff1();
				JOptionPane.showMessageDialog(null, "Staff deleted Succesfully",
                        "Staff Deleted", JOptionPane.INFORMATION_MESSAGE);
				adminp info = new adminp();
				adminp.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(149, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	protected void deletestaff1()
	{
		int sid=Integer.parseInt(textField.getText());
		try
		{
			StaffDAO s=new StaffDAO();
			s.deleteStaff(sid);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
