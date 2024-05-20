package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import controllers.AuthController;
import models.AuthModel;

public class AuthView {

	private JFrame frame;
	private AuthController controller;
	private AuthModel model;
	
	public AuthView() {
		frame = new JFrame();
		frame.setVisible(false);
		frame.setBounds(0, 0, 530, 800);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		model = new AuthModel();
	}
	
	public void login() {
		//Diseño del login
		JPanel panel = new JPanel();
		
		
		//panel.setSize(2000, 2000);
		panel.setBackground(Color.decode("#3C61A9"));
		panel.setLayout(null);

		JLabel titulo = new JLabel("User login",0);
		titulo.setSize(300, 80);
		titulo.setFont(new Font("Arial",Font.BOLD,24));
		titulo.setForeground(Color.white);
		titulo.setLocation(100, 10);
		titulo.setBackground(Color.decode("#3C61A9"));
		titulo.setOpaque(true);
		panel.add(titulo);

		JLabel labelAccount = new JLabel("My Account:");
		labelAccount.setForeground(Color.decode("#DCCA8A"));
		labelAccount.setBounds(140,120,250,60);
		labelAccount.setFont(new Font ("Arial", Font.BOLD, 40));
		panel.add(labelAccount);


		JLabel labelUserName = new JLabel("Enter your username:");
		labelUserName.setForeground(Color.white);
		labelUserName.setBounds(120,230,250,30);
		labelUserName.setFont(new Font ("Arial", Font.BOLD, 15));
		panel.add(labelUserName);

		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(120,250,290,40);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		panel.add(fieldUser);		

		
		JLabel labelPass = new JLabel("Enter your password:");
		labelPass.setForeground(Color.white);
		labelPass.setBounds(120,330,250,30);
		labelPass.setFont(new Font ("Arial", Font.BOLD, 15));
		panel.add(labelPass);

		JTextField fieldPass = new JPasswordField();
		fieldPass.setBounds(120,350,290,40);
		fieldPass.setOpaque(true);
		fieldPass.setBackground(Color.white);
		panel.add(fieldPass);		


		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(180,430,170,50);
		btnLogin.setBackground(Color.decode("#DCCA8A"));
		btnLogin.setFont(new Font ("Arial", Font.BOLD, 20));
		panel.add(btnLogin);
		btnLogin.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				String usr = fieldUser.getText();
				String pwd = fieldPass.getText();
				
				model.login(usr, pwd);
				
						
				/*
				if(modelo.login(usr, pwd)) {
					
					System.out.println("Bienvenido");
				}else {
					System.out.println("Revise los datos");
				}
				*/

				

			}});



		JLabel labelQuestion = new JLabel("Don´t have an acount?");
		
		labelQuestion .setForeground(Color.white);
		labelQuestion .setBounds(210,540,250,30);
		labelQuestion .setFont(new Font ("Arial", Font.BOLD, 10));
		panel.add(labelQuestion );

		JButton btnSign = new JButton("Sign up");
		btnSign.setBounds(200,570,130,40);
		btnSign.setBackground(Color.decode("#DCCA8A"));
		btnSign.setFont(new Font ("Arial", Font.BOLD, 18));
		btnSign.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controller = new AuthController();
				frame.removeAll();
				frame.setVisible(false);
				controller.register();
				/*
				frame.remove(panel);
				register();
				*/
				

			}});
		panel.add(btnSign);


		JLabel labelBack = new JLabel();
		labelBack.setBackground(Color.decode("#253C71"));
		labelBack.setBounds(50,90,390,430);
		labelBack.setOpaque(true);
		panel.add(labelBack);
	    
	    frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
		
	}
	public void register() {
		JPanel panel = new JPanel();
		
		
		//panel.setSize(2000, 2000);
		panel.setBackground(Color.decode("#3C61A9"));
		panel.setLayout(null);

		JLabel titulo = new JLabel("Create account",0);
		titulo.setSize(300, 80);
		titulo.setFont(new Font("Arial",Font.BOLD,24));
		titulo.setForeground(Color.white);
		titulo.setLocation(100, 10);
		titulo.setBackground(Color.decode("#3C61A9"));
		titulo.setOpaque(true);
		panel.add(titulo);

		JLabel labelAccount = new JLabel("My Account:");
		labelAccount.setForeground(Color.decode("#DCCA8A"));
		labelAccount.setBounds(140,120,250,60);
		labelAccount.setFont(new Font ("Arial", Font.BOLD, 40));
		panel.add(labelAccount);


		JLabel labelUserName = new JLabel("Enter your username:");
		labelUserName.setForeground(Color.white);
		labelUserName.setBounds(120,230,250,30);
		labelUserName.setFont(new Font ("Arial", Font.BOLD, 15));
		panel.add(labelUserName);

		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(120,250,290,40);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		panel.add(fieldUser);		

		
		JLabel labelPass = new JLabel("Enter your password:");
		labelPass.setForeground(Color.white);
		labelPass.setBounds(120,330,250,30);
		labelPass.setFont(new Font ("Arial", Font.BOLD, 15));
		panel.add(labelPass);

		JTextField fieldPass = new JPasswordField();
		fieldPass.setBounds(120,350,290,40);
		fieldPass.setOpaque(true);
		fieldPass.setBackground(Color.white);
		panel.add(fieldPass);		


		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(180,430,170,50);
		btnLogin.setBackground(Color.decode("#DCCA8A"));
		btnLogin.setFont(new Font ("Arial", Font.BOLD, 20));
		panel.add(btnLogin);
		btnLogin.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String usr = fieldUser.getText();
				String pwd = fieldPass.getText();
				
						
				/*
				if(modelo.login(usr, pwd)) {
					
					System.out.println("Bienvenido");
				}else {
					System.out.println("Revise los datos");
				}
				*/

				

			}});



		JLabel labelQuestion = new JLabel("Don´t have an acount?");
		labelQuestion .setForeground(Color.white);
		labelQuestion .setBounds(210,540,250,30);
		labelQuestion .setFont(new Font ("Arial", Font.BOLD, 10));
		panel.add(labelQuestion );

		JButton btnSign = new JButton("Sign up");
		btnSign.setBounds(200,570,130,40);
		btnSign.setBackground(Color.decode("#DCCA8A"));
		btnSign.setFont(new Font ("Arial", Font.BOLD, 18));
		panel.add(btnSign);


		JLabel labelBack = new JLabel();
		labelBack.setBackground(Color.decode("#253C71"));
		labelBack.setBounds(50,90,390,430);
		labelBack.setOpaque(true);
		panel.add(labelBack);
	    
	    frame.add(panel);
		frame.setVisible(true);
		frame.repaint();
		frame.revalidate();
	}
	
	
}