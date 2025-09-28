package com.ajpproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Buybooks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buybooks frame = new Buybooks();
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
	public Buybooks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 0, 1500, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton mprofile = new JButton("My Profile");
		mprofile.setBackground(Color.LIGHT_GRAY);
		mprofile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mprofile.setForeground(Color.BLACK);
		mprofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Myprofile ls=new Myprofile();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnBuyBooks = new JButton("Buy Book");
		btnBuyBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Booking bk=new Booking();
				bk.setVisible(true);
				setVisible(false);
			}
		});
		btnBuyBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuyBooks.setBackground(Color.LIGHT_GRAY);
		btnBuyBooks.setBounds(10, 596, 176, 45);
		contentPane.add(btnBuyBooks);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBounds(238, 187, 190, 258);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\a1.jpg"));
		lblNewLabel_9.setBounds(0, 45, 200, 213);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Price=250");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setBackground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10.setBounds(0, -1, 190, 49);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\dbook.jpg"));
		lblNewLabel_8.setBounds(5, 143, 181, 172);
		contentPane.add(lblNewLabel_8);
		
		JButton signout = new JButton("Sign Out");
		signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thankyou ls=new Thankyou();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		signout.setBackground(Color.LIGHT_GRAY);
		signout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signout.setBounds(10, 677, 176, 45);
		contentPane.add(signout);
		
		JButton fback = new JButton("Feedback");
		fback.setBackground(Color.LIGHT_GRAY);
		fback.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fback.setBounds(10, 499, 176, 45);
		contentPane.add(fback);
		mprofile.setBounds(10, 413, 176, 45);
		contentPane.add(mprofile);
		
		JButton home = new JButton("HOME");
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage ls=new Homepage();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		home.setBackground(Color.LIGHT_GRAY);
		home.setFont(new Font("Tahoma", Font.PLAIN, 20));
		home.setBounds(10, 326, 176, 45);
		contentPane.add(home);
		
		JLabel lblNewLabel_7 = new JLabel("E-Book Store");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_7.setBounds(527, 16, 350, 59);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("A Book is a Gift you can open again and again");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel_6.setBounds(780, 63, 550, 59);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\we.png"));
		lblNewLabel_5_1.setBounds(1317, -7, 159, 128);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\we.png"));
		lblNewLabel_5.setBounds(146, -14, 159, 128);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("E-Book Store\r\n");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 91, 176, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(43, 52, 64, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("WELCOME\r\n  ");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_2.setBounds(10, 10, 148, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\back9.png"));
		lblNewLabel.setBounds(0, -14, 1506, 152);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\back6.png"));
		lblNewLabel_1.setBounds(0, -11, 212, 856);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 139, 139));
		panel_1.setBounds(453, 187, 190, 258);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1b1.jpg"));
		lblNewLabel_9_1.setBounds(0, 45, 190, 213);
		panel_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Price=400");
		lblNewLabel_10_1.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_1.setBackground(Color.ORANGE);
		lblNewLabel_10_1.setBounds(0, -1, 190, 49);
		panel_1.add(lblNewLabel_10_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBounds(663, 187, 190, 258);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_9_2 = new JLabel("New label");
		lblNewLabel_9_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a2.jpg"));
		lblNewLabel_9_2.setBounds(0, 45, 190, 213);
		panel_2.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_10_2 = new JLabel("Price=380");
		lblNewLabel_10_2.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2.setBackground(Color.ORANGE);
		lblNewLabel_10_2.setBounds(0, -1, 190, 49);
		panel_2.add(lblNewLabel_10_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBounds(875, 187, 190, 258);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_9_3 = new JLabel("New label");
		lblNewLabel_9_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a3.jpg"));
		lblNewLabel_9_3.setBounds(0, 45, 190, 213);
		panel_3.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_10_3 = new JLabel("Price=546");
		lblNewLabel_10_3.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_3.setBackground(Color.ORANGE);
		lblNewLabel_10_3.setBounds(0, -1, 190, 49);
		panel_3.add(lblNewLabel_10_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(0, 139, 139));
		panel_4.setBounds(1086, 187, 190, 258);
		contentPane.add(panel_4);
		
		JLabel lblNewLabel_9_4 = new JLabel("New label");
		lblNewLabel_9_4.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a4.jpg"));
		lblNewLabel_9_4.setBounds(0, 43, 190, 215);
		panel_4.add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_10_4 = new JLabel("Price=290");
		lblNewLabel_10_4.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_4.setBackground(Color.ORANGE);
		lblNewLabel_10_4.setBounds(0, -1, 190, 49);
		panel_4.add(lblNewLabel_10_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(0, 139, 139));
		panel_5.setBounds(1296, 187, 190, 258);
		contentPane.add(panel_5);
		
		JLabel lblNewLabel_9_5 = new JLabel("New label");
		lblNewLabel_9_5.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a5.jpg"));
		lblNewLabel_9_5.setBounds(0, 45, 190, 213);
		panel_5.add(lblNewLabel_9_5);
		
		JLabel lblNewLabel_10_5 = new JLabel("Price=189");
		lblNewLabel_10_5.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_5.setBackground(Color.ORANGE);
		lblNewLabel_10_5.setBounds(0, -1, 190, 49);
		panel_5.add(lblNewLabel_10_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(0, 139, 139));
		panel_2_1.setBounds(238, 513, 190, 258);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("New label");
		lblNewLabel_9_2_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a7.jpg"));
		lblNewLabel_9_2_1.setBounds(0, 46, 190, 212);
		panel_2_1.add(lblNewLabel_9_2_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Price=389");
		lblNewLabel_10_2_1.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1.setBounds(0, -1, 190, 49);
		panel_2_1.add(lblNewLabel_10_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 139, 139));
		panel_2_1_1.setBounds(453, 513, 190, 258);
		contentPane.add(panel_2_1_1);
		
		JLabel lblNewLabel_9_2_1_1 = new JLabel("New label");
		lblNewLabel_9_2_1_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a8.jpg"));
		lblNewLabel_9_2_1_1.setBounds(0, 46, 200, 212);
		panel_2_1_1.add(lblNewLabel_9_2_1_1);
		
		JLabel lblNewLabel_10_2_1_1 = new JLabel("Price=677");
		lblNewLabel_10_2_1_1.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1_1.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1_1.setBounds(0, -1, 190, 49);
		panel_2_1_1.add(lblNewLabel_10_2_1_1);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBackground(new Color(0, 139, 139));
		panel_2_1_2.setBounds(663, 513, 190, 258);
		contentPane.add(panel_2_1_2);
		
		JLabel lblNewLabel_9_2_1_2 = new JLabel("New label");
		lblNewLabel_9_2_1_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a9.jpg"));
		lblNewLabel_9_2_1_2.setBounds(0, 42, 190, 216);
		panel_2_1_2.add(lblNewLabel_9_2_1_2);
		
		JLabel lblNewLabel_10_2_1_2 = new JLabel("Price=860");
		lblNewLabel_10_2_1_2.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1_2.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1_2.setBounds(0, -1, 190, 49);
		panel_2_1_2.add(lblNewLabel_10_2_1_2);
		
		JPanel panel_2_1_3 = new JPanel();
		panel_2_1_3.setLayout(null);
		panel_2_1_3.setBackground(new Color(0, 139, 139));
		panel_2_1_3.setBounds(887, 513, 190, 258);
		contentPane.add(panel_2_1_3);
		
		JLabel lblNewLabel_9_2_1_3 = new JLabel("New label");
		lblNewLabel_9_2_1_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a15.png"));
		lblNewLabel_9_2_1_3.setBounds(0, 50, 190, 208);
		panel_2_1_3.add(lblNewLabel_9_2_1_3);
		
		JLabel lblNewLabel_10_2_1_3 = new JLabel("Price=2899");
		lblNewLabel_10_2_1_3.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1_3.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1_3.setBounds(0, -1, 190, 49);
		panel_2_1_3.add(lblNewLabel_10_2_1_3);
		
		JPanel panel_2_1_4 = new JPanel();
		panel_2_1_4.setLayout(null);
		panel_2_1_4.setBackground(new Color(0, 139, 139));
		panel_2_1_4.setBounds(1097, 513, 190, 258);
		contentPane.add(panel_2_1_4);
		
		JLabel lblNewLabel_9_2_1_4 = new JLabel("New label");
		lblNewLabel_9_2_1_4.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a13.jpg"));
		lblNewLabel_9_2_1_4.setBounds(0, 44, 190, 214);
		panel_2_1_4.add(lblNewLabel_9_2_1_4);
		
		JLabel lblNewLabel_10_2_1_4 = new JLabel("Price=250");
		lblNewLabel_10_2_1_4.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1_4.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1_4.setBounds(0, -1, 190, 49);
		panel_2_1_4.add(lblNewLabel_10_2_1_4);
		
		JPanel panel_2_1_5 = new JPanel();
		panel_2_1_5.setLayout(null);
		panel_2_1_5.setBackground(new Color(0, 139, 139));
		panel_2_1_5.setBounds(1296, 513, 190, 258);
		contentPane.add(panel_2_1_5);
		
		JLabel lblNewLabel_9_2_1_5 = new JLabel("New label");
		lblNewLabel_9_2_1_5.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\1a14.jpg"));
		lblNewLabel_9_2_1_5.setBounds(0, 45, 190, 226);
		panel_2_1_5.add(lblNewLabel_9_2_1_5);
		
		JLabel lblNewLabel_10_2_1_5 = new JLabel("Price=600");
		lblNewLabel_10_2_1_5.setFont(new Font("Cambria", Font.BOLD, 25));
		lblNewLabel_10_2_1_5.setBackground(Color.ORANGE);
		lblNewLabel_10_2_1_5.setBounds(0, -1, 190, 49);
		panel_2_1_5.add(lblNewLabel_10_2_1_5);
		
		
	}
}
