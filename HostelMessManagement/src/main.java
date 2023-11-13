
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JList;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.border.LineBorder;

public class main extends JFrame {
	
	JFrame frame;
	JFrame displayField;
	ImageIcon image;
	
	private JPanel contentPane;
	private JLabel Title;
	private JLabel add;
	private JLabel lblNewLabel_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
					frame.setVisible(true);
					//Image i = new Image();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main() {
		
		/**frame = new JFrame("image display test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			image = new ImageIcon(getClass().getResource("food_1_page.jpg"));
			displayField = new JLabel(image);
			frame.add(displayField);
		}
		catch(Exception e) {
			System.out.println("Image cannot be found");
		}
		frame.pack();
		
		frame.setVisible(true); */
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 603, 490);
		
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setForeground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		  
		
		Title = new JLabel("BMSCE HOSTEL MESS");
		Title.setForeground(Color.BLACK);
		Title.setFont(new Font("Tahoma", Font.BOLD, 20));
		Title.setBackground(Color.DARK_GRAY);
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setBounds(10, 25, 619, 40);
		contentPane.add(Title);
		
		JButton btnStudent = new JButton("STUDENT");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				student_login info = new student_login();
				student_login.main(null);
			}
		});
		btnStudent.setForeground(new Color(100, 149, 237));
		btnStudent.setBounds(246, 117, 125, 23);
		contentPane.add(btnStudent);
		
		JButton btnStaff = new JButton("STAFF");
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staff_login info=new staff_login();
				staff_login.main(null);
			}
		});
		btnStaff.setForeground(new Color(100, 149, 237));
		btnStaff.setBounds(246, 165, 125, 23);
		contentPane.add(btnStaff);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminl info = new adminl();
				adminl.main(null);
				
			}
		});
		btnAdmin.setForeground(new Color(100, 149, 237));
		btnAdmin.setBounds(246, 215, 125, 23);
		contentPane.add(btnAdmin);
		
		JLabel welcome = new JLabel("Welcome to BMSCE!");
		welcome.setForeground(Color.BLACK);
		welcome.setFont(new Font("Tahoma", Font.BOLD, 16));
		welcome.setBounds(226, 76, 471, 30);
		contentPane.add(welcome);
		
		
		add = new JLabel("ADDRESS:");
		add.setBackground(UIManager.getColor("Label.background"));
		add.setForeground(Color.BLACK);
		add.setFont(new Font("Tahoma", Font.BOLD, 16));
		add.setBounds(180, 372, 208, 30);
		contentPane.add(add);
		
		lblNewLabel_1 = new JLabel("Basavanagudi, Bangalore - 560004");
		lblNewLabel_1.setBackground(UIManager.getColor("TextArea.background"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(180, 389, 211, 40);
		contentPane.add(lblNewLabel_1);
		

		
		JLabel lblNewLabel = new JLabel("CONTACT:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(398, 372, 155, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("EMAIL: bmshm@gmail.com\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(398, 389, 181, 40);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("PHONE: 080-485248521");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(398, 413, 144, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblimage = new JLabel("New label");
		lblimage.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblimage.setLabelFor(this);
		lblimage.setToolTipText("");
		lblimage.setVerticalAlignment(SwingConstants.TOP);
		lblimage.setVerticalTextPosition(SwingConstants.TOP);
		lblimage.setIconTextGap(6);
		lblimage.setBackground(new Color(153, 153, 153));
		lblimage.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblimage.setIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\food1.jpg"));
		lblimage.setDisabledIcon(new ImageIcon("C:\\Users\\diyas\\Downloads\\food_1_page.jpg"));
		lblimage.setBounds(0, 0, 595, 460);
		contentPane.add(lblimage);
	}
}
