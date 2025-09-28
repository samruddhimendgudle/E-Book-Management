package com.ajpproject;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Loginpage extends JFrame {
	private JTextField username1;
	private JPasswordField passwordField;
public static String username;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginpage frame = new Loginpage();
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
	public Loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 1000, 800);
		JPanel contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(139, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton ulogin = new JButton("LOGIN");
		ulogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 username = username1.getText();
				String confirmpassword = passwordField.getText();
				DBconnection db = new DBconnection();
				ResultSet re = db.logindata(username, confirmpassword);
				try {
					if(re.next()) {
					Dashboard db1 = new Dashboard ();
						db1.setVisible(true);
						setVisible(false);
					}else
					{
						JOptionPane.showMessageDialog(null,"invalid");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration rp=new Registration();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(831, 106, 155, 43);
		contentPane.add(btnNewButton);
			
		ulogin.setBackground(Color.GREEN);
		ulogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ulogin.setBounds(119, 452, 138, 54);
		contentPane.add(ulogin);
		
		username1 = new JTextField();
		username1.setForeground(Color.LIGHT_GRAY);
		username1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		username1.setText("Enter Username");
		username1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(username1.getForeground()!=Color.black) {
					if(username1.getText().equals("Enter Username")) {
						username1.setText(" ");
					}
					
				}
				username1.setForeground(Color.black);
			}
		});
		username1.setOpaque(false);
		username1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		username1.setBackground(new Color(255, 255, 255));
		username1.setBounds(247, 216, 220, 52);
		contentPane.add(username1);
		username1.setColumns(10);
		JLabel pwd = new JLabel("Password   :");
		pwd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pwd.setBounds(99, 334, 136, 43);
		contentPane.add(pwd);
		
		JLabel uname = new JLabel("UserName :");
		uname.setFont(new Font("Tahoma", Font.PLAIN, 25));
		uname.setBounds(99, 235, 138, 33);
		contentPane.add(uname);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setForeground(new Color(139, 0, 139));
		panel.setBounds(0, 0, 986, 96);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\lllllogin.png"));
		lblNewLabel_4.setBounds(0, 0, 94, 96);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(344, 10, 218, 57);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\userlogin.jpg"));
		lblNewLabel_1.setBounds(913, -11, 100, 107);
		panel.add(lblNewLabel_1);
		
		JButton ucancel = new JButton("CANCEL");
		ucancel.setBackground(new Color(255, 0, 0));
		ucancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ucancel.setBounds(284, 452, 138, 54);
		contentPane.add(ucancel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\registra.png"));
		lblNewLabel_2.setBounds(585, 159, 401, 633);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setOpaque(false);
		passwordField.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(passwordField.getForeground()!=Color.black) {
					if(passwordField.getText().equals("Enter Password")) {
						passwordField.setText(" ");
					}
					
				}
				passwordField.setForeground(Color.black);
			}
		});
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		passwordField.setBounds(249, 346, 218, 33);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\username.png"));
		lblNewLabel_3.setBounds(44, 225, 45, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\password.png"));
		lblNewLabel_3_1.setBounds(44, 334, 45, 43);
		contentPane.add(lblNewLabel_3_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(tglbtnNewToggleButton.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
				
			
		tglbtnNewToggleButton.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\eye_icon (3).png"));
		tglbtnNewToggleButton.setBounds(479, 339, 57, 38);
		contentPane.add(tglbtnNewToggleButton);
	}
}
