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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class Feedback extends JFrame {

	private JPanel contentPane;
	private JTextField tname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feedback frame = new Feedback();
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
	public Feedback() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(60, 0, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		signout.setBounds(10, 336, 176, 45);
		contentPane.add(signout);
		
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
		lblNewLabel_5.setBounds(222, -7, 159, 128);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Feedback page");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(10, 92, 176, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(51, 53, 64, 29);
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
		
		JLabel lblNewLabel_8 = new JLabel("Enter your name :");
		lblNewLabel_8.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(334, 265, 255, 59);
		contentPane.add(lblNewLabel_8);
		
		tname = new JTextField();
		tname.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		tname.setFont(new Font("Cambria", Font.PLAIN, 25));
		tname.setBounds(560, 273, 242, 44);
		contentPane.add(tname);
		tname.setColumns(10);
		
		JLabel lblNewLabel_8_1 = new JLabel("Rating To the Site :");
		lblNewLabel_8_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel_8_1.setBounds(334, 373, 212, 59);
		contentPane.add(lblNewLabel_8_1);
		
		JRadioButton rb1 = new JRadioButton("Best");
		rb1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rb1.setBounds(560, 378, 125, 59);
		contentPane.add(rb1);
		
		JRadioButton rbs = new JRadioButton("Satisfied");
		rbs.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbs.setBounds(704, 378, 147, 59);
		contentPane.add(rbs);
		
		JRadioButton rbu = new JRadioButton("Unsatisfied");
		rbu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rbu.setBounds(868, 378, 147, 59);
		contentPane.add(rbu);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("About Delivery :");
		lblNewLabel_8_1_1.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel_8_1_1.setBounds(323, 479, 212, 59);
		contentPane.add(lblNewLabel_8_1_1);
		
		JRadioButton unsatidfied = new JRadioButton("Unsatisfied");
		unsatidfied.setFont(new Font("Tahoma", Font.PLAIN, 25));
		unsatidfied.setBounds(868, 478, 147, 59);
		contentPane.add(unsatidfied);
		
		JRadioButton satisfied = new JRadioButton("Satisfied");
		satisfied.setFont(new Font("Tahoma", Font.PLAIN, 25));
		satisfied.setBounds(704, 478, 147, 59);
		contentPane.add(satisfied);
		JRadioButton best = new JRadioButton("Best");
		best.setFont(new Font("Tahoma", Font.PLAIN, 25));
		best.setBounds(560, 479, 125, 59);
		contentPane.add(best);
		ButtonGroup bn=new ButtonGroup ();
		bn.add(best);
		bn.add(satisfied);
		bn.add(unsatidfied);
		
		ButtonGroup cn=new ButtonGroup ();
		cn.add(rbu);
		cn.add(rbs);
		cn.add(rb1);
		JLabel lblNewLabel_8_2 = new JLabel("Feedback :");
		lblNewLabel_8_2.setFont(new Font("Cambria", Font.PLAIN, 25));
		lblNewLabel_8_2.setBounds(334, 590, 186, 59);
		contentPane.add(lblNewLabel_8_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textArea.setBounds(560, 573, 357, 108);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tname.equals("")|| textArea.equals("")||bn.isSelected(null)||cn.isSelected(null)){
					JOptionPane.showMessageDialog(null,"All Fields are required");
				}else {
					JOptionPane.showMessageDialog(null,"Thank you...");
					
				}
			}
		});
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(449, 708, 181, 45);
		contentPane.add(btnNewButton);
		
		
	}}
		