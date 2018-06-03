package com.rabin.employee.form;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;




























public class MainFrame
  extends JFrame
{
  private JPanel contentPane;
  private JLabel lblClock;
  private JDesktopPane desktopPane;
  
  public MainFrame()
  {
    setResizable(false);
    setDefaultCloseOperation(3);
    Toolkit toolKit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolKit.getScreenSize();
    int height = height;
    int width = width;
    setSize(width, height);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    desktopPane = new JDesktopPane();
    desktopPane.setBackground(SystemColor.activeCaption);
    desktopPane.setBounds(0, 117, 1914, 928);
    contentPane.add(desktopPane);
    
    JMenuBar menuBar = new JMenuBar();
    menuBar.setForeground(new Color(0, 0, 128));
    menuBar.setBackground(new Color(0, 128, 128));
    menuBar.setBounds(0, 0, 1914, 44);
    contentPane.add(menuBar);
    
    JMenu mnFile = new JMenu("File");
    mnFile.setFont(new Font("Segoe UI", 1, 20));
    mnFile.setMnemonic('F');
    menuBar.add(mnFile);
    
    JMenuItem mntmEmployeeDetails = new JMenuItem("Employee Details");
    mntmEmployeeDetails.addActionListener(new MainFrame.1(this));
    







    mntmEmployeeDetails.setAccelerator(KeyStroke.getKeyStroke(68, 2));
    mntmEmployeeDetails.setFont(new Font("Segoe UI", 0, 18));
    mntmEmployeeDetails.setBackground(new Color(210, 105, 30));
    mnFile.add(mntmEmployeeDetails);
    
    JMenuItem mntmNewForm = new JMenuItem("New Form");
    mntmNewForm.addActionListener(new MainFrame.2(this));
    





    mntmNewForm.setFont(new Font("Segoe UI", 0, 18));
    mntmNewForm.setAccelerator(KeyStroke.getKeyStroke(78, 2));
    mntmNewForm.setBackground(new Color(210, 105, 30));
    mnFile.add(mntmNewForm);
    
    JMenuItem mntmExit = new JMenuItem("Exit");
    mntmExit.addActionListener(new MainFrame.3(this));
    



    mntmExit.setFont(new Font("Segoe UI", 0, 18));
    mntmExit.setAccelerator(KeyStroke.getKeyStroke(69, 2));
    mntmExit.setBackground(new Color(210, 105, 30));
    mnFile.add(mntmExit);
    
    JMenu mnTools = new JMenu("Tools");
    mnTools.setMnemonic('T');
    mnTools.setFont(new Font("Segoe UI", 1, 20));
    menuBar.add(mnTools);
    
    JMenuItem mntmCalculator = new JMenuItem("Calculator");
    mntmCalculator.addActionListener(new MainFrame.4(this));
    









    mntmCalculator.setFont(new Font("Segoe UI", 0, 18));
    mntmCalculator.setAccelerator(KeyStroke.getKeyStroke(112, 0));
    mntmCalculator.setBackground(new Color(210, 105, 30));
    mnTools.add(mntmCalculator);
    
    JMenuItem mntmNotepad = new JMenuItem("Notepad");
    mntmNotepad.addActionListener(new MainFrame.5(this));
    









    mntmNotepad.setBackground(new Color(210, 105, 30));
    mntmNotepad.setAccelerator(KeyStroke.getKeyStroke(113, 0));
    mntmNotepad.setFont(new Font("Segoe UI", 0, 18));
    mnTools.add(mntmNotepad);
    
    lblClock = new JLabel("Clock");
    lblClock.setForeground(new Color(0, 139, 139));
    lblClock.setFont(new Font("Tahoma", 1, 22));
    lblClock.setBounds(1499, 57, 415, 47);
    contentPane.add(lblClock);
    Clock();
  }
  
  public void Clock() { Thread clock = new MainFrame.6(this);
    


















    clock.start();
  }
}
