

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbcWorks.Works;
import jdbcWorks.WorksDAO;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class staff extends JFrame {

	private JPanel contentPane;
	private JTextField txtstaffid;
	private JTextField txtday;
	private JTextField txttime;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staff frame = new staff();
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
	public staff() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 128, 114));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStaff = new JLabel("Staff_ID");
		lblStaff.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblStaff.setForeground(Color.WHITE);
		lblStaff.setBounds(68, 43, 60, 14);
		contentPane.add(lblStaff);
		
		JLabel lblday = new JLabel("Day");
		lblday.setForeground(Color.WHITE);
		lblday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblday.setBounds(68, 81, 46, 18);
		contentPane.add(lblday);
		
		JLabel lbltime = new JLabel("Time");
		lbltime.setForeground(Color.WHITE);
		lbltime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbltime.setBounds(68, 128, 46, 14);
		contentPane.add(lbltime);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showhostel();
			}
		});
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnsubmit.setForeground(Color.RED);
		btnsubmit.setBounds(160, 229, 89, 23);
		contentPane.add(btnsubmit);
		
		txtstaffid = new JTextField();
		txtstaffid.setBounds(160, 41, 120, 20);
		contentPane.add(txtstaffid);
		txtstaffid.setColumns(10);
		
		txtday = new JTextField();
		txtday.setBounds(160, 81, 120, 20);
		contentPane.add(txtday);
		txtday.setColumns(10);
		
		txttime = new JTextField();
		txttime.setBounds(160, 126, 120, 20);
		contentPane.add(txttime);
		txttime.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(160, 169, 88, 41);
		contentPane.add(lblNewLabel);
	}
	protected void showhostel()
	{
		int sid=Integer.parseInt(txtstaffid.getText());
		String day=txtday.getText();
		String time=txttime.getText();
		Works temp=new Works(sid,0,day,time);
		String hostel="";
		try
		{
			WorksDAO w=new WorksDAO();
			hostel=w.selectHostel(temp);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		lblNewLabel.setText(hostel);
		
		
	}
}
