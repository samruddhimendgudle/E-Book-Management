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
import javax.swing.JTextArea;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 0, 1500, 800);
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
				Myprofile mp =new Myprofile();
				mp.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton signout = new JButton("Sign Out");
		signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thankyou rp=new Thankyou();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		signout.setBackground(Color.LIGHT_GRAY);
		signout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signout.setBounds(10, 462, 176, 45);
		contentPane.add(signout);
		
		JButton fback = new JButton("Feedback");
		fback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feedback hp =new Feedback();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		fback.setBackground(Color.LIGHT_GRAY);
		fback.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fback.setBounds(10, 369, 176, 45);
		contentPane.add(fback);
		mprofile.setBounds(10, 282, 176, 45);
		contentPane.add(mprofile);
		
		JButton home = new JButton("HOME");
		home.setBackground(Color.LIGHT_GRAY);
		home.setFont(new Font("Tahoma", Font.PLAIN, 20));
		home.setBounds(10, 193, 176, 45);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Homepage hp =new Homepage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\back6.png"));
		lblNewLabel_1.setBounds(0, -11, 212, 812);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("Steps To Buy A Books...");
		lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_8.setBounds(240, 413, 350, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("1. Register on E-Book Store");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(289, 453, 281, 45);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("2. Login with valid Username ");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_1.setBounds(289, 508, 413, 45);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("and Password");
		lblNewLabel_9_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_1_1.setBounds(310, 540, 413, 45);
		contentPane.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("3. Select the Book you want to buy ");
		lblNewLabel_9_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_2.setBounds(289, 595, 318, 45);
		contentPane.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("4. Fill your details and buy book");
		lblNewLabel_9_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9_2_1.setBounds(289, 650, 318, 45);
		contentPane.add(lblNewLabel_9_2_1);
		
		JLabel lblNewLabel_10 = new JLabel("\r\n");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\lbl.png"));
		lblNewLabel_10.setBounds(1132, 384, 368, 379);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\ebk1.jpg"));
		lblNewLabel_11.setBounds(222, 135, 379, 251);
		contentPane.add(lblNewLabel_11);
		
		JButton btnBuyBooks = new JButton("Buy Books");
		btnBuyBooks.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBuyBooks.setBackground(Color.LIGHT_GRAY);
		btnBuyBooks.setBounds(694, 508, 318, 56);
		btnBuyBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buybooks bb=new Buybooks();
				bb.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnBuyBooks);
		
		JButton btnViewBookDetails = new JButton("View Book Details");
		btnViewBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View bb=new View ();
				bb.setVisible(true);
				setVisible(false);
			}
		});
		btnViewBookDetails.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnViewBookDetails.setBackground(Color.LIGHT_GRAY);
		btnViewBookDetails.setBounds(694, 613, 318, 59);
		contentPane.add(btnViewBookDetails);
		
		JTextArea txtrtheMoreThat = new JTextArea();
		txtrtheMoreThat.setText("“The more that you read, the more things you will know.\r\n\r\n“Books are a uniquely portable magic.” \r\n\r\n“Today a reader, tomorrow a leader.” \r\n\r\n“The best advice I ever got was that knowledge is power and to keep reading.” - ...\r\n“Reading is to the mind what exercise is to the body.” ");
		txtrtheMoreThat.setFont(new Font("Cambria", Font.PLAIN, 25));
		txtrtheMoreThat.setBounds(806, 132, 657, 254);
		contentPane.add(txtrtheMoreThat);
	}
}
