package com.ajpproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton SignUp = new JButton("SIGNUP");
		SignUp.setForeground(new Color(0, 0, 255));
		SignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration rp=new Registration();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		SignUp.setBackground(new Color(240, 255, 255));
		SignUp.setBounds(574, 131, 117, 44);
		contentPane.add(SignUp);
		
		
		JButton Login = new JButton("LOGIN");
		Login.setForeground(new Color(0, 0, 255));
		Login.setFont(new Font("Tahoma", Font.BOLD, 20));
		Login.setBackground(new Color(240, 255, 255));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Loginpage ls=new Loginpage();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		Login.setBounds(448, 131, 116, 44);
		contentPane.add(Login);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 786, 90);
		panel.setBackground(new Color(135, 206, 235));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\h3.png"));
		lblNewLabel_3.setBounds(652, -12, 124, 109);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("E-Book Management");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel_2.setBounds(222, 0, 323, 78);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -12, 124, 109);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\h3.png"));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(new Color(240, 255, 240));
		lblNewLabel_1.setBounds(0, 89, 786, 664);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\home4"));
		contentPane.add(lblNewLabel_1);
		
		
	}
}
