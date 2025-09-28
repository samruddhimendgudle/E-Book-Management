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
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

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
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField tfname;
	private JTextField tlname;
	private JTextField tpno;
	private JTextField temail;
	private JTextField taddress;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 0, 1000, 1000);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 986, 81);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Registration");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(284, 10, 302, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 76, 81);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\reg3.png"));
		
		JLabel fname = new JLabel("First Name :");
		fname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		fname.setBounds(134, 122, 146, 48);
		contentPane.add(fname);
		
		JLabel lname = new JLabel("Last Name :");
		lname.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lname.setBounds(134, 200, 128, 39);
		contentPane.add(lname);
		
		JLabel pno = new JLabel("Phone No. :");
		pno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		pno.setBounds(134, 272, 128, 29);
		contentPane.add(pno);
		
		JLabel email = new JLabel("Email :");
		email.setFont(new Font("Tahoma", Font.PLAIN, 24));
		email.setBounds(134, 344, 119, 29);
		contentPane.add(email);
		
		JLabel dob = new JLabel("DOB :");
		dob.setFont(new Font("Tahoma", Font.PLAIN, 24));
		dob.setBounds(134, 410, 106, 39);
		contentPane.add(dob);
		
		JLabel gender = new JLabel("Gender :");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 24));
		gender.setBounds(134, 469, 119, 29);
		contentPane.add(gender);
		
		JLabel add = new JLabel("Address :");
		add.setFont(new Font("Tahoma", Font.PLAIN, 24));
		add.setBounds(134, 515, 129, 59);
		contentPane.add(add);
		
		JLabel ttpwd = new JLabel("Password :");
		ttpwd.setFont(new Font("Tahoma", Font.PLAIN, 24));
		ttpwd.setBounds(134, 584, 128, 48);
		contentPane.add(ttpwd);
		
		JLabel fnameerror = new JLabel("");
		fnameerror.setForeground(Color.RED);
		fnameerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		fnameerror.setBounds(300, 178, 119, 21);
		contentPane.add(fnameerror);
		
		tfname = new JTextField();
		tfname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tfname.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tfname.setOpaque(false);
		tfname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!(Character.isDigit(e.getKeyChar()))) {
					fnameerror.setText("");
					tfname.setEditable(true);
				}else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						tfname.setEditable(true);
					}else {
						tfname.setEditable(true);
						fnameerror.setText("Invalid");
						fnameerror.setForeground(Color.red);
					}
				}
			}
		});
		tfname.setBounds(290, 129, 242, 39);
		contentPane.add(tfname);
		tfname.setColumns(10);
		JLabel lnameerror = new JLabel("");
		lnameerror.setForeground(Color.RED);
		lnameerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lnameerror.setBounds(300, 243, 119, 21);
		contentPane.add(lnameerror);
		
		
		tlname = new JTextField();
		tlname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tlname.setOpaque(false);
		tfname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!(Character.isDigit(e.getKeyChar()))) {
					lnameerror.setText("");
					tlname.setEditable(true);
				}else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						tlname.setEditable(true);
					}else {
						tlname.setEditable(true);
						lnameerror.setText("Invalid");
						lnameerror.setForeground(Color.red);
					}
				}
			}
		});
		tlname.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(211, 211, 211), null, null, null));
		tlname.setColumns(10);
		tlname.setBounds(290, 202, 242, 39);
		contentPane.add(tlname);
		
		JLabel phonoerror = new JLabel("");
		phonoerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phonoerror.setForeground(Color.RED);
		phonoerror.setBounds(300, 313, 119, 29);
		contentPane.add(phonoerror);
		
		tpno = new JTextField();
		tpno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tpno.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tpno.setOpaque(false);
		tpno.addKeyListener(new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
		String  phnoerror=tpno.getText();
		int length= phnoerror.length();
		char c=e.getKeyChar();
		if(c>='0' && c<='9') {
			if(length<10) {
				phonoerror.setText("");
				tpno.setEditable(true);
				
			}
			else {
				tpno.setEditable(false);
				phonoerror.setText("Invalid");
			}
		}else {
			if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
				tpno.setEditable(true);
			}else{
				tpno.setEditable(false);
				phonoerror.setText("Invalid");
			}
		}
	}
	});

		tpno.setColumns(10);
		tpno.setBounds(290, 269, 242, 39);
		contentPane.add(tpno);
		
		JLabel emailerror = new JLabel("");
		emailerror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailerror.setBackground(Color.RED);
		emailerror.setBounds(300, 390, 119, 21);
		contentPane.add(emailerror);
		
		temail = new JTextField();
		temail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		/*temail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar())) {
					emailerror.setText("");
					temail.setEditable(true);
				}else {
					emailerror.setText("Invalid");
					temail.setEditable(false);
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						temail.setEditable(true);
					}else{
						temail.setEditable(false);
						emailerror.setText("Invalid");
					}
				}
			}
		});*/
		temail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		temail.setColumns(10);
		temail.setBounds(491, 204, 232, 27);
		contentPane.add(temail);
		temail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		temail.setOpaque(false);
		temail.setColumns(10);
		temail.setBounds(290, 341, 242, 39);
		contentPane.add(temail);
		
		JRadioButton rmale = new JRadioButton("Male\r\n");
		rmale.setFont(new Font("Tahoma", Font.PLAIN, 24));
		rmale.setBounds(273, 469, 75, 21);
		contentPane.add(rmale);
		
		JRadioButton rfemale = new JRadioButton("Female");
		rfemale.setFont(new Font("Tahoma", Font.PLAIN, 24));
		rfemale.setBounds(352, 469, 103, 21);
		contentPane.add(rfemale);
		
		JRadioButton rother = new JRadioButton("Other");
		rother.setFont(new Font("Tahoma", Font.PLAIN, 24));
		rother.setBounds(457, 469, 103, 21);
		contentPane.add(rother);
		ButtonGroup bn= new ButtonGroup();
		bn.add(rother);
		bn.add(rfemale);
		bn.add(rmale);
		
	
		taddress = new JTextField();
		taddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		taddress.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		taddress.setOpaque(false);
		taddress.setBounds(290, 516, 242, 39);
		contentPane.add(taddress);
		taddress.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		dateChooser.setBackground(UIManager.getColor("Button.background"));
		dateChooser.setBounds(288, 410, 244, 39);
		contentPane.add(dateChooser);
		
		
		JLabel pwderror = new JLabel("");
		pwderror.setForeground(Color.RED);
		pwderror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pwderror.setBounds(295, 642, 119, 21);
		contentPane.add(pwderror);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
        btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String confirmPassword1=passwordField.getText();
				String email = temail.getText();
				int length=confirmPassword1.length();
				if(dateChooser.getDate()==null || tfname.getText()==null || tlname.getText()==null || 
						email==null || tpno.getText()==null 
						|| taddress.getText()==null) {
					JOptionPane.showMessageDialog(null, "Fill required fields!");
				}else if(length<6){
					JOptionPane.showMessageDialog(null, "Password is invalid!");
				}
				else {
				
				String fname = tfname.getText();
				String lname = tlname.getText();
				String phoneNo = tpno.getText();
				Date date = dateChooser.getDate();
				String dob = date.toString();
				String gender = "";
				if(rmale.isSelected()) {
					gender = "Male";
				}else if(rfemale.isSelected()){
					gender = "Female";
				}
				else {
					gender="Other";
				}
				String addr = taddress.getText();
            	//String confirmPassword1=textField.getText();
				ArrayList<String> al = new ArrayList<>();
				al.add(fname);
				al.add(lname);
				al.add(phoneNo);
				al.add(email);
				al.add(dob);
				al.add(gender);
				al.add(addr);
				al.add(confirmPassword1);
				DBconnection db = new DBconnection();
				int recordCount = db.connectivity(al);
				if(recordCount>0) {
				JOptionPane.showMessageDialog(null,"Registered Successfully...!"+recordCount);
				Homepage d = new Homepage();
				d.setVisible(true);
				setVisible(false);}
				else {
					JOptionPane.showMessageDialog(null,"Something error");
				}
				
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBounds(162, 686, 175, 48);
		contentPane.add(btnNewButton);
		
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\name.png"));
		lblNewLabel_2.setBounds(68, 122, 45, 39);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\mob_no.png"));
		lblNewLabel_2_2.setBounds(68, 272, 45, 39);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\mail.png"));
		lblNewLabel_2_3.setBounds(68, 344, 45, 39);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\name.png"));
		lblNewLabel_2_1.setBounds(68, 200, 45, 39);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\dob.png"));
		lblNewLabel_2_4.setBounds(68, 410, 45, 39);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("");
		lblNewLabel_2_4_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\gender.png"));
		lblNewLabel_2_4_1.setBounds(68, 469, 45, 39);
		contentPane.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("");
		lblNewLabel_2_4_1_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\address.png"));
		lblNewLabel_2_4_1_1.setBounds(68, 532, 45, 39);
		contentPane.add(lblNewLabel_2_4_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(UIManager.getColor("Button.background"));
		passwordField.setBounds(295, 584, 237, 39);
		contentPane.add(passwordField);
		
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
		tglbtnNewToggleButton.setBounds(537, 585, 55, 39);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton btnCancel = new JButton("RESET");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfname.setText("");
				tlname.setText("");
				tpno.setText("");
				temail.setText("");
				dateChooser.setDate(null);
				bn.clearSelection();
				taddress.setText("");
				passwordField.setText(null);
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBackground(new Color(135, 206, 250));
		btnCancel.setBounds(352, 686, 175, 48);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\eclipse-workspace\\AJP_PROJECT\\images\\girlreg.png"));
		lblNewLabel_3.setBounds(627, 135, 359, 675);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_4_1_1_1 = new JLabel("");
		lblNewLabel_2_4_1_1_1.setIcon(new ImageIcon("C:\\Users\\Samruddhi Mendgudle\\Downloads\\password.png"));
		lblNewLabel_2_4_1_1_1.setBounds(68, 593, 45, 39);
		contentPane.add(lblNewLabel_2_4_1_1_1);
		
		
		
		
	}
}