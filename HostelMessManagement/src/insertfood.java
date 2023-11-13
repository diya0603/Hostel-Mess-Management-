

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import jdbcFood.Food;
import jdbcFood.FoodDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class insertfood {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertfood window = new insertfood();
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
	public insertfood() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 240, 230));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FoodID\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 53, 97, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblFoodName = new JLabel("Food Name");
		lblFoodName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFoodName.setBounds(10, 113, 97, 26);
		frame.getContentPane().add(lblFoodName);
		
		JLabel lblVegnonveg = new JLabel("Veg/Non-Veg");
		lblVegnonveg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVegnonveg.setBounds(10, 181, 97, 26);
		frame.getContentPane().add(lblVegnonveg);
		
		textField = new JTextField();
		textField.setBounds(198, 58, 196, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(198, 118, 196, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 186, 196, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addfood1();
				JOptionPane.showMessageDialog(null, "Food added Succesfully",
                        "Food Added", JOptionPane.INFORMATION_MESSAGE);
				adminp info = new adminp();
				adminp.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(149, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	protected void addfood1()
	{
		int fid=Integer.parseInt(textField.getText());
		String fname=textField_1.getText();
		String V_N=textField_2.getText();
		Food temp=new Food(fid,fname,V_N);
		try
		{
			FoodDAO f=new FoodDAO();
			f.addFood(temp);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
