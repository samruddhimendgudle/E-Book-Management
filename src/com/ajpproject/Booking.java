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

import com.ajpemail.EmailValidation;
import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;

public class Booking extends JFrame {

	private JPanel contentPane;
	private JTextField temail;
	private JTextField trate;
	private JTextField taddr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Booking frame = new Booking();
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
	public  Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 0, 1500, 1500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBuyBooks = new JButton("View  Details");
		btnBuyBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				View ls=new View();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		btnBuyBooks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuyBooks.setBackground(Color.LIGHT_GRAY);
		btnBuyBooks.setBounds(10, 376, 176, 45);
		contentPane.add(btnBuyBooks);
		
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
		signout.setBounds(10, 464, 176, 45);
		contentPane.add(signout);
		
		JButton fback = new JButton("Feedback");
		fback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Feedback ls=new Feedback();
				ls.setVisible(true);
				setVisible(false);
			}
		});
		fback.setBackground(Color.LIGHT_GRAY);
		fback.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fback.setBounds(10, 283, 176, 45);
		contentPane.add(fback);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\back6.png"));
		lblNewLabel_1.setBounds(0, -11, 212, 856);
		contentPane.add(lblNewLabel_1);
		
		JLabel booking = new JLabel("Booking");
		booking.setFont(new Font("Tahoma", Font.PLAIN, 29));
		booking.setBounds(1004, 148, 234, 66);
		contentPane.add(booking);
		
		JLabel email = new JLabel("Email :");
		email.setFont(new Font("Tahoma", Font.PLAIN, 26));
		email.setBounds(878, 228, 88, 25);
		contentPane.add(email);
		
		temail = new JTextField();
		temail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		temail.setBounds(1014, 224, 249, 45);
		contentPane.add(temail);
		temail.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Book :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_8.setBounds(878, 433, 79, 45);
		contentPane.add(lblNewLabel_8);
		
		JComboBox cbook = new JComboBox();
		cbook.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbook.setBounds(1014, 439, 249, 46);
		contentPane.add(cbook);
		cbook.addItem("The Story of Struggle");
		cbook.addItem("Swami vivekanand");
		cbook.addItem("Ikigai");
		cbook.addItem("The kite runner");
		cbook.addItem("Sudha Murthy");
		cbook.addItem("The Almance of Navel Ravikant");
		cbook.addItem("Jane Austan");
		cbook.addItem("wings of fire");
		cbook.addItem("Harry Potter");
		cbook.addItem("Aryabhatta");
		cbook.addItem("Astrology");
		
		
		JLabel rate = new JLabel("Rate  :");
		rate.setFont(new Font("Tahoma", Font.PLAIN, 28));
		rate.setBounds(878, 509, 88, 45);
		contentPane.add(rate);
		
		trate = new JTextField();
		trate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		trate.setColumns(10);
		/*if(cbook.getSelectedItem()=="The Story of Struggle")
		{
			trate.setText("260");
		}else if(cbook.getSelectedItem()=="Swami vivekanand")
		{
			trate.setText("400");
		}
		else if(cbook.getSelectedItem()=="Ikigai")
		{
			trate.setText("380");
		}else if(cbook.getSelectedItem()=="Harry Potter")
		{
			trate.setText("2899");
		}
		else if(cbook.getSelectedItem()=="The kite runner")
		{
			trate.setText("548");
		}
		else if(cbook.getSelectedItem()=="Sudha Murthy")
		{
			trate.setText("290");
		}else if(cbook.getSelectedItem()=="The Almance of Navel Ravikant")
		{
			trate.setText("189");
		}else if(cbook.getSelectedItem()=="Jane Austan")
		{
			trate.setText("389");
		}else if(cbook.getSelectedItem()=="wings of fire")
		{
			trate.setText("860");
		}else if(cbook.getSelectedItem()=="Aryabhatta")
		{
			trate.setText("250");
		}else 
		{
			trate.setText("600");
		}
		*/
		trate.setBounds(1014, 516, 249, 45);
		contentPane.add(trate);
		
		JLabel lblPayment = new JLabel("Payment :");
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblPayment.setBounds(867, 596, 125, 45);
		contentPane.add(lblPayment);
		
		JRadioButton rcod = new JRadioButton("Cash On Delivery");
		rcod.setFont(new Font("Tahoma", Font.PLAIN, 19));
		rcod.setBounds(1014, 602, 180, 39);
		contentPane.add(rcod);
		
		JRadioButton rother = new JRadioButton("Other");
		rother.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rother.setBounds(1014, 664, 180, 39);
		contentPane.add(rother);
		
		ButtonGroup bn= new ButtonGroup();
		bn.add(rcod);
		bn.add(rother);
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAddress.setBounds(867, 280, 125, 45);
		contentPane.add(lblAddress);
		
		taddr = new JTextField();
		taddr.setFont(new Font("Tahoma", Font.PLAIN, 20));
		taddr.setColumns(10);
		taddr.setBounds(1013, 280, 250, 45);
		contentPane.add(taddr);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblDate.setBounds(878, 359, 125, 45);
		contentPane.add(lblDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(1018, 359, 245, 45);
		contentPane.add(dateChooser);
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
		lblNewLabel_10.setBackground(UIManager.getColor("Button.disabledShadow"));
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\booking1.png"));
		lblNewLabel_10.setBounds(256, 191, 499, 644);
		contentPane.add(lblNewLabel_10);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnsubmit.setBackground(new Color(124, 252, 0));
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(temail.getText()==null || taddr.getText()==null || cbook.getSelectedItem()==null || dateChooser.getDate()==null || trate.getText()==null) {
					JOptionPane.showMessageDialog(null,"Fill required data");
				}else {
					String email = temail.getText();
					String address = taddr.getText();
					String book =  (String)cbook.getSelectedItem();
					 String date = dateChooser.getDate().toString();
					 String rate=trate.getText();
					 String payment="";
					 if(rcod.isSelected()) {
							payment = "Cash on delivery";
						}
						else {
							payment="Other";
						}
					
					DBconnection db = new DBconnection();
						Loginpage login=new Loginpage();
						
						ArrayList<String> al = new ArrayList<>();
						al.add(email);
						al.add(address);
						al.add(date);
						al.add(book);
						al.add(rate);
						al.add(payment);	
						int recordcount = db.bookingdetails(al);
						if(recordcount>0) {
						
						JOptionPane.showMessageDialog(null, "Your order confirmed.");
						String msg="your order confirmed....";
						String subject="E-book :Confirmation";
						String from="samruddhimendgudle@gmail.com";
						String to=login.username;
						EmailValidation sam=new EmailValidation();
						sam.sendEmail(msg, subject, to, from);
						}	
						else
						{
							JOptionPane.showMessageDialog(null, "something went wrong");
						}
					}
	
				}
			}
		);	
				

		btnsubmit.setBounds(901, 718, 134, 59);
		contentPane.add(btnsubmit);
		
		JButton btnCancel = new JButton("cancel");
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temail.setText("");
				taddr.setText("");
				dateChooser.setDate(null);
				//book.setText("");
				trate.setText("");
				bn.clearSelection();
				
				
			}
		});
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(1074, 718, 134, 59);
		contentPane.add(btnCancel);
		
		
		
		
	}
}
