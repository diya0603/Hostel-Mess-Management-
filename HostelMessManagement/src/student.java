

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbcFood.Food;
import jdbcServes.Serves;
import jdbcServes.ServesDAO;
import jdbcWorks.Works;
import jdbcWorks.WorksDAO;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class student extends JFrame {

	private JPanel contentPane;
	private JTextField txthostel;
	private JTextField txtday;
	private JTextField txttime;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student frame = new student();
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
	public student() {
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblhostel = new JLabel("Hostel");
		lblhostel.setForeground(new Color(0, 0, 0));
		lblhostel.setBackground(new Color(0, 0, 255));
		lblhostel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblhostel.setBounds(31, 38, 54, 14);
		contentPane.add(lblhostel);
		
		JLabel lblday = new JLabel("Day");
		lblday.setForeground(new Color(0, 0, 0));
		lblday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblday.setBounds(41, 69, 46, 14);
		contentPane.add(lblday);
		
		JLabel lbltime = new JLabel("Time");
		lbltime.setForeground(new Color(0, 0, 0));
		lbltime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbltime.setBounds(39, 100, 46, 14);
		contentPane.add(lbltime);
		
		txthostel = new JTextField();
		txthostel.setBounds(117, 36, 153, 20);
		contentPane.add(txthostel);
		txthostel.setColumns(10);
		
		txtday = new JTextField();
		txtday.setBounds(117, 67, 153, 20);
		contentPane.add(txtday);
		txtday.setColumns(10);
		
		txttime = new JTextField();
		txttime.setBounds(117, 98, 153, 20);
		contentPane.add(txttime);
		txttime.setColumns(10);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				showfood();
				
			}
		});
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnsubmit.setForeground(Color.RED);
		btnsubmit.setBounds(153, 214, 89, 23);
		contentPane.add(btnsubmit);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(31, 151, 149, 45);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(249, 151, 99, 40);
		contentPane.add(lblNewLabel_1);
	}
	protected void showfood()
	{
		int hid=Integer.parseInt(txthostel.getText());
		String day=txtday.getText();
		String time=txttime.getText();
		Serves temp=new Serves(0,hid,day,time);
		List<Food> list=new ArrayList<>();
		String fname="";
		String V_N="";
		try
		{
			ServesDAO s=new ServesDAO();
			list=s.selectFood(temp);
			fname=list.get(0).getfname();
			V_N=list.get(0).getV_N();
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		lblNewLabel.setText(fname);
		lblNewLabel_1.setText(V_N);
		
	}
}
