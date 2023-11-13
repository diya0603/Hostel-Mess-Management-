

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminp extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnStaff;
	private JButton btnWorks;
	private JButton btnServes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminp frame = new adminp();
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
	public adminp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 621, 426);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("FOOD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				food info = new food();
				food.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(202, 63, 170, 32);
		contentPane.add(btnNewButton);
		
		btnStaff = new JButton("STAFF");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminstaff info = new adminstaff();
				adminstaff.main(null);
				
			}
		});
		btnStaff.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStaff.setBounds(202, 139, 170, 32);
		contentPane.add(btnStaff);
		
		btnWorks = new JButton("WORKS");
		btnWorks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				works info = new works();
				works.main(null);
				
			}
		});
		btnWorks.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnWorks.setBounds(202, 210, 170, 32);
		contentPane.add(btnWorks);
		
		btnServes = new JButton("SERVES");
		btnServes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				serves info = new serves();
				serves.main(null);
				
			}
		});
		btnServes.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnServes.setBounds(202, 284, 170, 32);
		contentPane.add(btnServes);
	}

}
