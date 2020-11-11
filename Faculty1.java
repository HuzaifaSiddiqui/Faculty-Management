import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;
import java.io.*;


//Class for Welcom Form...

class Welcome implements ActionListener
{
	public JFrame frm;
	JLabel l1, l2, l3, l4, l5, l6;
	ImageIcon img;
	JProgressBar j;
	JPanel jp, jp1, jp2, jp3, jp4, jp5, jp6, jp7, jp8;
	public Color clr, clr1;
	Font f,f1,f2,f3,f4;
	JButton btnc;
	
	public Welcome()
	{
		clr1=new Color(36,47,65);
		clr=new Color(97,212,195);
		
		f=new Font("Century Gothic", Font.BOLD, 56);
  		f1=new Font("Times New Roman",Font.PLAIN, 30);
  		f2=new Font("Times New Roman",Font.PLAIN, 34);
  		f3=new Font("Century Gothic",Font.PLAIN, 15);
  		f4=new Font("Calibri",Font.PLAIN,13);
  	
		img=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon1.png");
	
		frm=new JFrame("Welcome");
		frm.setDefaultCloseOperation(frm.EXIT_ON_CLOSE);
		frm.setSize(800,550);
		frm.getContentPane().setBackground(clr);
		frm.setLayout(null);
		frm.setLocationRelativeTo(null);
		frm.setResizable(false);
		//frm.setAlwaysOnTop(true);
		frm.setVisible(true);
		
		l1=new JLabel("Faculty Management");
		l1.setFont(f);
		l1.setForeground(Color.WHITE);
		
		
		jp=new JPanel();
		jp.setBounds(0,50,800,120);
		jp.setBackground(clr1);
		jp.setLayout(new GridBagLayout());
		jp.add(l1);
		frm.add(jp);
		
		l2=new JLabel("Developed By:");
		l2.setFont(f1);
		l2.setForeground(clr1);
		l2.setBounds(400,200,210,40);
		frm.add(l2);
		
		l3=new JLabel("Huzaifa & Surbhi");
		l3.setFont(f2);
		l3.setBounds(450,250,250,40);
		l3.setForeground(Color.WHITE);
		frm.add(l3);
		
		btnc=new JButton("Continue");
		btnc.setBounds(600,350,100,30);
		btnc.setBackground(clr1);
		btnc.setForeground(Color.WHITE);
		btnc.setBorder(null);
		btnc.setFont(f3);
		frm.add(btnc);
		btnc.addActionListener(this);
		
		jp1=new JPanel();
		jp1.setBounds(100,250,150,150);
		jp1.setBackground(clr1);
		jp1.setLayout(new GridBagLayout());
		l4=new JLabel(img);
		jp1.add(l4);
		frm.add(jp1);
		
		j=new JProgressBar();
		j.setValue(0);
		j.setBounds(0,480,800,5);
		j.setBackground(Color.WHITE);
		j.setForeground(clr1);
		j.setBorder(null);
		j.setVisible(false);
		frm.add(j);
		
		l6=new JLabel("All rights are reserved by HS Group");
		l6.setFont(f4);
		l6.setForeground(clr1);
		l6.setBounds(580,490,800,13);
		frm.add(l6);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnc)
		{
			int i=0;
			j.setVisible(true);
			try
			{
				while(i<=100)
				{
					Thread.sleep(20);
					j.paintImmediately(0,0,800,10);
					j.setValue(i);
					i++;
				}
			}
			catch(Exception obj)
			{}
			
			frm.getContentPane().removeAll();
			frm.repaint();
			
			class Login implements ActionListener
			{
				JLabel user, pass, licon, licon1;
				JTextField tuser;
				JPasswordField tpass;
				JButton ok, exit;
				ImageIcon icon1;
				Font f, f1, f2, f3;
				JPanel j1;
				JCheckBox chkshow;
				public Login()
 				{
 					frm.setTitle("Login");
 					
 					f=new Font("Century Gothic", Font.PLAIN, 20);
 					f1=new Font("Century Gothic",Font.PLAIN, 14);
					f2=new Font("Lucida Sans Typewriter", Font.PLAIN, 14);
 					f3=new Font("Century Gothic",Font.PLAIN, 15);
  
  					icon1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\Icon2.png");
	   
  					frm.getContentPane().setBackground(clr1);
 
  					j1=new JPanel();
  					j1.setBounds(0,0,380,550);
  					j1.setBackground(clr);
  					j1.setLayout(new GridBagLayout());
  					licon1=new JLabel(icon1);
  					j1.add(licon1);
  					frm.add(j1);
		  
  					user=new JLabel("USER NAME");
  					user.setBounds(470,130,150,50);
  					user.setFont(f);
  					user.setForeground(Color.WHITE);
  					frm.add(user);
		  
  					pass=new JLabel("PASSWORD");
  					pass.setBounds(470,220,150,50);
  					pass.setFont(f);
  					pass.setForeground(Color.WHITE);
  					frm.add(pass);
  
  					tuser=new JTextField();
  					tuser.setBounds(470, 175, 200, 30);
  					tuser.setBackground(clr1);
  					tuser.setForeground(Color.WHITE);
  					tuser.setCaretColor(Color.WHITE);
  					tuser.setFont(f2);
  					frm.add(tuser);
  
			  		tpass=new JPasswordField();
  					tpass.setBounds(470, 265, 200, 30);
  					tpass.setBackground(clr1);
  					tpass.setForeground(Color.WHITE);
  					tpass.setCaretColor(Color.WHITE);
  					tpass.setFont(f2);
  					frm.add(tpass);
  
  					chkshow=new JCheckBox("Show Password");
  					chkshow.setBounds(470,310,140,30);
  					chkshow.setFont(f1);
  					chkshow.setBackground(clr1);
  					chkshow.setForeground(Color.WHITE);
  					frm.add(chkshow);
  
  					ok=new JButton("Enter");
  					ok.setBounds(480, 400, 100, 30);
  					ok.setBackground(clr);
  					ok.setForeground(clr1);
  					ok.setFont(f3);
  					ok.setBorder(null);
  					frm.add(ok);
  
  					exit=new JButton("Exit");
  					exit.setBounds(620, 400, 100, 30);
  					exit.setBackground(clr);
  					exit.setForeground(clr1);
  					exit.setFont(f3);
  					exit.setBorder(null);
  					frm.add(exit);
	  
  					chkshow.addActionListener(this);
  					ok.addActionListener(this);
  					exit.addActionListener(this);
  				}
  	
  				public void actionPerformed(ActionEvent a)
  				{
	  				if(a.getSource()==ok)
   					{
   						try
   						{
   						Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 						Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 						Statement state=con.createStatement();
 						String q="select * from Login where Username='"+tuser.getText()+"' and Password='"+tpass.getText()+"'";
						ResultSet res=state.executeQuery(q);
						if(!res.next())
						{
							JOptionPane.showMessageDialog(null, "Invalid Username or Password");
							tuser.setText("");
     						tpass.setText("");
						}
						else
						{				
	     					JOptionPane.showMessageDialog(null, "Login Successfull");
     						frm.getContentPane().removeAll();
							frm.repaint();
     						
     						class Mainform implements ActionListener
							{
	 							JLabel l3, l4, l5, l6, l7, l8, l9, l10;
 								ImageIcon icon3, icon4, icon5, icon6;
 								Font f, f1, f2, f3;
 								JButton j1,j2,j3,j4;
 								JPanel p1, p2,p3, p4;
 								public Mainform()
 								{
 									frm.setTitle("Main");
 	
 									f=new Font("Bookman Old Style", Font.PLAIN, 25);
 									
 									icon3= new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon3.png");
  									icon4= new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon4.png");
									icon5= new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon5.png");
  									icon6= new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon6.png");
  									
  									j1=new JButton(icon3);
  									j1.setBounds(29,135,120,110);
  									j1.setBackground(clr1);
  									j1.setBorder(null);
  									j1.setLayout(new GridBagLayout());
  									frm.add(j1);
  
  									j2=new JButton(icon4);
  									j2.setBounds(229,135,120,110);
  									j2.setBackground(clr1);
  									j2.setBorder(null);
  									j2.setLayout(new GridBagLayout());
  									frm.add(j2);
  
  									j3=new JButton(icon5);
  									j3.setBounds(429,135,120,110);
  									j3.setBackground(clr1);
  									j3.setBorder(null);
  									j3.setLayout(new GridBagLayout());	
  									frm.add(j3);
  
  									j4=new JButton(icon6);
  									j4.setBounds(629,135,120,110);
  									j4.setBackground(clr1);
  									j4.setBorder(null);
  									j4.setLayout(new GridBagLayout());
  									frm.add(j4);
  									
  									l7=new JLabel("FACULTY");
  									l8=new JLabel("SALARY");
  									l9=new JLabel("REPORT");
  									l10=new JLabel("EXIT");
  
  
  									l7.setBounds(29,200,120,150);
  									l7.setHorizontalAlignment(JLabel.CENTER);
  									l7.setFont(f);
  									l7.setForeground(Color.WHITE);
  									l8.setBounds(229,200,120,150);
  									l8.setHorizontalAlignment(JLabel.CENTER);
  									l8.setFont(f);
  									l8.setForeground(Color.WHITE);
  									l9.setBounds(429,200,120,150);
  									l9.setHorizontalAlignment(JLabel.CENTER);
  									l9.setFont(f);
  									l9.setForeground(Color.WHITE);
  									l10.setBounds(629,200,120,150);
  									l10.setHorizontalAlignment(JLabel.CENTER);
  									l10.setFont(f);
  									l10.setForeground(Color.WHITE);
  
  
									frm.add(l7);
  									frm.add(l8);
  									frm.add(l9);
  									frm.add(l10);
  
  									j1.addActionListener(this);
  									j2.addActionListener(this);
  									j3.addActionListener(this);
  									j4.addActionListener(this);
  								}
 								public void actionPerformed(ActionEvent e)
 								{
 									if(e.getSource()==j1)
 									{
 										frm.getContentPane().removeAll();
										frm.repaint();
 										class FacultyDetails implements ActionListener
										{						
											JButton b1, b2, b3, b4, b5;
											JLabel l1, l2, l3, l4;
											ImageIcon img1, img2, img3, img4, img5;
											Font f;
											public FacultyDetails()
											{
												frm.setTitle("Faculty");
												
												f=new Font("Times New Roman",Font.PLAIN, 18);
		
												img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon7.png");
												img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon8.png");
												img3=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon9.png");
												img4=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon10.png");
												img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
		
												
												b1=new JButton(img1);
												b1.setBounds(255,105,105,105);
												b1.setBackground(clr1);
												b1.setBorder(null);
												frm.add(b1);
		
												b2=new JButton(img2);
												b2.setBounds(425,105,105,105);
												b2.setBackground(clr1);
												b2.setBorder(null);
												frm.add(b2);
		
												b3=new JButton(img3);
												b3.setBounds(255,275,105,105);
												b3.setBackground(clr1);
												b3.setBorder(null);
												frm.add(b3);
		
												b4=new JButton(img4);
												b4.setBounds(425,275,105,105);
												b4.setBackground(clr1);
												b4.setBorder(null);
												frm.add(b4);
												
												b5=new JButton(img5);
												b5.setBounds(700,30,40,40);
												b5.setBackground(clr1);
												b5.setBorder(null);
												frm.add(b5);
												
												l1=new JLabel("Add");
												l1.setBounds(255,215,105,22);
												l1.setForeground(Color.WHITE);
												l1.setFont(f);
												l1.setHorizontalAlignment(JLabel.CENTER);
												frm.add(l1);
			
												l2=new JLabel("Edit");
												l2.setBounds(425,215,105,22);
												l2.setForeground(Color.WHITE);
												l2.setFont(f);
												l2.setHorizontalAlignment(JLabel.CENTER);
												frm.add(l2);
		
												l3=new JLabel("Search");
												l3.setBounds(255,385,105,22);
												l3.setForeground(Color.WHITE);
												l3.setFont(f);
												l3.setHorizontalAlignment(JLabel.CENTER);
												frm.add(l3);
			
												l4=new JLabel("Exit");
												l4.setBounds(425,385,105,22);
												l4.setForeground(Color.WHITE);
												l4.setFont(f);
												l4.setHorizontalAlignment(JLabel.CENTER);
												frm.add(l4);
		
												b1.addActionListener(this);
												b2.addActionListener(this);
												b3.addActionListener(this);
												b4.addActionListener(this);
												b5.addActionListener(this);
											}
	
											public void actionPerformed(ActionEvent e)
 											{
 												if(e.getSource()==b1)
 												{
 													frm.getContentPane().removeAll();
													frm.repaint();
													
													class AddFaculty implements ActionListener
													{
														JLabel limg, ltitle, j1, j2, j4, j3, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14;
														JTextField t1, t2, t3, t5, t6, t7, t8, t9, t10, t12;
														JComboBox t4, t11, t14, t13;
														JButton b1, b2, b3, b4;
														ImageIcon img;
														Font f, f1, f2, f3;
			
														public AddFaculty()
														{
															frm.setTitle("Add Faculty");
															
															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Arial",Font.PLAIN, 18);
  															f3=new Font("Century Gothic",Font.BOLD, 12);
  		
  															img=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon15.png");
  															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
		
															limg=new JLabel(img);
															limg.setBounds(40,30,50,50);
															frm.add(limg);	
															
															ltitle=new JLabel("ADD FACULTY");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
		
															j1=new JLabel("ID :", SwingConstants.RIGHT);
															j1.setBounds(40,120,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
		
															t1=new JTextField();
															t1.setBounds(190,120,150,20);
															t1.setBorder(null);
															t1.setFont(f3);
															frm.add(t1);
		
															j2=new JLabel("First Name :", SwingConstants.RIGHT);
															j2.setBounds(40,160,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
		
															t2=new JTextField();
															t2.setBounds(190,160,150,20);
															t2.setBorder(null);
															t2.setFont(f3);
															frm.add(t2);
		
															j3=new JLabel("Last Name :", SwingConstants.RIGHT);
															j3.setBounds(40,200,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
		
															t3=new JTextField();
															t3.setBounds(190,200,150,20);
															t3.setBorder(null);
															t3.setFont(f3);
															frm.add(t3);
		
															j4=new JLabel("Gender :", SwingConstants.RIGHT);
															j4.setBounds(40,240,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
		
															t4=new JComboBox();
															t4.addItem("Male");
															t4.addItem("Female");
															t4.addItem("Other");
															t4.setBounds(190,240,150,20);
															t4.setBorder(null);
															t4.setFont(f3);
															frm.add(t4);
			
															j5=new JLabel("Date of Birth :", SwingConstants.RIGHT);
															j5.setBounds(40,280,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
		
															t5=new JTextField();
															t5.setBounds(190,280,150,20);	
															t5.setBorder(null);
															t5.setFont(f3);
															frm.add(t5);
		
															j6=new JLabel("Address :", SwingConstants.RIGHT);
															j6.setBounds(40,320,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
		
															t6=new JTextField();
															t6.setBounds(190,320,150,20);
															t6.setBorder(null);
															t6.setFont(f3);
															frm.add(t6);
		
															j7=new JLabel("Joining Date :", SwingConstants.RIGHT);
															j7.setBounds(40,360,110,20);
															j7.setFont(f1);
															j7.setForeground(Color.WHITE);
															frm.add(j7);
		
															t7=new JTextField();
															t7.setBounds(190,360,150,20);
															t7.setBorder(null);
															t7.setFont(f3);
															frm.add(t7);
		
															j8=new JLabel("Phone No :", SwingConstants.RIGHT);
															j8.setBounds(420,120,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
			
															t8=new JTextField();
															t8.setBounds(570,120,150,20);
															t8.setBorder(null);
															t8.setFont(f3);
															frm.add(t8);
			
															j9=new JLabel("Qualification :", SwingConstants.RIGHT);
															j9.setBounds(420,160,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
		
															t9=new JTextField();
															t9.setBounds(570,160,150,20);
															t9.setBorder(null);
															t9.setFont(f3);
															frm.add(t9);
		
															j10=new JLabel("Salary :", SwingConstants.RIGHT);
															j10.setBounds(420,200,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
			
															t10=new JTextField();
															t10.setBounds(570,200,150,20);
															t10.setBorder(null);
															t10.setFont(f3);
															frm.add(t10);
		
															j11=new JLabel("Department :", SwingConstants.RIGHT);
															j11.setBounds(420,240,110,20);
															j11.setFont(f1);
															j11.setForeground(Color.WHITE);
															frm.add(j11);
		
															t11=new JComboBox();
															t11.addItem("Science");
															t11.addItem("Commerce");
															t11.addItem("Arts");
															t11.setBounds(570,240,150,20);
															t11.setBorder(null);
															t11.setFont(f3);
															frm.add(t11);
		
															j12=new JLabel("Email ID :", SwingConstants.RIGHT);
															j12.setBounds(420,280,110,20);
															j12.setFont(f1);
															j12.setForeground(Color.WHITE);
															frm.add(j12);
		
															t12=new JTextField();
															t12.setBounds(570,280,150,20);
															t12.setBorder(null);
															t12.setFont(f3);
															frm.add(t12);
		
															j13=new JLabel("Designation :", SwingConstants.RIGHT);
															j13.setBounds(420,320,110,20);
															j13.setFont(f1);
															j13.setForeground(Color.WHITE);
															frm.add(j13);
			
															t13=new JComboBox();
															t13.addItem("Principal");
															t13.addItem("Lecturer");
															t13.addItem("Assistant Teacher");
															t13.addItem("Clerk");
															t13.setBounds(570,320,150,20);
															t13.setBorder(null);
															t13.setFont(f3);
															frm.add(t13);
		
															j14=new JLabel("Marital Stauts :", SwingConstants.RIGHT);
															j14.setBounds(420,360,110,20);
															j14.setFont(f1);
															j14.setForeground(Color.WHITE);
															frm.add(j14);
			
															t14=new JComboBox();
															t14.addItem("Married");
															t14.addItem("Unmarried");
															t14.setBounds(570,360,150,20);
															t14.setBorder(null);
															t14.setFont(f3);
															frm.add(t14);
		
															b1=new JButton("SAVE");
															b1.setBounds(125,430,100,30);
															b1.setBackground(clr);
															b1.setForeground(clr1);
															b1.setFont(f2);
															b1.setBorder(null);
															frm.add(b1);
		
															b2=new JButton("CLEAR");
															b2.setBounds(350,430,100,30);
															b2.setBackground(clr);
															b2.setForeground(clr1);
															b2.setFont(f2);
															b2.setBorder(null);
															frm.add(b2);
		
															b3=new JButton("EXIT");
															b3.setBounds(575,430,100,30);
															b3.setBackground(clr);
															b3.setForeground(clr1);
															b3.setFont(f2);
															b3.setBorder(null);
															frm.add(b3);
															
															b4=new JButton(img5);
															b4.setBounds(700,30,40,40);
															b4.setBackground(clr1);
															b4.setBorder(null);
															frm.add(b4);
		
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															b4.addActionListener(this);
															
															try
 															{	
 																Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																Statement state=con.createStatement();
 																ResultSet rs=state.executeQuery("select MAX(ID) from FacultyDetails");
 																if(rs.next())
 																{
 																	int id=Integer.parseInt(rs.getString(1));
 																	id++;
 																	t1.setText(String.valueOf(id));
			 													}
 															}
 															catch(Exception a)
 															{
 																System.out.println(a);
 															}
 															t1.setEditable(false);
 															
														}
	
														public void actionPerformed(ActionEvent e)
 														{
    														if(e.getSource()==b1)
 															{
 																if((t2.getText().length()==0)||(t3.getText().length()==0)||(t4.getSelectedItem().toString().length()==0)||(t5.getText().length()==0)||(t6.getText().length()==0)||(t7.getText().length()==0)||(t8.getText().length()==0)||(t8.getText().length()>10)||(t9.getText().length()==0)||(t10.getText().length()==0)||(t11.getSelectedItem().toString().length()==0)||(t12.getText().length()==0)||(t13.getSelectedItem().toString().length()==0)||(t14.getSelectedItem().toString().length()==0))
 																{
 																	JOptionPane.showMessageDialog(null, "Please fill all fields or match the format");
 																}
 																else
 																{
 																	try
 																	{
	 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																		Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																		Statement state=con.createStatement();
 																		String q="insert into FacultyDetails values("+Integer.parseInt(t1.getText())+", '"+t2.getText()+"', '"+t3.getText()+"', '"+t4.getSelectedItem().toString()+"', '"+t5.getText()+"', '"+t6.getText()+"', '"+t7.getText()+"', '"+t8.getText()+"', '"+t9.getText()+"', "+t10.getText()+", '"+t11.getSelectedItem().toString()+"', '"+t12.getText()+"', '"+t13.getSelectedItem().toString()+"', '"+t14.getSelectedItem().toString()+"')";
 																		state.executeUpdate(q);
 																		JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	}
 																	catch(Exception obj)
 																	{
 																		JOptionPane.showMessageDialog(null, "Format Mismatch");
 																	}
 																}
 																
 															}
 																
 																
 															if(e.getSource()==b2)
 															{
 																t2.setText(null);
 																t3.setText(null);
 																t5.setText(null);
 																t6.setText(null);
 																t7.setText(null);
 																t8.setText(null);
 																t9.setText(null);
 																t10.setText(null);
 																t12.setText(null);
 															}
 															if(e.getSource()==b3)	
 															{
 																frm.dispose();
 															}
 															if(e.getSource()==b4)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																FacultyDetails f=new FacultyDetails();
 															}
 															
 														}
 													}
 											
													AddFaculty a=new AddFaculty();
 												}
 												if(e.getSource()==b2)
 												{
 													frm.getContentPane().removeAll();
													frm.repaint();
													
 													class EditFaculty implements ActionListener
													{
														JLabel limg, ltitle, j1, j2, j4, j3, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14;
														JTextField t1, t2, t3, t5, t6, t7, t8, t9, t10, t12;
														JComboBox t4, t11, t14, t13;
														JButton b1, b2, b3, b4, b5;
														ImageIcon img, img1;
														Font f, f1, f2, f3;
	
														public EditFaculty()
														{
															frm.setTitle("Edit Faculty");
															
															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Arial",Font.PLAIN, 18);
  															f3=new Font("Century Gothic",Font.BOLD, 12);
  		
  															img=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon16.png");
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
		
			
															limg=new JLabel(img);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
		
															ltitle=new JLabel("EDIT FACULTY");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
		
															j1=new JLabel("Enter ID :", SwingConstants.RIGHT);
															j1.setBounds(40,120,110,20);
															j1.setFont(f1);
															j1.setForeground(clr);
															frm.add(j1);
		
															t1=new JTextField();
															t1.setBounds(190,120,150,20);
															t1.setBorder(null);
															t1.setFont(f3);
															frm.add(t1);
															
														
															j2=new JLabel("First Name :", SwingConstants.RIGHT);
															j2.setBounds(40,160,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
		
															t2=new JTextField();
															t2.setBounds(190,160,150,20);
															t2.setBorder(null);
															t2.setFont(f3);
															frm.add(t2);
		
															j3=new JLabel("Last Name :", SwingConstants.RIGHT);
															j3.setBounds(40,200,110,20);	
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
		
															t3=new JTextField();
															t3.setBounds(190,200,150,20);	
															t3.setBorder(null);
															t3.setFont(f3);
															frm.add(t3);
		
															j4=new JLabel("Gender :", SwingConstants.RIGHT);
															j4.setBounds(40,240,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
		
															t4=new JComboBox();
															t4.addItem("Male");
															t4.addItem("Female");
															t4.addItem("Other");
															t4.setBounds(190,240,150,20);
															t4.setBorder(null);
															t4.setFont(f3);
															frm.add(t4);
		
															j5=new JLabel("Date of Birth :", SwingConstants.RIGHT);
															j5.setBounds(40,280,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
			
															t5=new JTextField();
															t5.setBounds(190,280,150,20);
															t5.setBorder(null);
															t5.setFont(f3);
															frm.add(t5);
			
															j6=new JLabel("Address :", SwingConstants.RIGHT);
															j6.setBounds(40,320,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
		
															t6=new JTextField();
															t6.setBounds(190,320,150,20);
															t6.setBorder(null);
															t6.setFont(f3);
															frm.add(t6);
		
															j7=new JLabel("Joining Date :", SwingConstants.RIGHT);
															j7.setBounds(40,360,110,20);
															j7.setFont(f1);
															j7.setForeground(Color.WHITE);
															frm.add(j7);
		
															t7=new JTextField();
															t7.setBounds(190,360,150,20);
															t7.setBorder(null);
															t7.setFont(f3);
															frm.add(t7);
		
															j8=new JLabel("Phone No :", SwingConstants.RIGHT);
															j8.setBounds(420,120,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
		
															t8=new JTextField();
															t8.setBounds(570,120,150,20);
															t8.setBorder(null);
															t8.setFont(f3);
															frm.add(t8);
		
															j9=new JLabel("Qualification :", SwingConstants.RIGHT);
															j9.setBounds(420,160,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
			
															t9=new JTextField();
															t9.setBounds(570,160,150,20);	
															t9.setBorder(null);
															t9.setFont(f3);
															frm.add(t9);
			
															j10=new JLabel("Salary :", SwingConstants.RIGHT);
															j10.setBounds(420,200,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
		
															t10=new JTextField();
															t10.setBounds(570,200,150,20);
															t10.setBorder(null);
															t10.setFont(f3);
															frm.add(t10);
		
															j11=new JLabel("Department :", SwingConstants.RIGHT);
															j11.setBounds(420,240,110,20);
															j11.setFont(f1);
															j11.setForeground(Color.WHITE);
															frm.add(j11);
			
															t11=new JComboBox();
															t11.addItem("Science");
															t11.addItem("Commerce");
															t11.addItem("Arts");
															t11.setBounds(570,240,150,20);
															t11.setBorder(null);
															t11.setFont(f3);
															frm.add(t11);
		
															j12=new JLabel("Email ID :", SwingConstants.RIGHT);
															j12.setBounds(420,280,110,20);
															j12.setFont(f1);
															j12.setForeground(Color.WHITE);
															frm.add(j12);
			
															t12=new JTextField();
															t12.setBounds(570,280,150,20);
															t12.setBorder(null);
															t12.setFont(f3);
															frm.add(t12);
		
															j13=new JLabel("Designation :", SwingConstants.RIGHT);
															j13.setBounds(420,320,110,20);
															j13.setFont(f1);
															j13.setForeground(Color.WHITE);
															frm.add(j13);
		
															t13=new JComboBox();
															t13.addItem("Principal");
															t13.addItem("Lecturer");
															t13.addItem("Assistant Teacher");
															t13.addItem("Clerk");
															t13.setBounds(570,320,150,20);
															t13.setBorder(null);
															t13.setFont(f3);
															frm.add(t13);
		
															j14=new JLabel("Marital Stauts :", SwingConstants.RIGHT);
															j14.setBounds(420,360,110,20);
															j14.setFont(f1);
															j14.setForeground(Color.WHITE);
															frm.add(j14);
		
															t14=new JComboBox();	
															t14.addItem("Married");
															t14.addItem("Unmarried");
															t14.setBounds(570,360,150,20);
															t14.setBorder(null);
															t14.setFont(f3);
															frm.add(t14);
		
															b1=new JButton(img1);
															b1.setBounds(345,115,30,30);
															b1.setBackground(clr1);
															b1.setBorder(null);
															frm.add(b1);
										
															b2=new JButton("SAVE");
															b2.setBounds(350,430,100,30);
															b2.setBackground(clr);
															b2.setForeground(clr1);
															b2.setFont(f2);
															b2.setBorder(null);
															frm.add(b2);
															b2.setEnabled(false);
			
															b3=new JButton("EXIT");
															b3.setBounds(575,430,100,30);
															b3.setBackground(clr);
															b3.setForeground(clr1);
															b3.setFont(f2);
															b3.setBorder(null);
															frm.add(b3);
															
															b4=new JButton(img5);
															b4.setBounds(700,30,40,40);
															b4.setBackground(clr1);
															b4.setBorder(null);
															frm.add(b4);
															
															
															
															b5=new JButton("EDIT");
															b5.setBounds(125,430,100,30);
															b5.setBackground(clr);
															b5.setForeground(clr1);
															b5.setFont(f2);
															b5.setBorder(null);
															frm.add(b5);
															b5.setEnabled(false);
		
			
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															b4.addActionListener(this);
															b5.addActionListener(this);
															
			
														}
	
														public void actionPerformed(ActionEvent e)
 														{
 															if(e.getSource()==b1)
 															{
 																
 																try
 																{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="select * from FacultyDetails where ID="+t1.getText();
 																	ResultSet res=state.executeQuery(q);
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name"));
 																		t3.setText(res.getString("Last_Name"));
 																		t4.setSelectedItem(res.getString("Gender"));
 																		t5.setText(res.getString("Date_of_Birth"));
 																		t6.setText(res.getString("Address"));
 																		t7.setText(res.getString("Joining_Date"));
 																		t8.setText(res.getString("Phone_No"));
 																		t9.setText(res.getString("Qualification"));
 																		t10.setText(res.getString("Salary"));
 																		t11.setSelectedItem(res.getString("Department"));
 																		t12.setText(res.getString("Email_ID"));
 																		t13.setSelectedItem(res.getString("Designation"));
 																		t14.setSelectedItem(res.getString("Marital_Status"));
 																		
 																		
 																		t2.setEditable(false);
 																		t3.setEditable(false);
 																		t4.setEditable(false);
 																		t5.setEditable(false);
 																		t6.setEditable(false);
 																		t7.setEditable(false);
 																		t8.setEditable(false);
 																		t9.setEditable(false);
 																		t10.setEditable(false);
 																		t11.setEditable(false);
 																		t12.setEditable(false);
 																		t13.setEditable(false);
 																		t14.setEditable(false);
 																		
 																		b5.setEnabled(true);
 																	}
 																}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, "Please Enter ID");
 																}
 															}
 															
 															if(e.getSource()==b5)
 															{
 																t2.setEditable(true);
 																t3.setEditable(true);
 																t4.setEditable(true);
 																t5.setEditable(true);
 																t6.setEditable(true);
 																t7.setEditable(true);
 																t8.setEditable(true);
 																t9.setEditable(true);
 																t10.setEditable(true);
 																t11.setEditable(true);
 																t12.setEditable(true);
 																t13.setEditable(true);
 																t14.setEditable(true);
 																
 																b2.setEnabled(true);
 															}
    														if(e.getSource()==b2)
 															{
 																
 															
 																try
 																{
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="update FacultyDetails set First_Name='"+t2.getText()+"', Last_Name='"+t3.getText()+"', Gender='"+t4.getSelectedItem().toString()+"', Date_of_Birth='"+t5.getText()+"', Address='"+t6.getText()+"', Joining_Date='"+t7.getText()+"', Phone_No='"+t8.getText()+"', Qualification='"+t9.getText()+"', Salary="+t10.getText()+", Department='"+t11.getSelectedItem().toString()+"', Email_ID='"+t12.getText()+"', Designation='"+t13.getSelectedItem().toString()+"', Marital_Status='"+t14.getSelectedItem().toString()+"'where ID="+t1.getText();
 																	state.executeUpdate(q);
 																	JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	
 																	
 																	
 																	t2.setEditable(false);
 																	t3.setEditable(false);
 																	t4.setEditable(false);
 																	t5.setEditable(false);
 																	t6.setEditable(false);
 																	t7.setEditable(false);
 																	t8.setEditable(false);
 																	t9.setEditable(false);
 																	t10.setEditable(false);
 																	t11.setEditable(false);
 																	t12.setEditable(false);
 																	t13.setEditable(false);
 																	t14.setEditable(false);
 																	
 																	b2.setEnabled(false);
 																	b5.setEnabled(false);
 																}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, obj.getMessage());
 																}
 															}
 															if(e.getSource()==b3)
 															{
 																frm.dispose();
 															}
 															if(e.getSource()==b4)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																FacultyDetails f=new FacultyDetails();
 															}
 														}
	
													}
													EditFaculty g=new EditFaculty();
												}
 												if(e.getSource()==b3)
 												{
	 	 											frm.getContentPane().removeAll();
													frm.repaint();
													
	 												class SearchFaculty implements ActionListener
													{ 
														ImageIcon img;
														JLabel limg,ltitle,lid, j2, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14 ;
														JTextField tid,  t2, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
														JButton b, b1, bsearch;
														Font f, f1, f2, f3, f4;
														public SearchFaculty()
														{
															frm.setTitle("Search Faculty");
															
  															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  		
  															img=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon17.png");
		
															limg=new JLabel(img);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("SEARCH FACULTY");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
		
		
															lid=new JLabel("Enter ID :");
															lid.setBounds(100,100,150,26);
															lid.setFont(f1);
															lid.setForeground(Color.WHITE);
															frm.add(lid);
		
															tid=new JTextField();
															tid.setBounds(270, 100, 110, 26);
															tid.setBorder(null);
															tid.setFont(f1);
															frm.add(tid);
		
															bsearch=new JButton("SEARCH");
															bsearch.setBounds(400,100,80,26);
															bsearch.setFont(f1);
															bsearch.setForeground(clr1);
															bsearch.setBackground(clr);
															bsearch.setBorder(null);
															frm.add(bsearch);
			
															j2=new JLabel("Full Name :", SwingConstants.RIGHT);
															j2.setBounds(140,160,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															j2.setVisible(false);
		
															t2=new JTextField();
															t2.setBounds(290,160,200,20);
															t2.setBorder(null);
															t2.setBackground(clr1);
															t2.setForeground(Color.WHITE);
															t2.setFont(f3);
															frm.add(t2);
		
			
															j4=new JLabel("Gender :", SwingConstants.RIGHT);
															j4.setBounds(140,180,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															j4.setVisible(false);
		
															t4=new JTextField();
															t4.setBounds(290,180,70,20);
															t4.setBorder(null);
															t4.setBackground(clr1);
															t4.setForeground(Color.WHITE);
															t4.setFont(f3);
															frm.add(t4);
		
															j5=new JLabel("Date of Birth :", SwingConstants.RIGHT);
															j5.setBounds(140,200,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
															j5.setVisible(false);
		
															t5=new JTextField();
															t5.setBounds(290,200,180,20);
															t5.setBorder(null);
															t5.setBackground(clr1);
															t5.setForeground(Color.WHITE);
															t5.setFont(f3);
															frm.add(t5);
		
															j6=new JLabel("Address :", SwingConstants.RIGHT);
															j6.setBounds(140,220,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															j6.setVisible(false);
		
															t6=new JTextField();
															t6.setBounds(290,220,350,20);
															t6.setBorder(null);
															t6.setBackground(clr1);
															t6.setForeground(Color.WHITE);
															t6.setFont(f3);
															frm.add(t6);
		
															j7=new JLabel("Joining Date :", SwingConstants.RIGHT);
															j7.setBounds(140,240,110,20);
															j7.setFont(f1);
															j7.setForeground(Color.WHITE);
															frm.add(j7);
															j7.setVisible(false);
		
															t7=new JTextField();
															t7.setBounds(290,240,180,20);
															t7.setBorder(null);
															t7.setBackground(clr1);
															t7.setForeground(Color.WHITE);
															t7.setFont(f3);
															frm.add(t7);
		
															j8=new JLabel("Phone No :", SwingConstants.RIGHT);
															j8.setBounds(140,260,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
															j8.setVisible(false);
		
															t8=new JTextField();
															t8.setBounds(290,260,150,20);
															t8.setBorder(null);
															t8.setBackground(clr1);
															t8.setForeground(Color.WHITE);
															t8.setFont(f3);
															frm.add(t8);	
		
															j9=new JLabel("Qualification :", SwingConstants.RIGHT);
															j9.setBounds(140,280,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
															j9.setVisible(false);
		
															t9=new JTextField();
															t9.setBounds(290,280,150,20);
															t9.setBorder(null);
															t9.setBackground(clr1);
															t9.setForeground(Color.WHITE);
															t9.setFont(f3);
															frm.add(t9);
		
															j10=new JLabel("Salary :", SwingConstants.RIGHT);
															j10.setBounds(140,300,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
															j10.setVisible(false);
										
															t10=new JTextField();
															t10.setBounds(290,300,100,20);
															t10.setBorder(null);
															t10.setBackground(clr1);
															t10.setForeground(Color.WHITE);
															t10.setFont(f3);
															frm.add(t10);
		
															j11=new JLabel("Department :", SwingConstants.RIGHT);
															j11.setBounds(140,320,110,20);	
															j11.setFont(f1);
															j11.setForeground(Color.WHITE);
															frm.add(j11);
															j11.setVisible(false);
		
															t11=new JTextField();
															t11.setBounds(290,320,250,20);
															t11.setBorder(null);
															t11.setBackground(clr1);
															t11.setForeground(Color.WHITE);
															t11.setFont(f3);
															frm.add(t11);	
		
															j12=new JLabel("Email ID :", SwingConstants.RIGHT);
															j12.setBounds(140,340,110,20);
															j12.setFont(f1);
															j12.setForeground(Color.WHITE);
															frm.add(j12);
															j12.setVisible(false);
		
															t12=new JTextField();
															t12.setBounds(290,340,250,20);
															t12.setBorder(null);
															t12.setBackground(clr1);
															t12.setForeground(Color.WHITE);
															t12.setFont(f3);
															frm.add(t12);
		
															j13=new JLabel("Designation :", SwingConstants.RIGHT);
															j13.setBounds(140,360,110,20);
															j13.setFont(f1);
															j13.setForeground(Color.WHITE);
															frm.add(j13);
															j13.setVisible(false);
		
															t13=new JTextField();
															t13.setBounds(290,360,100,20);
															t13.setBorder(null);
															t13.setBackground(clr1);
															t13.setForeground(Color.WHITE);
															t13.setFont(f3);
															frm.add(t13);
		
															j14=new JLabel("Marital Stauts :", SwingConstants.RIGHT);
															j14.setBounds(140,380,110,20);
															j14.setFont(f1);
															j14.setForeground(Color.WHITE);
															frm.add(j14);
															j14.setVisible(false);
			
															t14=new JTextField();
															t14.setBounds(290,380,150,20);
															t14.setBorder(null);
															t14.setBackground(clr1);
															t14.setForeground(Color.WHITE);
															t14.setFont(f3);
															frm.add(t14);
															
															b=new JButton(img5);
															b.setBounds(700,30,40,40);
															b.setBackground(clr1);
															b.setBorder(null);
															frm.add(b);
															
															b1=new JButton("EXIT");
															b1.setBounds(575,430,100,30);
															b1.setBackground(clr);
															b1.setForeground(clr1);
															b1.setFont(f2);
															b1.setBorder(null);
															frm.add(b1);
		
															bsearch.addActionListener(this);
															b.addActionListener(this);
															b1.addActionListener(this);
														}
	
														public void actionPerformed(ActionEvent e)
 														{
    														if(e.getSource()==bsearch)
 															{
 																j2.setVisible(true);
 																j4.setVisible(true);
 																j5.setVisible(true);
 																j6.setVisible(true);
 																j7.setVisible(true);
 																j8.setVisible(true);
 																j9.setVisible(true);
 																j10.setVisible(true);
 																j11.setVisible(true);
 																j12.setVisible(true);
 																j13.setVisible(true);
 																j14.setVisible(true);
 																try
 																{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="select * from FacultyDetails where ID="+tid.getText();
 																	ResultSet res=state.executeQuery(q);
 																	if(!res.next())
 																	{
 																		j2.setVisible(false);
 																		j4.setVisible(false);
 																		j5.setVisible(false);
 																		j6.setVisible(false);
 																		j7.setVisible(false);
 																		j8.setVisible(false);
 																		j9.setVisible(false);
 																		j10.setVisible(false);
 																		j11.setVisible(false);
 																		j12.setVisible(false);
 																		j13.setVisible(false);
 																		j14.setVisible(false);
 																		t2.setText("");
 																		t4.setText("");
 																		t5.setText("");
 																		t6.setText("");
 																		t7.setText("");
 																		t8.setText("");
 																		t9.setText("");
 																		t10.setText("");
 																		t11.setText("");
 																		t12.setText("");
 																		t13.setText("");
 																		t14.setText("");
 																		JOptionPane.showMessageDialog(null, "Not Found");	
 														 			}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+res.getString("Last_Name"));
 																		t4.setText(res.getString("Gender"));
 																		t5.setText(res.getString("Date_of_Birth"));
 																		t6.setText(res.getString("Address"));
 																		t7.setText(res.getString("Joining_Date"));
 																		t8.setText(res.getString("Phone_No"));	
 																		t9.setText(res.getString("Qualification"));
 																		t10.setText(res.getString("Salary"));	
 																		t11.setText(res.getString("Department"));
 																		t12.setText(res.getString("Email_ID"));
 																		t13.setText(res.getString("Designation"));
 																		t14.setText(res.getString("Marital_Status"));
 																		
 																		t2.setEditable(false);
 																		t4.setEditable(false);
 																		t5.setEditable(false);
 																		t6.setEditable(false);
 																		t7.setEditable(false);
 																		t8.setEditable(false);
 																		t9.setEditable(false);
 																		t10.setEditable(false);
 																		t11.setEditable(false);
 																		t12.setEditable(false);
 																		t13.setEditable(false);
 																		t14.setEditable(false);
 																	}
 																}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, obj.getMessage());
 																}
	 														}
	 														if(e.getSource()==b)
	 														{
	 															frm.getContentPane().removeAll();
 																frm.repaint();
 																FacultyDetails f=new FacultyDetails();
	 														}
	 														if(e.getSource()==b1)
	 														{
	 															frm.dispose();
	 														}
 														}
													}
													SearchFaculty s=new SearchFaculty();
												}
	 											if(e.getSource()==b4)
 												{
 													frm.dispose();
 												}
 												if(e.getSource()==b5)
 												{
 													frm.getContentPane().removeAll();
 													frm.repaint();
 													Mainform m=new Mainform();
 												}
											}
										}
										FacultyDetails a=new FacultyDetails();
 									}
 									 if(e.getSource()==j2)
 									{
 										frm.getContentPane().removeAll();
										frm.repaint();
 										class BasicSalary implements ActionListener
 										{
 											JButton b, bincentive, bedit, bleave, eleave, bresult, bexit;
 											Font f, f1, f2, f3, f4, f5;
 											ImageIcon img1, img2, img3, img4, img5, img6, img7;
 											JLabel j1, j11, j2, j21, j3, j31, j4, j41, j5, j51, j6, j61;
 											
 											public BasicSalary() 
 											{
 												frm.setTitle("Salary");
 												
 												f=new Font("Times New Roman",Font.PLAIN, 50);
  												f1=new Font("Times New Roman",Font.PLAIN, 18);
  												f2=new Font("Times New Roman",Font.PLAIN, 20);
  												f3=new Font("Century Gothic",Font.PLAIN, 17);
  												f4=new Font("Century Gothic",Font.BOLD, 12);
  												f5=new Font("Times New Roman",Font.PLAIN, 16);
  												
  												img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
  												img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon21.png");
  												img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon22.png");
  												img3=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon23.png");
  												img4=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon24.png");
  												img6=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon25.png");
  												img7=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon26.png");
  															
 												bincentive=new JButton(img1);
 												bincentive.setBounds(215,100,90,90);
												bincentive.setBackground(clr1);
												bincentive.setBorder(null);
												frm.add(bincentive);
												
												bedit=new JButton(img2);
 												bedit.setBounds(355,100,90,90);
												bedit.setBackground(clr1);
												bedit.setBorder(null);
												frm.add(bedit);
												
												bleave=new JButton(img3);
 												bleave.setBounds(495,100,90,90);
												bleave.setBackground(clr1);
												bleave.setBorder(null);
												frm.add(bleave);
												
												
												eleave=new JButton(img4);
 												eleave.setBounds(215,260,90,90);
												eleave.setBackground(clr1);
												eleave.setBorder(null);
												frm.add(eleave);
												
												bresult=new JButton(img6);
 												bresult.setBounds(355,260,90,90);
												bresult.setBackground(clr1);
												bresult.setBorder(null);
												frm.add(bresult);
												
												bexit=new JButton(img7);
 												bexit.setBounds(495,260,90,90);
												bexit.setBackground(clr1);
												bexit.setBorder(null);
												frm.add(bexit);
												
												j1=new JLabel("Add");
												j1.setBounds(215,200,90,20);
  												j1.setHorizontalAlignment(JLabel.CENTER);
  												j1.setFont(f1);
  												j1.setForeground(Color.WHITE);
  												frm.add(j1);
  												
  												j11=new JLabel("Allowance");
												j11.setBounds(215,220,90,20);
  												j11.setHorizontalAlignment(JLabel.CENTER);
  												j11.setFont(f1);
  												j11.setForeground(Color.WHITE);
  												frm.add(j11);
  									
												j2=new JLabel("Edit");
												j2.setBounds(355,200,90,20);
  												j2.setHorizontalAlignment(JLabel.CENTER);
  												j2.setFont(f1);
  												j2.setForeground(Color.WHITE);
  												frm.add(j2);
  												
  												j21=new JLabel("Allowance");
												j21.setBounds(355,220,90,20);
  												j21.setHorizontalAlignment(JLabel.CENTER);
  												j21.setFont(f1);
  												j21.setForeground(Color.WHITE);
  												frm.add(j21);
												
												j3=new JLabel("Add");
												j3.setBounds(495,200,90,20);
  												j3.setHorizontalAlignment(JLabel.CENTER);
  												j3.setFont(f1);
  												j3.setForeground(Color.WHITE);
  												frm.add(j3);
  												
  												j31=new JLabel("Leave");
												j31.setBounds(495,220,90,20);
  												j31.setHorizontalAlignment(JLabel.CENTER);
  												j31.setFont(f1);
  												j31.setForeground(Color.WHITE);
  												frm.add(j31);
  												
												j4=new JLabel("Edit");
												j4.setBounds(215,360,90,20);
  												j4.setHorizontalAlignment(JLabel.CENTER);
  												j4.setFont(f1);
  												j4.setForeground(Color.WHITE);
  												frm.add(j4);
  												
  												j41=new JLabel("Leave");
												j41.setBounds(215,380,90,20);
  												j41.setHorizontalAlignment(JLabel.CENTER);
  												j41.setFont(f1);
  												j41.setForeground(Color.WHITE);
  												frm.add(j41);
  												
  												j5=new JLabel("Total");
												j5.setBounds(355,360,90,20);
  												j5.setHorizontalAlignment(JLabel.CENTER);
  												j5.setFont(f1);
  												j5.setForeground(Color.WHITE);
  												frm.add(j5);
  												
  												j51=new JLabel("Salary");
												j51.setBounds(355,380,90,20);
  												j51.setHorizontalAlignment(JLabel.CENTER);
  												j51.setFont(f1);
  												j51.setForeground(Color.WHITE);
  												frm.add(j51);
  												
  												j6=new JLabel("Exit");
												j6.setBounds(495,360,90,20);
  												j6.setHorizontalAlignment(JLabel.CENTER);
  												j6.setFont(f1);
  												j6.setForeground(Color.WHITE);
  												frm.add(j6);
												
												b=new JButton(img5);
												b.setBounds(700,30,40,40);
												b.setBackground(clr1);
												b.setBorder(null);
												frm.add(b);
												
												bincentive.addActionListener(this);
												bedit.addActionListener(this);
												bleave.addActionListener(this);
												eleave.addActionListener(this);
												bresult.addActionListener(this);
												bexit.addActionListener(this);
												b.addActionListener(this);
												
												
 											
 											}
 											
 											public void actionPerformed(ActionEvent bb)
 											{
 												if(bb.getSource()==bincentive)
 												{
 													frm.getContentPane().removeAll();
													frm.repaint();
													
													class Incentive implements ActionListener
													{
														JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, jper, jamt, ltotal, limg, ltitle;
 														JTextField t1, t2, t3, t4, t5, t6, thra, thra1, tda, tda1, tta, tta1, ttotal;
 														JButton b1, b2, b3, b5;
 														Font f, f1, f2, f3, f4, f5;
 														ImageIcon img1, img2, img5;
 														
 														
 														public Incentive()
 														{
 															frm.setTitle("Add Allowance");
 															
 															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  															f5=new Font("Times New Roman",Font.PLAIN, 22);
  															
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
 															img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon19.png");
 															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
 															
 															limg=new JLabel(img2);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("ADD ALLOWANCE");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
 															
 															j1=new JLabel("ID");
 															j1.setBounds(40,115,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
															
															t1=new JTextField();
 															t1.setBounds(190, 115, 150, 20);
															t1.setBorder(null);
															t1.setFont(f4);
															frm.add(t1);
															t1.setEditable(false);
 															
 															j2=new JLabel("Name");
 															j2.setBounds(40,155,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															
															t2=new JTextField();
 															t2.setBounds(190, 155, 150, 20);
															t2.setBorder(null);
															t2.setFont(f4);
															frm.add(t2);
															t2.setEditable(false);
															
 															j3=new JLabel("Designation");
 															j3.setBounds(40,195,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
 															
 															t3=new JTextField();
 															t3.setBounds(190,195,150,20);
															t3.setBorder(null);
															t3.setFont(f4);
															frm.add(t3);
															t3.setEditable(false);
 															
 															j4=new JLabel("Department");
 															j4.setBounds(420,115,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															
															t4=new JTextField();
 															t4.setBounds(570,115,150,20);
															t4.setBorder(null);
															t4.setFont(f4);
															frm.add(t4);
															t4.setEditable(false);
 															
 															j5=new JLabel("Date of Join");
 															j5.setBounds(420,155,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
 															
 															t5=new JTextField();
 															t5.setBounds(570,155,150,20);
															t5.setBorder(null);
															t5.setFont(f4);
															frm.add(t5);
															t5.setEditable(false);
 															
 															j6=new JLabel("Salary");
 															j6.setBounds(420,195,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															
															t6=new JTextField();
 															t6.setBounds(570,195,150,20);
															t6.setBorder(null);
															t6.setFont(f4);
															frm.add(t6);
															t6.setEditable(false);
															
															j7=new JLabel("Allowance Info:");
 															j7.setBounds(40,270,150,25);
															j7.setFont(f2);
															j7.setForeground(clr);
															frm.add(j7);
															
															jper=new JLabel("Percentage%",SwingConstants.LEFT);
															jper.setBounds(270,290,110,30);
															jper.setFont(f4);
															jper.setForeground(Color.WHITE);
															frm.add(jper);
										
															jamt=new JLabel("Amount(Rs)",SwingConstants.LEFT);
 															jamt.setBounds(370,290,110,30);
															jamt.setFont(f4);
															jamt.setForeground(Color.WHITE);
															frm.add(jamt);
 															
 															j8=new JLabel("HRA");
 															j8.setBounds(150,320,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
															
															thra=new JTextField();
															thra.setBounds(270,320,50,20);
															thra.setBorder(null);
															thra.setFont(f4);
															frm.add(thra);
															thra.setEditable(false);
															
 															thra1=new JTextField();
															thra1.setBounds(370,320,100,20);
															thra1.setBorder(null);
															thra1.setFont(f4);
															frm.add(thra1);
															thra1.setEnabled(false);
															
 															j9=new JLabel("DA");
 															j9.setBounds(150,360,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
															
															tda=new JTextField();
															tda.setBounds(270,360,50,20);
															tda.setBorder(null);
															tda.setFont(f4);
															frm.add(tda);
															tda.setEditable(false);
															
															tda1=new JTextField();
															tda1.setBounds(370,360,100,20);
															tda1.setBorder(null);
															tda1.setFont(f4);
															frm.add(tda1);
															tda1.setEnabled(false);
 															
 															j10=new JLabel("TA");
 															j10.setBounds(150,400,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
 															
 															tta=new JTextField();
															tta.setBounds(270,400,50,20);
															tta.setBorder(null);
															tta.setFont(f4);
															frm.add(tta);
															tta.setEditable(false);
 															
 															tta1=new JTextField();
															tta1.setBounds(370,400,100,20);
															tta1.setBorder(null);
															tta1.setFont(f4);
															frm.add(tta1);
															tta1.setEnabled(false);
															
															ltotal=new JLabel("Total Allowance");
															ltotal.setBounds(540,320,150,20);
															ltotal.setFont(f1);
															ltotal.setForeground(clr);
															frm.add(ltotal);
															
															ttotal=new JTextField();
															ttotal.setBounds(540,350,150,20);
															ttotal.setBorder(null);
															ttotal.setBackground(clr1);
															ttotal.setForeground(Color.WHITE);
															ttotal.setFont(f1);
															frm.add(ttotal);
															ttotal.setEnabled(false);
															
															b1=new JButton(img1);
															b1.setBounds(350,110,30,30);
															b1.setBackground(clr1);
															b1.setBorder(null);
															frm.add(b1);
															
															b2=new JButton("Calculate");
															b2.setBounds(350,450,100,30);
															b2.setBackground(clr);
															b2.setBorder(null);
															b2.setFont(f1);
															frm.add(b2);
															b2.setEnabled(true);
															
															b3=new JButton("SAVE");
															b3.setBounds(570,390,100,30);
															b3.setBackground(clr);
															b3.setBorder(null);
															b3.setFont(f1);
															frm.add(b3);
															b3.setEnabled(true);
															
															b5=new JButton(img5);
															b5.setBounds(700,30,40,40);
															b5.setBackground(clr1);
															b5.setBorder(null);
															frm.add(b5);
 																
															
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															
															b5.addActionListener(this);
															
															
															try
 															{	
 																Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																Statement state=con.createStatement();
 																ResultSet rs=state.executeQuery("select MAX(ID1) from Salary1");
 																if(rs.next())
 																{
 																	int id=Integer.parseInt(rs.getString(1));
 																	id++;
 																	t1.setText(String.valueOf(id));
			 													}
 															}
 															catch(Exception a)
 															{
 																System.out.println(a);
 															}
 															t1.setEditable(false);
															
															}
															
															public void actionPerformed(ActionEvent e)
 															{
 																if(e.getSource()==b1)
 																{
 																
 																	try
 																	{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="select * from FacultyDetails where ID="+t1.getText();
 																	ResultSet res=state.executeQuery(q);
 																	
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+res.getString("Last_Name"));
 																		t3.setText(res.getString("Designation"));
 																		t4.setText(res.getString("Department"));
 																		t5.setText(res.getString("Joining_Date"));
 																		t6.setText(res.getString("Salary"));
 																		
 																		//thra1.setEnabled(true);
 																		thra.setEditable(true);
 																		//tda1.setEnabled(true);
 																		tda.setEditable(true);
 																		tta.setEditable(true);
 																		//tta1.setEnabled(true);
 																		
 															
 																	}
 																	
 																	
 																	}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, "Please Enter Correct ID");
 																}
 																}
 																
 																if(e.getSource()==b2)
 																{
 																	if((thra.getText().toString().length()==0)||(tda.getText().toString().length()==0)||(tta.getText().toString().length()==0))
																	{
																		
																		JOptionPane.showMessageDialog(null, "Please Fill all Fields");
																		//b2.setEnabled(false);
																		
																	}
																	else
																	{
																		
																		thra1.setEnabled(true);
																		thra1.setEditable(false);
																		tda1.setEnabled(true);
																		tda1.setEditable(false);
																		tta1.setEnabled(true);
																		tta1.setEditable(false);
																		
																		
																		int hra;
 																	hra = Integer.parseInt(t6.getText());
 																	int hr1;
 																	hr1=hra*Integer.parseInt(thra.getText())/100;
 																	thra1.setText(Integer.toString(hr1));
 																	
 																	int da;
 																	da = Integer.parseInt(t6.getText());
 																	int d1;
 																	d1=da*Integer.parseInt(tda.getText())/100;
 																	tda1.setText(Integer.toString(d1));
 																	
 																	int ttta;
 																	ttta = Integer.parseInt(t6.getText());
 																	int ttta1;
 																	ttta1=ttta*Integer.parseInt(tta.getText())/100;
 																	tta1.setText(Integer.toString(ttta1));
 																	
 																	ttotal.setText(Integer.toString(hr1+d1+ttta1));
																	}
 																	
 																	
 																	
 																}
 																if(e.getSource()==b3)
 																{
 																	
 																	
 																	
 																	try
 																	{
 																		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																		Connection c=DriverManager.getConnection("jdbc:odbc:fclty");
 																		Statement st=c.createStatement();
 																		String qr="insert into Salary1 values("+Integer.parseInt(t1.getText())+", "+Integer.parseInt(thra.getText())+", "+Integer.parseInt(tda.getText())+", "+Integer.parseInt(tta.getText())+","+Integer.parseInt(thra1.getText())+", "+Integer.parseInt(tda1.getText())+", "+Integer.parseInt(tta1.getText())+", "+Integer.parseInt(ttotal.getText())+")";
 																		st.executeUpdate(qr);
 																		JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	}
 																	catch(Exception obj)
 																	{
 																		JOptionPane.showMessageDialog(null, "Format Mismatch");
 																	}
 																	
 																}
 																if(e.getSource()==b5)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																BasicSalary b=new BasicSalary();
 															}
 																
 																}
 															
 														}
													Incentive i=new Incentive();
 												}
 											
 											if(bb.getSource()==bedit)
 												{
 													frm.getContentPane().removeAll();
													frm.repaint();
													
													class EditIncentive implements ActionListener
													{
														JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, jper, jamt, ltotal, limg, ltitle;
 														JTextField t1, t2, t3, t4, t5, t6, thra, thra1, tda, tda1, tta, tta1, ttotal;
 														JButton b1, b2, b3, b4, b5;
 														Font f, f1, f2, f3, f4, f5;
 														ImageIcon img1, img2, img5;
 														
 														
 														public EditIncentive()
 														{
 															frm.setTitle("Edit Allowance");
 															
 															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  															f2=new Font("Times New Roman",Font.PLAIN, 22);
  															
  															
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
  															img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon27.png");
  															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
  															
  															limg=new JLabel(img2);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("EDIT ALLOWANCE");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
 															
 															j1=new JLabel("ID");
 															j1.setBounds(40,115,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
															
															t1=new JTextField();
 															t1.setBounds(190, 115, 150, 20);
															t1.setBorder(null);
															t1.setFont(f4);
															frm.add(t1);
																		
 															
 															j2=new JLabel("Name");
 															j2.setBounds(40,155,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															
															t2=new JTextField();
 															t2.setBounds(190, 155, 150, 20);
															t2.setBorder(null);
															t2.setFont(f4);
															frm.add(t2);
															t2.setEditable(false);
 																		
															
 															j3=new JLabel("Designation");
 															j3.setBounds(40,195,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
 															
 															t3=new JTextField();
 															t3.setBounds(190,195,150,20);
															t3.setBorder(null);
															t3.setFont(f4);
															frm.add(t3);
															t3.setEditable(false);
 																		
 															
 															j4=new JLabel("Department");
 															j4.setBounds(420,115,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															
															t4=new JTextField();
 															t4.setBounds(570,115,150,20);
															t4.setBorder(null);
															t4.setFont(f4);
															frm.add(t4);
 															t4.setEditable(false);
 																		
 															j5=new JLabel("Date of Join");
 															j5.setBounds(420,155,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
 															
 															t5=new JTextField();
 															t5.setBounds(570,155,150,20);
															t5.setBorder(null);
															t5.setFont(f4);
															frm.add(t5);
 															t5.setEditable(false);
 																		
 															j6=new JLabel("Salary");
 															j6.setBounds(420,195,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															
															t6=new JTextField();
 															t6.setBounds(570,195,150,20);
															t6.setBorder(null);
															t6.setFont(f4);
															frm.add(t6);
															t6.setEditable(false);
																		
															
															j7=new JLabel("Allowance Info:");
 															j7.setBounds(40,270,150,25);
															j7.setFont(f5);
															j7.setForeground(clr);
															frm.add(j7);
															
															jper=new JLabel("Percentage%",SwingConstants.LEFT);
															jper.setBounds(270,290,110,30);
															jper.setFont(f4);
															jper.setForeground(Color.WHITE);
															frm.add(jper);
										
															jamt=new JLabel("Amount(Rs)",SwingConstants.LEFT);
 															jamt.setBounds(370,290,110,30);
															jamt.setFont(f4);
															jamt.setForeground(Color.WHITE);
															frm.add(jamt);
 															
 															j8=new JLabel("HRA");
 															j8.setBounds(150,320,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
															
															thra=new JTextField();
															thra.setBounds(270,320,50,20);
															thra.setBorder(null);
															thra.setFont(f4);
															frm.add(thra);
															thra.setEditable(false);
															
 															thra1=new JTextField();
															thra1.setBounds(370,320,100,20);
															thra1.setBorder(null);
															thra1.setFont(f4);
															frm.add(thra1);
															thra1.setEditable(false);
															
 															j9=new JLabel("DA");
 															j9.setBounds(150,360,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
															
															tda=new JTextField();
															tda.setBounds(270,360,50,20);
															tda.setBorder(null);
															tda.setFont(f4);
															frm.add(tda);
															tda.setEditable(false);
															
															tda1=new JTextField();
															tda1.setBounds(370,360,100,20);
															tda1.setBorder(null);
															tda1.setFont(f4);
															frm.add(tda1);
															tda1.setEditable(false);
 															
 															j10=new JLabel("TA");
 															j10.setBounds(150,400,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
 															
 															tta=new JTextField();
															tta.setBounds(270,400,50,20);
															tta.setBorder(null);
															tta.setFont(f4);
															frm.add(tta);
															tta.setEditable(false);
 															
 															tta1=new JTextField();
															tta1.setBounds(370,400,100,20);
															tta1.setBorder(null);
															tta1.setFont(f4);
															frm.add(tta1);
															tta1.setEditable(false);
															
															ltotal=new JLabel("Total Allowance");
															ltotal.setBounds(540,320,150,20);
															ltotal.setFont(f1);
															ltotal.setForeground(clr);
															frm.add(ltotal);
															
															ttotal=new JTextField();
															ttotal.setBounds(540,350,150,20);
															ttotal.setBorder(null);
															ttotal.setBackground(clr1);
															ttotal.setForeground(Color.WHITE);
															ttotal.setFont(f1);
															frm.add(ttotal);
															ttotal.setEnabled(false);
															
															b1=new JButton(img1);
															b1.setBounds(350,110,30,30);
															b1.setBackground(clr1);
															b1.setBorder(null);
															frm.add(b1);
															
															b2=new JButton("Calculate");
															b2.setBounds(350,450,100,30);
															b2.setBackground(clr);
															b2.setFont(f1);
															b2.setBorder(null);
															frm.add(b2);
															b2.setEnabled(true);
															
															b3=new JButton("SAVE");
															b3.setBounds(570,390,100,30);
															b3.setBackground(clr);
															b3.setFont(f1);
															b3.setBorder(null);
															frm.add(b3);
															b3.setEnabled(true);
															
															b4=new JButton("EDIT");
															b4.setBounds(200,450,100,30);
															b4.setBackground(clr);
															b4.setFont(f1);
															b4.setBorder(null);
															frm.add(b4);
															b4.setEnabled(true);
															
															b5=new JButton(img5);
															b5.setBounds(700,30,40,40);
															b5.setBackground(clr1);
															b5.setBorder(null);
															frm.add(b5);
												
 																
															
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															b4.addActionListener(this);
															b5.addActionListener(this);
															
															}
															
															public void actionPerformed(ActionEvent e)
 															{
 																if(e.getSource()==b1)
 																{
 																
 																	try
 																	{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	//String q="select l.Name1, l.Designation, l.Department, l.Joining_Date, l.Salary , l.Total_Am, s.Total_Allow from Leave l, Salary1 s where l.ID=s.ID1 and ID="+t1.getText();
 																	
 																	
 																	String q="select f.First_Name, f.Last_Name, f.Designation, f.Department, f.Joining_Date, f.Salary , s.HRA_per, s.DRA_per, s.TA_per, s.HRA, s.DRA, s.TA, s.Total_Allow from FacultyDetails f, Salary1 s where f.ID=s.ID1 and ID="+t1.getText();
 																	
 																	ResultSet res=state.executeQuery(q);
 																	
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+(res.getString("Last_Name")));
 																		t3.setText(res.getString("Designation"));
 																		t4.setText(res.getString("Department"));
 																		t5.setText(res.getString("Joining_Date"));
 																		t6.setText(res.getString("Salary"));
 																		thra.setText(res.getString("HRA_per"));
 																		tda.setText(res.getString("DRA_per"));
 																		tta.setText(res.getString("TA_per"));
 																		thra1.setText(res.getString("HRA"));
 																		tda1.setText(res.getString("DRA"));
 																		tta1.setText(res.getString("TA"));
 																		ttotal.setText(res.getString("Total_Allow"));
 																		
 																		
 																		
 																		/*thra.setEnabled(false);
 																		tda.setEnabled(false);
 																		tta.setEnabled(false);*/
 																		
 																		b2.setEnabled(false);
 																		
 																		
 															
 																	}
 																	}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, "Please Enter Correct ID");
 																}
 																}
 																
 																if(e.getSource()==b2)
 																{
 																	if((thra.getText().toString().length()==0)||(tda.getText().toString().length()==0)||(tta.getText().toString().length()==0))
																	{
																		
																		JOptionPane.showMessageDialog(null, "Please Fill all Fields");
																		//b2.setEnabled(false);
																		
																	}
																	else
																	{
																		
																		//thra1.setEnabled(true);
																		thra1.setEditable(false);
																		//tda1.setEnabled(true);
																		tda1.setEditable(false);
																		//tta1.setEnabled(true);
																		tta1.setEditable(false);
																		
																		
																		
																		int hra;
 																	hra = Integer.parseInt(t6.getText());
 																	int hr1;
 																	hr1=hra*Integer.parseInt(thra.getText())/100;
 																	thra1.setText(Integer.toString(hr1));
 																	
 																	int da;
 																	da = Integer.parseInt(t6.getText());
 																	int d1;
 																	d1=da*Integer.parseInt(tda.getText())/100;
 																	tda1.setText(Integer.toString(d1));
 																	
 																	int ttta;
 																	ttta = Integer.parseInt(t6.getText());
 																	int ttta1;
 																	ttta1=ttta*Integer.parseInt(tta.getText())/100;
 																	tta1.setText(Integer.toString(ttta1));
 																	
 																	ttotal.setText(Integer.toString(hr1+d1+ttta1));
																	}
 																	
 																	
 																	
 																}
 																if(e.getSource()==b3)
 																{
 																	
 																	
 																	
 																	try
 																	{
 																		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																		Connection c=DriverManager.getConnection("jdbc:odbc:fclty");
 																		Statement st=c.createStatement();
 																		String qr="update Salary1 set  HRA_per='"+thra.getText()+"', DRA_per='"+tda.getText()+"', TA_per='"+tta.getText()+"', HRA='"+thra1.getText()+"', DRA='"+tda1.getText()+"',TA='"+tta1.getText()+"', Total_Allow='"+ttotal.getText()+"' where ID1="+t1.getText(); 
 																		st.executeUpdate(qr);
 																		JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	}
 																	catch(Exception obj)
 																	{
 																		JOptionPane.showMessageDialog(null, "Format Mismatch");
 																	}
 																	
 																}
 																if(e.getSource()==b4)
 																{
 																	//t6.setEditable(true);
																		
 																	
 																	thra.setEditable(true);
 																	tda.setEditable(true);
 																	tta.setEditable(true);
 																	
 																	b2.setEnabled(true);
 																}
 																
 																if(e.getSource()==b5)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																BasicSalary b=new BasicSalary();
 															}
 																
 																}
 															
 													
																}
													EditIncentive i=new EditIncentive();
 												}
 												
 												if(bb.getSource()==bleave)
 												{
 													frm.getContentPane().removeAll();
																frm.repaint();
																
													class LeaveDeduction implements ActionListener
													{
														JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, jper, jamt, ltotal, limg, ltitle;
 														JTextField t1, t2, t3, t4, t5, t6, tabs, tabs1, tcas, tcas1, tsic, tsic1, ttotal;
 														JButton b1, b2, b3, b5;
 														Font f, f1, f2, f3, f4, f5;
 														ImageIcon img1, img2, img5;
 														
 														
 														public LeaveDeduction()
 														{
 															frm.setTitle("Add Leave");
 															
 															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  															f5=new Font("Times New Roman",Font.PLAIN, 22);
  															
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
 															img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon20.png");
 															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
 															
 															limg=new JLabel(img2);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("ADD LEAVE");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
 															
 															j1=new JLabel("ID");
 															j1.setBounds(40,115,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
															
															t1=new JTextField();
 															t1.setBounds(190, 115, 150, 20);
															t1.setBorder(null);
															t1.setFont(f4);
															frm.add(t1);
 															
 															j2=new JLabel("Name");
 															j2.setBounds(40,155,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															
															
															t2=new JTextField();
 															t2.setBounds(190, 155, 150, 20);
															t2.setBorder(null);
															t2.setFont(f4);
															frm.add(t2);
															t2.setEditable(false);
															
															
 															j3=new JLabel("Designation");
 															j3.setBounds(40,195,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
 															
 															t3=new JTextField();
 															t3.setBounds(190,195,150,20);
															t3.setBorder(null);
															t3.setFont(f4);
															frm.add(t3);
															t3.setEditable(false);
 															
 															j4=new JLabel("Department");
 															j4.setBounds(420,115,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															
															t4=new JTextField();
 															t4.setBounds(570,115,150,20);
															t4.setBorder(null);
															t4.setFont(f4);
															frm.add(t4);
															t4.setEditable(false);
 															
 															j5=new JLabel("Date of Join");
 															j5.setBounds(420,155,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
															
 															
 															t5=new JTextField();
 															t5.setBounds(570,155,150,20);
															t5.setBorder(null);
															t5.setFont(f4);
															frm.add(t5);
 															t5.setEditable(false);
 															
 															j6=new JLabel("Salary");
 															j6.setBounds(420,195,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															
															t6=new JTextField();
 															t6.setBounds(570,195,150,20);
															t6.setBorder(null);
															t6.setFont(f4);
															frm.add(t6);
															t6.setEditable(false);
															
															j7=new JLabel("Leave Info:");
 															j7.setBounds(40,270,150,25);
															j7.setFont(f2);
															j7.setForeground(clr);
															frm.add(j7);
															
															jper=new JLabel("Total Leave",SwingConstants.LEFT);
															jper.setBounds(270,290,110,30);
															jper.setFont(f4);
															jper.setForeground(Color.WHITE);
															frm.add(jper);
										
															jamt=new JLabel("Amount(Rs)",SwingConstants.LEFT);
 															jamt.setBounds(370,290,110,30);
															jamt.setFont(f4);
															jamt.setForeground(Color.WHITE);
															frm.add(jamt);
 															
 															j8=new JLabel("Absent");
 															j8.setBounds(150,320,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
															
															tabs=new JTextField();
															tabs.setBounds(270,320,50,20);
															tabs.setBorder(null);
															tabs.setFont(f4);
															frm.add(tabs);
															tabs.setEnabled(false);
															
 															tabs1=new JTextField();
															tabs1.setBounds(370,320,100,20);
															tabs1.setBorder(null);
															tabs1.setFont(f4);
															frm.add(tabs1);
															tabs1.setEnabled(false);
															
 															j9=new JLabel("Casual");
 															j9.setBounds(150,360,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
															
															tcas=new JTextField();
															tcas.setBounds(270,360,50,20);
															tcas.setBorder(null);
															tcas.setFont(f4);
															frm.add(tcas);
															tcas.setEnabled(false);
															
															tcas1=new JTextField();
															tcas1.setBounds(370,360,100,20);
															tcas1.setBorder(null);
															tcas1.setFont(f4);
															frm.add(tcas1);
															tcas1.setEnabled(false);
 															
 															j10=new JLabel("Sickness");
 															j10.setBounds(150,400,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
 															
 															tsic=new JTextField();
															tsic.setBounds(270,400,50,20);
															tsic.setBorder(null);
															tsic.setFont(f4);
															frm.add(tsic);
															tsic.setEnabled(false);
 															
 															tsic1=new JTextField();
															tsic1.setBounds(370,400,100,20);
															tsic1.setBorder(null);
															tsic1.setFont(f4);
															frm.add(tsic1);
															tsic1.setEnabled(false);
															
															ltotal=new JLabel("Total Deduction");
															ltotal.setBounds(540,320,150,20);
															ltotal.setFont(f1);
															ltotal.setForeground(clr);
															frm.add(ltotal);
															
															ttotal=new JTextField();
															ttotal.setBounds(540,350,150,20);
															ttotal.setBorder(null);
															ttotal.setBackground(clr1);
															ttotal.setForeground(Color.WHITE);
															ttotal.setFont(f1);
															frm.add(ttotal);
															ttotal.setEnabled(false);
															
															b1=new JButton(img1);
															b1.setBounds(350,110,30,30);
															b1.setBackground(clr1);
															b1.setBorder(null);
															frm.add(b1);
															
															b2=new JButton("Calculate");
															b2.setBounds(350,450,100,30);
															b2.setBackground(clr);
															b2.setBorder(null);
															b2.setFont(f1);
															frm.add(b2);
															b2.setEnabled(true);
															
															b3=new JButton("SAVE");
															b3.setBounds(570,390,100,30);
															b3.setBackground(clr);
															b3.setBorder(null);
															b3.setFont(f1);
															frm.add(b3);
															b3.setEnabled(true);
															
															b5=new JButton(img5);
															b5.setBounds(700,30,40,40);
															b5.setBackground(clr1);
															b5.setBorder(null);
															frm.add(b5);
 																
															
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															
															b5.addActionListener(this);
															
															
															try
 															{	
 																Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																Statement state=con.createStatement();
 																ResultSet rs=state.executeQuery("select MAX(ID2) from Leave");
 																if(rs.next())
 																{
 																	int id=Integer.parseInt(rs.getString(1));
 																	id++;
 																	t1.setText(String.valueOf(id));
			 													}
 															}
 															catch(Exception a)
 															{
 																System.out.println(a);
 															}
 															t1.setEditable(false);
															
															}
															
															public void actionPerformed(ActionEvent e)
 															{
 																if(e.getSource()==b1)
 																{
 																
 																	try
 																	{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="select * from FacultyDetails where ID="+t1.getText();
 																	ResultSet res=state.executeQuery(q);
 																	
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+res.getString("Last_Name"));
 																		t3.setText(res.getString("Designation"));
 																		t4.setText(res.getString("Department"));
 																		t5.setText(res.getString("Joining_Date"));
 																		t6.setText(res.getString("Salary"));
 																		
 																		//thra1.setEnabled(true);
 																		tabs.setEnabled(true);
 																		//tda1.setEnabled(true);
 																		tcas.setEnabled(true);
 																		tsic.setEnabled(true);
 																		//tta1.setEnabled(true);
 																		
 															
 																	}
 																	
 																	
 																	}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, "Please Enter Correct ID");
 																}
 																}
 																
 																if(e.getSource()==b2)
 																{
 																	if((tabs.getText().toString().length()==0)||(tcas.getText().toString().length()==0)||(tsic.getText().toString().length()==0))
																	{
																		
																		JOptionPane.showMessageDialog(null, "Please Fill all Fields");
																		//b2.setEnabled(false);
																		
																	}
																	else
																	{
																		
																		tabs1.setEnabled(true);
																		tabs1.setEditable(false);
																		tcas1.setEnabled(true);
																		tcas1.setEditable(false);
																		tsic1.setEnabled(true);
																		tsic1.setEditable(false);
																		
																		
																		int hra;
 																	hra = Integer.parseInt(t6.getText());
 																	int hr1;
 																	hr1=hra*3*Integer.parseInt(tabs.getText())/100;
 																	tabs1.setText(Integer.toString(hr1));
 																	
 																	int da;
 																	da = Integer.parseInt(t6.getText());
 																	int d1;
 																	d1=da*2*Integer.parseInt(tcas.getText())/100;
 																	tcas1.setText(Integer.toString(d1));
 																	
 																	int ttta;
 																	ttta = Integer.parseInt(t6.getText());
 																	int ttta1;
 																	ttta1=ttta*1*Integer.parseInt(tsic.getText())/100;
 																	tsic1.setText(Integer.toString(ttta1));
 																	
 																	ttotal.setText(Integer.toString(hr1+d1+ttta1));
																	}
 																	
 																	
 																	
 																}
 																if(e.getSource()==b3)
 																{
 																	
 																	
 																	
 																	try
 																	{
 																		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																		Connection c=DriverManager.getConnection("jdbc:odbc:fclty");
 																		Statement st=c.createStatement();
 																		String qr="insert into Leave values("+Integer.parseInt(t1.getText())+", "+Integer.parseInt(tabs.getText())+", "+Integer.parseInt(tcas.getText())+", "+Integer.parseInt(tsic.getText())+","+Integer.parseInt(tabs1.getText())+", "+Integer.parseInt(tcas1.getText())+", "+Integer.parseInt(tsic1.getText())+", "+Integer.parseInt(ttotal.getText())+")";
 																		st.executeUpdate(qr);
 																		JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	}
 																	catch(Exception obj)
 																	{
 																		JOptionPane.showMessageDialog(null, "Format Mismatch");
 																	}
 																	
 																}
 																if(e.getSource()==b5)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																BasicSalary b=new BasicSalary();
 															}
 																
 																}
															
															
															
															
															
													}
													LeaveDeduction l=new LeaveDeduction();
 												}
 													
 													if(bb.getSource()==eleave)
 													{
 														frm.getContentPane().removeAll();
																frm.repaint();
 														class EditLeave implements ActionListener
 														{
 														JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, jper, jamt, ltotal, limg, ltitle;
 														JTextField t1, t2, t3, t4, t5, t6, tabs, tabs1, tcas, tcas1, tsic, tsic1, ttotal;
 														JButton b1, b2, b3, b4, b5;
 														Font f, f1, f2, f3, f4, f5;
 														ImageIcon img1, img2, img5;
 														
 														
 														public EditLeave()
 														{
 															frm.setTitle("Edit Leave");
 															
 															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  															f5=new Font("Times New Roman",Font.PLAIN, 22);
  															
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
 															img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon28.png");
 															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
 															
 															limg=new JLabel(img2);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("EDIT LEAVE");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
 															
 															j1=new JLabel("ID");
 															j1.setBounds(40,115,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
															
															t1=new JTextField();
 															t1.setBounds(190, 115, 150, 20);
															t1.setBorder(null);
															t1.setFont(f4);
															frm.add(t1);
																		
 															
 															j2=new JLabel("Name");
 															j2.setBounds(40,155,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															
															t2=new JTextField();
 															t2.setBounds(190, 155, 150, 20);
															t2.setBorder(null);
															t2.setFont(f4);
															frm.add(t2);
															t2.setEditable(false);
															
 															j3=new JLabel("Designation");
 															j3.setBounds(40,195,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
 															
 															t3=new JTextField();
 															t3.setBounds(190,195,150,20);
															t3.setBorder(null);
															t3.setFont(f4);
															frm.add(t3);
															t3.setEditable(false);
 															
 															j4=new JLabel("Department");
 															j4.setBounds(420,115,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															
															t4=new JTextField();
 															t4.setBounds(570,115,150,20);
															t4.setBorder(null);
															t4.setFont(f4);
															frm.add(t4);
															t4.setEditable(false);
 															
 															j5=new JLabel("Date of Join");
 															j5.setBounds(420,155,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
 															
 															t5=new JTextField();
 															t5.setBounds(570,155,150,20);
															t5.setBorder(null);
															t5.setFont(f4);
															frm.add(t5);
															t5.setEditable(false);
 															
 															j6=new JLabel("Salary");
 															j6.setBounds(420,195,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															
															t6=new JTextField();
 															t6.setBounds(570,195,150,20);
															t6.setBorder(null);
															t6.setFont(f4);
															frm.add(t6);
															t6.setEditable(false);
																		
															
															j7=new JLabel("Leave Info:");
 															j7.setBounds(40,270,150,25);
															j7.setFont(f2);
															j7.setForeground(clr);
															frm.add(j7);
															
															jper=new JLabel("Total Leave",SwingConstants.LEFT);
															jper.setBounds(270,290,110,30);
															jper.setFont(f4);
															jper.setForeground(Color.WHITE);
															frm.add(jper);
										
															jamt=new JLabel("Amount(Rs)",SwingConstants.LEFT);
 															jamt.setBounds(370,290,110,30);
															jamt.setFont(f4);
															jamt.setForeground(Color.WHITE);
															frm.add(jamt);
 															
 															j8=new JLabel("Absent");
 															j8.setBounds(150,320,110,20);
															j8.setFont(f1);
															j8.setForeground(Color.WHITE);
															frm.add(j8);
															
															tabs=new JTextField();
															tabs.setBounds(270,320,50,20);
															tabs.setBorder(null);
															tabs.setFont(f4);
															frm.add(tabs);
															tabs.setEditable(false);
															
 															tabs1=new JTextField();
															tabs1.setBounds(370,320,100,20);
															tabs1.setBorder(null);
															tabs1.setFont(f4);
															frm.add(tabs1);
															tabs1.setEditable(false);
															
 															j9=new JLabel("Casual");
 															j9.setBounds(150,360,110,20);
															j9.setFont(f1);
															j9.setForeground(Color.WHITE);
															frm.add(j9);
															
															tcas=new JTextField();
															tcas.setBounds(270,360,50,20);
															tcas.setBorder(null);
															tcas.setFont(f4);
															frm.add(tcas);
															tcas.setEditable(false);
															
															tcas1=new JTextField();
															tcas1.setBounds(370,360,100,20);
															tcas1.setBorder(null);
															tcas1.setFont(f4);
															frm.add(tcas1);
															tcas1.setEditable(false);
 															
 															j10=new JLabel("Sickness");
 															j10.setBounds(150,400,110,20);
															j10.setFont(f1);
															j10.setForeground(Color.WHITE);
															frm.add(j10);
 															
 															tsic=new JTextField();
															tsic.setBounds(270,400,50,20);
															tsic.setBorder(null);
															tsic.setFont(f4);
															frm.add(tsic);
															tsic.setEditable(false);
 															
 															tsic1=new JTextField();
															tsic1.setBounds(370,400,100,20);
															tsic1.setBorder(null);
															tsic1.setFont(f4);
															frm.add(tsic1);
															tsic1.setEditable(false);
															
															ltotal=new JLabel("Total Deduction");
															ltotal.setBounds(540,320,150,20);
															ltotal.setFont(f1);
															ltotal.setForeground(clr);
															frm.add(ltotal);
															
															ttotal=new JTextField();
															ttotal.setBounds(540,350,150,20);
															ttotal.setBorder(null);
															ttotal.setBackground(clr1);
															ttotal.setForeground(Color.WHITE);
															ttotal.setFont(f1);
															frm.add(ttotal);
															ttotal.setEnabled(false);
															
															b1=new JButton(img1);
															b1.setBounds(350,110,30,30);
															b1.setBackground(clr1);
															b1.setBorder(null);
															frm.add(b1);
															
															b2=new JButton("Calculate");
															b2.setBounds(350,450,100,30);
															b2.setBackground(clr);
															b2.setBorder(null);
															b2.setFont(f1);
															frm.add(b2);
															b2.setEnabled(true);
															
															b3=new JButton("SAVE");
															b3.setBounds(570,390,100,30);
															b3.setBackground(clr);
															b3.setBorder(null);
															b3.setFont(f1);
															frm.add(b3);
															b3.setEnabled(true);
															
															b4=new JButton("EDIT");
															b4.setBounds(200,450,100,30);
															b4.setBackground(clr);
															b4.setFont(f1);
															b4.setBorder(null);
															frm.add(b4);
															b4.setEnabled(true);
															
															b5=new JButton(img5);
															b5.setBounds(700,30,40,40);
															b5.setBackground(clr1);
															b5.setBorder(null);
															frm.add(b5);
 																
															
															b1.addActionListener(this);
															b2.addActionListener(this);
															b3.addActionListener(this);
															b4.addActionListener(this);
															b5.addActionListener(this);
															
															
															
															
															}
															
															public void actionPerformed(ActionEvent e)
 															{
 																if(e.getSource()==b1)
 																{
 																
 																	try
 																	{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	//String q="select f.First_Name, f.Last_Name, f.Designation, f.Department, f.Joining_Date, f.Salary , s.HRA_per, s.DRA_per, s.TA_per, s.HRA, s.DRA, s.TA, s.Total_Allow from FacultyDetails f, Salary1 s where f.ID=s.ID1 and ID="+t1.getText();
 																	
 																	String q="select f.First_Name, f.Last_Name, f.Designation, f.Department, f.Joining_Date, f.Salary, l.Absent, l.Casual, l.Sickness, l.Absent_Am, l.Casual_Am, l.Sickness_Am, l.Total_Am from FacultyDetails f, Leave l where f.ID=l.ID2 and ID="+t1.getText();
 																	ResultSet res=state.executeQuery(q);
 																	
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+(res.getString("Last_Name")));
 																		t3.setText(res.getString("Designation"));
 																		t4.setText(res.getString("Department"));
 																		t5.setText(res.getString("Joining_Date"));
 																		t6.setText(res.getString("Salary"));
 																		tabs.setText(res.getString("Absent"));
 																		tcas.setText(res.getString("Casual"));
 																		tsic.setText(res.getString("Sickness"));
 																		tabs1.setText(res.getString("Absent_Am"));
 																		tcas1.setText(res.getString("Casual_Am"));
 																		tsic1.setText(res.getString("Sickness_Am"));
 																		ttotal.setText(res.getString("Total_Am"));
 																		
 																		
 																		/*tabs.setEnabled(false);
 																		tcas.setEnabled(false);
 																		tsic.setEnabled(false);*/
 																		
 																		b2.setEnabled(false);
 																		
 																		
 															
 																	}
 																	}
 																catch(Exception obj)
 																{
 																	JOptionPane.showMessageDialog(null, "Please Enter Correct ID");
 																}
 																}
 																
 																if(e.getSource()==b2)
 																{
 																	if((tabs.getText().toString().length()==0)||(tcas.getText().toString().length()==0)||(tsic.getText().toString().length()==0))
																	{
																		
																		JOptionPane.showMessageDialog(null, "Please Fill all Fields");
																		//b2.setEnabled(false);
																		
																	}
																	else
																	{
																		
																		tabs1.setEnabled(true);
																		tabs1.setEditable(false);
																		tcas1.setEnabled(true);
																		tcas1.setEditable(false);
																		tsic1.setEnabled(true);
																		tsic1.setEditable(false);
																		
																		
																		int hra;
 																	hra = Integer.parseInt(t6.getText());
 																	int hr1;
 																	hr1=hra*3*Integer.parseInt(tabs.getText())/100;
 																	tabs1.setText(Integer.toString(hr1));
 																	
 																	int da;
 																	da = Integer.parseInt(t6.getText());
 																	int d1;
 																	d1=da*2*Integer.parseInt(tcas.getText())/100;
 																	tcas1.setText(Integer.toString(d1));
 																	
 																	int ttta;
 																	ttta = Integer.parseInt(t6.getText());
 																	int ttta1;
 																	ttta1=ttta*1*Integer.parseInt(tsic.getText())/100;
 																	tsic1.setText(Integer.toString(ttta1));
 																	
 																	ttotal.setText(Integer.toString(hr1+d1+ttta1));
																	}
 																	
 																	
 																	
 																}
 																if(e.getSource()==b3)
 																{
 																	
 																	
 																	
 																	try
 																	{
 																		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																		Connection c=DriverManager.getConnection("jdbc:odbc:fclty");
 																		Statement st=c.createStatement();
 																		String qr="update Leave set Absent='"+tabs.getText()+"', Casual='"+tcas.getText()+"', Sickness='"+tsic.getText()+"', Absent_Am='"+tabs1.getText()+"', Casual_Am='"+tcas1.getText()+"',Sickness_Am='"+tsic1.getText()+"', Total_Am='"+ttotal.getText()+"' where ID2="+t1.getText(); 
 																		st.executeUpdate(qr);
 																		JOptionPane.showMessageDialog(null, "Successfully Saved");
 																	}
 																	catch(Exception obj)
 																	{
 																		System.out.println(e);
 																		//JOptionPane.showMessageDialog(null, "Format Mismatch");
 																	}
 																	
 																}
 																
 																if(e.getSource()==b4)
 																{
 																	//t6.setEditable(true);
 																	
 																	tabs.setEditable(true);
 																	tcas.setEditable(true);
 																	tsic.setEditable(true);
 																	
 																	b2.setEnabled(true);
 																}
 																if(e.getSource()==b5)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																BasicSalary b=new BasicSalary();
 															}
 																
 																}		
 														}
 														EditLeave el=new EditLeave();
 													}
 													
 													if(bb.getSource()==bresult)
 													{
 														frm.getContentPane().removeAll();
																frm.repaint();
																
															class Salaryresult implements ActionListener
															{
																
																
																JLabel j1, j2, j3, j4, j5, j6, jallow, jdeduc, jtotal, limg, ltitle;
 														JTextField t1, t2, t3, t4, t5, t6, tallow, tdeduc, ttotal;
 														JButton b1, b2, b5;
 														Font f, f1, f2, f3, f4, f5;
 														ImageIcon img1, img2, img5;
 														
 														
 														public Salaryresult()
 														{
 															frm.setTitle("Total Salary");
																
 															
 															f=new Font("Times New Roman",Font.PLAIN, 50);
  															f1=new Font("Times New Roman",Font.PLAIN, 18);
  															f2=new Font("Times New Roman",Font.PLAIN, 20);
  															f3=new Font("Century Gothic",Font.PLAIN, 17);
  															f4=new Font("Century Gothic",Font.BOLD, 12);
  															f5=new Font("Times New Roman",Font.PLAIN, 22);
  															
  															img1=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon18.png");
 															img2=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon29.png");
 															img5=new ImageIcon("e:\\Projects\\Faculty Management\\Icons\\icon14.png");
 															
 															limg=new JLabel(img2);
															limg.setBounds(40,30,50,50);
															frm.add(limg);
																			
															ltitle=new JLabel("TOTAL SALARY");
															ltitle.setBounds(120,30,600,50);
															ltitle.setFont(f);
															ltitle.setForeground(clr);
															frm.add(ltitle);
 															
 															j1=new JLabel("ID");
 															j1.setBounds(40,115,110,20);
															j1.setFont(f1);
															j1.setForeground(Color.WHITE);
															frm.add(j1);
															
															t1=new JTextField();
 															t1.setBounds(190, 115, 150, 20);
															t1.setBorder(null);
															t1.setFont(f4);
															frm.add(t1);
																		
 															
 															j2=new JLabel("Name");
 															j2.setBounds(40,155,110,20);
															j2.setFont(f1);
															j2.setForeground(Color.WHITE);
															frm.add(j2);
															
															t2=new JTextField();
 															t2.setBounds(190, 155, 150, 20);
															t2.setBorder(null);
															t2.setFont(f4);
															frm.add(t2);
															t2.setEditable(false);
															
 															j3=new JLabel("Designation");
 															j3.setBounds(40,195,110,20);
															j3.setFont(f1);
															j3.setForeground(Color.WHITE);
															frm.add(j3);
 															
 															t3=new JTextField();
 															t3.setBounds(190,195,150,20);
															t3.setBorder(null);
															t3.setFont(f4);
															frm.add(t3);
															t3.setEditable(false);
 															
 															j4=new JLabel("Department");
 															j4.setBounds(420,115,110,20);
															j4.setFont(f1);
															j4.setForeground(Color.WHITE);
															frm.add(j4);
															
															t4=new JTextField();
 															t4.setBounds(570,115,150,20);
															t4.setBorder(null);
															t4.setFont(f4);
															frm.add(t4);
															t4.setEditable(false);
 															
 															j5=new JLabel("Date of Join");
 															j5.setBounds(420,155,110,20);
															j5.setFont(f1);
															j5.setForeground(Color.WHITE);
															frm.add(j5);
 															
 															t5=new JTextField();
 															t5.setBounds(570,155,150,20);
															t5.setBorder(null);
															t5.setFont(f4);
															frm.add(t5);
															t5.setEditable(false);
 															
 															j6=new JLabel("Salary");
 															j6.setBounds(420,195,110,20);
															j6.setFont(f1);
															j6.setForeground(Color.WHITE);
															frm.add(j6);
															
															t6=new JTextField();
 															t6.setBounds(570,195,150,20);
															t6.setBorder(null);
															t6.setFont(f4);
															frm.add(t6);
															t6.setEditable(false);
															
															jallow=new JLabel("Total Allowance");
 															jallow.setBounds(250,270,150,20);
															jallow.setFont(f1);
															jallow.setForeground(Color.WHITE);
															frm.add(jallow);
															
															tallow=new JTextField();
 															tallow.setBounds(400,270,100,20);
															tallow.setBorder(null);
															tallow.setFont(f4);
															frm.add(tallow);
															tallow.setEditable(false);
															
															jdeduc=new JLabel("Total Deduction");
 															jdeduc.setBounds(250,310,150,20);
															jdeduc.setFont(f1);
															jdeduc.setForeground(Color.WHITE);
															frm.add(jdeduc);
															
															tdeduc=new JTextField();
 															tdeduc.setBounds(400,310,100,20);
															tdeduc.setBorder(null);
															tdeduc.setFont(f4);
															frm.add(tdeduc);
															tdeduc.setEditable(false);
															
															jtotal=new JLabel("Total Salary");
 															jtotal.setBounds(250,350,150,20);
															jtotal.setFont(f1);
															jtotal.setForeground(Color.WHITE);
															frm.add(jtotal);
															
															ttotal=new JTextField();
 															ttotal.setBounds(400,350,100,20);
															ttotal.setBorder(null);
															ttotal.setFont(f4);
															frm.add(ttotal);
															ttotal.setEditable(false);
															
															
															b1=new JButton("SEARCH");
															b1.setBounds(420,400,100,30);
															b1.setBackground(clr);
															b1.setFont(f1);
															b1.setBorder(null);
															frm.add(b1);
															
															b5=new JButton(img5);
															b5.setBounds(700,30,40,40);
															b5.setBackground(clr1);
															b5.setBorder(null);
															frm.add(b5);
															
															b1.addActionListener(this);
															b5.addActionListener(this);
															
															}
															
															public void actionPerformed(ActionEvent ee)	
															{
																if(ee.getSource()==b1)
																{
																	try
 																	{
 			
 																	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 																	Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 																	Statement state=con.createStatement();
 																	String q="select f.First_Name, f.Last_Name, f.Designation, f.Department, f.Joining_Date, f.Salary, s.Total_Allow, l.Total_Am from FacultyDetails f, Salary1 s, Leave l where f.ID=s.ID1 and f.ID=l.ID2 and ID="+t1.getText();
 																	ResultSet res=state.executeQuery(q);
 																	
 																	if(!res.next())
 																	{
	 																	JOptionPane.showMessageDialog(null, "Not Found");
	 																}
 																	else
 																	{
 																		t2.setText(res.getString("First_Name")+" "+(res.getString("Last_Name")));
 																		t3.setText(res.getString("Designation"));
 																		t4.setText(res.getString("Department"));
 																		t5.setText(res.getString("Joining_Date"));
 																		t6.setText(res.getString("Salary"));
 																		
 																		tallow.setText(res.getString("Total_Allow"));
 																		tdeduc.setText(res.getString("Total_Am"));
 																		int al=Integer.parseInt(tallow.getText());
 																		int de=Integer.parseInt(tdeduc.getText());
 																		int tt=Integer.parseInt(t6.getText());
 																		int total1=tt+al-de;
 																		ttotal.setText(Integer.toString(total1));
 																		
 																		
 																		
 																		
 																		
 															
 																	}
 																	}
 																catch(Exception obj)
 																{
 																	
 																	System.out.println(obj);
 																	JOptionPane.showMessageDialog(null, "Please Enter Correct ID");
 																}
																}
																if(ee.getSource()==b5)
 															{
 																frm.getContentPane().removeAll();
																frm.repaint();
 																BasicSalary b=new BasicSalary();
 															}
															}
															
															}
															Salaryresult rs=new Salaryresult();
 													}
 													
 													if(bb.getSource()==bexit)
 													{
 														frm.dispose();
 													}
 											
 											if(bb.getSource()==b)
 											{
 												frm.getContentPane().removeAll();
												frm.repaint();
 												Mainform m=new Mainform();
 											}
 											}
 											
 											
 											
 											
 											
 											
 											
 											
 											
 											}
 										BasicSalary b=new BasicSalary();
 										
 		
 									}
 									 if(e.getSource()==j3)
 									{
 										frm.getContentPane().removeAll();
										frm.repaint();
										frm.setLayout(new GridLayout());
 										class Report 
 										{
 											
 											JTable jt;
 											DefaultTableModel m;
 											JScrollPane pane;
 											JPanel j;
 											
 											public Report()
 											{
 												//j=new JPanel();
 												//j.setBounds(50,50,700,450);
												//j.setBackground(Color.RED);
												//j.setLayout(new FlowLayout());
 												//jt=new JTable(0,12);
 												//////////////////////jt.setAutoResizeMode(JTable.AUTO_RESIZE_ON);
 												//DefaultTableModel m=(DefaultTableModel) jt.getModel();
												 frm.setTitle("Report");
 											
												 
												 m=new DefaultTableModel(0,12);
												 jt= new JTable(m);
												 String header[]={"ID","Name","Gender","Birth Date","Address","Joining Date","Phone No","Qualification","Salary","Department","Email ID","Designation"};
												 pane = new JScrollPane(jt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
												 jt.setPreferredScrollableViewportSize(new Dimension(700,450));
												 jt.setFillsViewportHeight(true);
												 jt.setShowGrid(true);
												 jt.setAutoscrolls(true);
												 m.setColumnIdentifiers(header);
												 
												 //j.add(pane);
												 frm.add(pane);
												 
	
												 //m.addRow(head);
												 //jt.setFillsViewportHeight(true);
													//jt.setBackground(clr);


												//jt.getTableHeader().setBackground(clr1);
												
												//frm.add(j);
												//j.add(jt);
												
												try
 												{
 													Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 													Connection con=DriverManager.getConnection("jdbc:odbc:fclty");
 													Statement state=con.createStatement();
 													String q="select * from FacultyDetails";
 													ResultSet res=state.executeQuery(q);
 													while(res.next())
 													{
 														String s1=res.getString("ID");
 														String s2=res.getString("First_Name")+" "+res.getString("Last_Name");
 														String s3=res.getString("Gender");
 														String s4=res.getString("Date_of_Birth");
 														String s5=res.getString("Address");
 														String s6=res.getString("Joining_Date");
 														String s7=res.getString("Phone_No");
 														String s8=res.getString("Qualification");
 														String s9=res.getString("Salary");
 														String s10=res.getString("Department");
 														String s11=res.getString("Email_ID");
 														String s12=res.getString("Designation");
 														
 														//Object newrow[]={res.getString("ID"),res.getString("First_Name")+" "+res.getString("Last_Name"),res.getString("Gender"),res.getString("Date_of_Birth"),res.getString("Address"),res.getString("Joining_Date"),res.getString("Phone_No"),res.getString("Qualification"),res.getString("Salary"),res.getString("Department"),res.getString("Email_ID"),res.getString("Designation")};
 														m.addRow(new Object[] {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12});
 													}
 												}
 												catch(Exception obj)
												{
													JOptionPane.showMessageDialog(null,obj.getMessage());
												}
												
 											
 												
 												
												}
 											
 											
 										}
 										Report r=new Report();
 									
 									}
 									if(e.getSource()==j4)
 									{
 										frm.dispose();
 									}
								}
							}
							Mainform m=new Mainform();
    					}
    					}
    					
    					catch(Exception aa)
    					{
    						JOptionPane.showMessageDialog(null,aa.getMessage());
    					}
    					
   					}
		   		
   					if(a.getSource()==chkshow)
  					{
		  				tpass.setEchoChar((char)0);
	 				}
  	
   					if(a.getSource()==exit)
   					{
	    				System.exit(0);	
    				}
				}
			}
			
			Login l=new Login();
		}
	}
}

class Faculty1
{
	public static void main(String arg[])
	{
		Welcome w=new Welcome();
	}
}