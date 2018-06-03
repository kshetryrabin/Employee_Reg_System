package com.rabin.employee.form;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;






public class LoginForm
  extends JFrame
{
  private JPanel contentPane;
  private JTextField textField;
  private JPasswordField passwordField;
  
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new LoginForm.1());
  }
  











  public LoginForm()
  {
    setTitle("LOGIN FORM");
    setDefaultCloseOperation(3);
    setBounds(100, 100, 768, 498);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 139, 139));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblUsername = new JLabel("Username");
    lblUsername.setForeground(new Color(128, 0, 0));
    lblUsername.setFont(new Font("Tahoma", 1, 18));
    lblUsername.setBounds(102, 85, 232, 38);
    contentPane.add(lblUsername);
    
    JLabel lblPassword = new JLabel("Password");
    lblPassword.setForeground(new Color(128, 0, 0));
    lblPassword.setFont(new Font("Tahoma", 1, 18));
    lblPassword.setBounds(102, 225, 232, 38);
    contentPane.add(lblPassword);
    
    textField = new JTextField();
    textField.setBackground(new Color(220, 220, 220));
    textField.setBounds(397, 85, 284, 38);
    contentPane.add(textField);
    textField.setColumns(10);
    
    passwordField = new JPasswordField();
    passwordField.setBackground(new Color(220, 220, 220));
    passwordField.setBounds(397, 225, 284, 38);
    contentPane.add(passwordField);
    
    JButton btnLogin = new JButton("Login");
    btnLogin.setBackground(SystemColor.textHighlight);
    btnLogin.addActionListener(new LoginForm.2(this));
    










    btnLogin.setBounds(305, 335, 97, 38);
    contentPane.add(btnLogin);
  }
}
