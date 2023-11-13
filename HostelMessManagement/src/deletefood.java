

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import jdbcFood.FoodDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class deletefood {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deletefood window = new deletefood();
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
	public deletefood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(152, 251, 152));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("FoodID\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 99, 97, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(177, 104, 196, 20);
		frame.getContentPane().add(textField);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deletefood1();
				JOptionPane.showMessageDialog(null, "Food deleted Succesfully",
                        "Food deleted", JOptionPane.INFORMATION_MESSAGE);
				adminp info = new adminp();
				adminp.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(154, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	protected void deletefood1()
	{
		int fid=Integer.parseInt(textField.getText());
		try
		{
			FoodDAO f=new FoodDAO();
			f.deleteFood(fid);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
