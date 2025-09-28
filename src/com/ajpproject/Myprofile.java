package com.ajpproject;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.UIManager;

public class Myprofile extends JFrame {

	private JPanel contentPane;
	private JTextField tfname;
	private JTextField tlname;
	private JTextField tpno;
	private JTextField temail;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myprofile frame = new Myprofile();
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
	public Myprofile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 0, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 786, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("My Profile");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(286, 10, 302, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(700, 0, 76, 81);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\reg3.png"));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\mp1.png"));
		lblNewLabel_2.setBounds(0, 0, 88, 79);
		panel.add(lblNewLabel_2);
		
		JLabel fname = new JLabel("First Name :");
		fname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fname.setBounds(192, 131, 175, 48);
		contentPane.add(fname);
		
		JLabel lname = new JLabel("Last Name :");
		lname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lname.setBounds(192, 202, 128, 39);
		contentPane.add(lname);
		
		JLabel pno = new JLabel("Phone No. :");
		pno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pno.setBounds(192, 267, 128, 29);
		contentPane.add(pno);
		
		JLabel email = new JLabel("Email :");
		email.setFont(new Font("Tahoma", Font.PLAIN, 24));
		email.setBounds(192, 329, 119, 29);
		contentPane.add(email);
		
		JLabel dob = new JLabel("DOB :");
		dob.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dob.setBounds(192, 390, 106, 39);
		contentPane.add(dob);
		
		JLabel gender = new JLabel("Gender :");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 24));
		gender.setBounds(192, 460, 119, 29);
		contentPane.add(gender);
		
		JLabel add = new JLabel("Address :");
		add.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add.setBounds(192, 499, 129, 59);
		contentPane.add(add);
		
		JLabel pwd = new JLabel("Password :");
		pwd.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pwd.setBounds(192, 580, 128, 48);
		contentPane.add(pwd);
		
		tfname = new JTextField();
		tfname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfname.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		tfname.setOpaque(false);
		tfname.setBounds(357, 138, 242, 39);
		contentPane.add(tfname);
		tfname.setColumns(10);
		
		tlname = new JTextField();
		tlname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tlname.setOpaque(false);
		tlname.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(211, 211, 211), null, null, null));
		tlname.setColumns(10);
		tlname.setBounds(357, 204, 242, 39);
		contentPane.add(tlname);
		
		tpno = new JTextField();
		tpno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tpno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tpno.setOpaque(false);
		tpno.setColumns(10);
		tpno.setBounds(357, 264, 242, 39);
		contentPane.add(tpno);
		
		temail = new JTextField();
		temail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		temail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		temail.setOpaque(false);
		temail.setColumns(10);
		temail.setBounds(357, 326, 242, 39);
		contentPane.add(temail);
		ButtonGroup bn= new ButtonGroup();
		
	
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setOpaque(false);
		textField.setBounds(357, 511, 242, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(222, 690, 223, 48);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setOpaque(false);
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(357, 587, 242, 39);
		contentPane.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(357, 392, 242, 39);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setOpaque(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(357, 452, 242, 39);
		contentPane.add(textField_2);
	}
}