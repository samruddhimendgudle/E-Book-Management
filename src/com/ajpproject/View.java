package com.ajpproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.MatteBorder;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField temail;
	private JTextField trate;
	private JTextField taddr;
	private JTextField tpayment;
	private JTextField tdate;
	private JTextField book;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				View frame = new View();
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
	public  View() {
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
			}
		});
		
		JButton btnviewdetails = new JButton("View  Details");
		btnviewdetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnviewdetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnviewdetails.setBackground(Color.LIGHT_GRAY);
		btnviewdetails.setBounds(10, 479, 176, 45);
		contentPane.add(btnviewdetails);
		
		JButton signout = new JButton("Sign Out");
		signout.setBackground(Color.LIGHT_GRAY);
		signout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signout.setBounds(10, 582, 176, 45);
		contentPane.add(signout);
		
		JButton fback = new JButton("Feedback");
		fback.setBackground(Color.LIGHT_GRAY);
		fback.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fback.setBounds(10, 376, 176, 45);
		contentPane.add(fback);
		mprofile.setBounds(10, 280, 176, 45);
		contentPane.add(mprofile);
		
		JButton home = new JButton("HOME");
		home.setBackground(Color.LIGHT_GRAY);
		home.setFont(new Font("Tahoma", Font.PLAIN, 20));
		home.setBounds(10, 191, 176, 45);
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
		
		JLabel booking = new JLabel("Enter your Email ");
		booking.setFont(new Font("Tahoma", Font.PLAIN, 29));
		booking.setBounds(1026, 148, 234, 66);
		contentPane.add(booking);
		
		JLabel email = new JLabel("Email :");
		email.setFont(new Font("Tahoma", Font.PLAIN, 26));
		email.setBounds(878, 228, 88, 25);
		contentPane.add(email);
		
		temail = new JTextField();
		temail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		temail.setBounds(1026, 224, 237, 45);
		contentPane.add(temail);
		temail.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Book :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_8.setBounds(878, 433, 79, 45);
		contentPane.add(lblNewLabel_8);
		
		JLabel rate = new JLabel("Rate  :");
		rate.setFont(new Font("Tahoma", Font.PLAIN, 28));
		rate.setBounds(878, 509, 88, 45);
		contentPane.add(rate);
		
		trate = new JTextField();
		trate.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		trate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		trate.setColumns(10);
		trate.setBounds(1026, 512, 239, 45);
		contentPane.add(trate);
		
		JLabel lblPayment = new JLabel("Payment :");
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPayment.setBounds(867, 596, 125, 45);
		contentPane.add(lblPayment);
		
		ButtonGroup bn= new ButtonGroup();
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAddress.setBounds(878, 284, 125, 45);
		contentPane.add(lblAddress);
		
		taddr = new JTextField();
		taddr.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		taddr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		taddr.setColumns(10);
		taddr.setBounds(1024, 284, 239, 45);
		contentPane.add(taddr);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblDate.setBounds(878, 359, 125, 45);
		contentPane.add(lblDate);
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\mail.png"));
		lblNewLabel_9.setBounds(823, 227, 45, 39);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\address.png"));
		lblNewLabel_9_1.setBounds(823, 286, 45, 39);
		contentPane.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("");
		lblNewLabel_9_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\cal.jpg"));
		lblNewLabel_9_2.setBounds(811, 359, 55, 45);
		contentPane.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_3 = new JLabel("New label");
		lblNewLabel_9_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\bookl2.jpg"));
		lblNewLabel_9_3.setBounds(823, 439, 45, 39);
		contentPane.add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_9_4 = new JLabel("New label");
		lblNewLabel_9_4.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\rate.jpg"));
		lblNewLabel_9_4.setBounds(823, 519, 45, 39);
		contentPane.add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_9_5 = new JLabel("New label");
		lblNewLabel_9_5.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\pay.png"));
		lblNewLabel_9_5.setBounds(823, 606, 45, 39);
		contentPane.add(lblNewLabel_9_5);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\booking1.png"));
		lblNewLabel_10.setBounds(256, 191, 499, 644);
		contentPane.add(lblNewLabel_10);
		
		tpayment = new JTextField();
		tpayment.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		tpayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tpayment.setColumns(10);
		tpayment.setBounds(1026, 599, 237, 45);
		contentPane.add(tpayment);
		
		tdate = new JTextField();
		tdate.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		tdate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tdate.setColumns(10);
		tdate.setBounds(1024, 362, 239, 45);
		contentPane.add(tdate);
		
		book = new JTextField();
		book.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		book.setFont(new Font("Tahoma", Font.PLAIN, 20));
		book.setColumns(10);
		book.setBounds(1024, 436, 239, 45);
		contentPane.add(book);
		
		JButton btnNewButton = new JButton("view Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temail.setText("samruddhi");
				tdate.setText("14 Dec 2022");
				taddr.setText("Solapur");
				book.setText("Harry Potter");
				trate.setText("2899");
				tpayment.setText("Cash On Delivery");
				
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(993, 684, 176, 53);
		contentPane.add(btnNewButton);
		
		
		
		
	}
}
