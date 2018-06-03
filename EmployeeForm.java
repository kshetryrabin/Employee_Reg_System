package com.rabin.employee.form;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



































public class EmployeeForm
  extends JInternalFrame
{
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  public JTextField enametf;
  public JTextField addresstf;
  public JTextField mobnotf;
  public JTextField emailtf;
  public JTextField fnametf;
  public JTextField mnametf;
  public JTextField lastorgtf;
  public JDateChooser dateChooser_1;
  public JRadioButton malerdbtn;
  public JRadioButton femalerdbtn;
  public JComboBox experiencecombobx;
  public JComboBox qualificationcombobx;
  public JCheckBox javacheckbx;
  public JCheckBox phpcheckbx;
  public JCheckBox htmlcheckbx;
  public JCheckBox ccheckbx;
  public JComboBox nationalitycombobx;
  public JComboBox bgcombobx;
  public JLabel idlabel;
  
  public EmployeeForm()
  {
    setEnabled(false);
    setResizable(true);
    addMouseListener(new EmployeeForm.1(this));
    




    setTitle("EMPLOYEE REGISTRATION");
    
    setBounds(100, 100, 835, 883);
    setLocation(350, 0);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.activeCaption);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(null);
    

    JLabel uploadphotobtn = new JLabel("Upload Photo");
    uploadphotobtn.setBackground(Color.WHITE);
    uploadphotobtn.setBounds(634, 13, 125, 125);
    contentPane.add(uploadphotobtn);
    
    JLabel lblNewLabel = new JLabel(" EMPLOYEE NAME");
    lblNewLabel.setBounds(40, 153, 212, 33);
    contentPane.add(lblNewLabel);
    
    JLabel lblAddress = new JLabel(" ADDRESS");
    lblAddress.setBounds(50, 199, 212, 33);
    contentPane.add(lblAddress);
    
    JLabel lblMobileNo = new JLabel(" MOBILE NO");
    lblMobileNo.setBounds(40, 245, 212, 33);
    contentPane.add(lblMobileNo);
    
    JLabel lblEmail = new JLabel(" EMAIL");
    lblEmail.setBounds(40, 291, 212, 33);
    contentPane.add(lblEmail);
    
    dateChooser_1 = new JDateChooser();
    dateChooser_1.setBounds(379, 337, 344, 33);
    contentPane.add(dateChooser_1);
    
    JLabel lblDob = new JLabel(" DOB");
    lblDob.setBounds(40, 337, 212, 33);
    contentPane.add(lblDob);
    
    JLabel lblGender = new JLabel(" GENDER");
    lblGender.setBounds(40, 383, 212, 33);
    contentPane.add(lblGender);
    
    JLabel lblBloodGroup = new JLabel(" BLOOD GROUP");
    lblBloodGroup.setBounds(40, 429, 212, 33);
    contentPane.add(lblBloodGroup);
    
    JLabel lblFathersName = new JLabel(" FATHER'S NAME");
    lblFathersName.setBounds(40, 475, 212, 33);
    contentPane.add(lblFathersName);
    
    JLabel lblMothersName = new JLabel(" MOTHER'S NAME");
    lblMothersName.setBounds(40, 515, 212, 33);
    contentPane.add(lblMothersName);
    
    JLabel lblNationality = new JLabel(" NATIONALITY");
    lblNationality.setBounds(40, 561, 212, 33);
    contentPane.add(lblNationality);
    
    enametf = new JTextField();
    enametf.setBackground(Color.WHITE);
    enametf.setBounds(379, 153, 344, 33);
    contentPane.add(enametf);
    enametf.setColumns(10);
    
    addresstf = new JTextField();
    addresstf.setBackground(Color.WHITE);
    addresstf.setColumns(10);
    addresstf.setBounds(379, 199, 344, 33);
    contentPane.add(addresstf);
    
    mobnotf = new JTextField();
    mobnotf.setColumns(10);
    mobnotf.setBounds(379, 245, 344, 33);
    contentPane.add(mobnotf);
    
    emailtf = new JTextField();
    emailtf.setColumns(10);
    emailtf.setBounds(379, 291, 344, 33);
    contentPane.add(emailtf);
    
    fnametf = new JTextField();
    fnametf.setColumns(10);
    fnametf.setBounds(379, 469, 344, 33);
    contentPane.add(fnametf);
    
    mnametf = new JTextField();
    mnametf.setColumns(10);
    mnametf.setBounds(379, 515, 344, 33);
    contentPane.add(mnametf);
    
    malerdbtn = new JRadioButton(" MALE");
    malerdbtn.setBounds(389, 379, 127, 25);
    contentPane.add(malerdbtn);
    
    femalerdbtn = new JRadioButton("FEMALE");
    femalerdbtn.setBounds(598, 379, 127, 25);
    contentPane.add(femalerdbtn);
    
    JLabel lblLastOrganisation = new JLabel("LAST ORGANISATION");
    lblLastOrganisation.setBounds(40, 607, 212, 33);
    contentPane.add(lblLastOrganisation);
    
    JLabel lblExperience = new JLabel("EXPERIENCE");
    lblExperience.setBounds(40, 653, 212, 33);
    contentPane.add(lblExperience);
    
    JLabel lblAcademicQualification = new JLabel("ACADEMIC QUALIFICATION");
    lblAcademicQualification.setBounds(40, 699, 212, 33);
    contentPane.add(lblAcademicQualification);
    
    JLabel lblLanguagesFamiliar = new JLabel("LANGUAGES FAMILIAR");
    lblLanguagesFamiliar.setBounds(40, 745, 212, 33);
    contentPane.add(lblLanguagesFamiliar);
    
    lastorgtf = new JTextField();
    lastorgtf.setColumns(10);
    lastorgtf.setBounds(379, 607, 344, 33);
    contentPane.add(lastorgtf);
    
    experiencecombobx = new JComboBox();
    experiencecombobx
      .setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
    experiencecombobx.setBounds(379, 653, 344, 33);
    contentPane.add(experiencecombobx);
    
    qualificationcombobx = new JComboBox();
    qualificationcombobx.setModel(new DefaultComboBoxModel(new String[] { "Master", "Bachelor", "+2", "S.L.C" }));
    qualificationcombobx.setBounds(379, 699, 344, 33);
    contentPane.add(qualificationcombobx);
    
    javacheckbx = new JCheckBox(" JAVA");
    javacheckbx.setBackground(Color.GRAY);
    javacheckbx.setBounds(379, 741, 71, 25);
    contentPane.add(javacheckbx);
    
    phpcheckbx = new JCheckBox("PHP");
    phpcheckbx.setBackground(Color.GRAY);
    phpcheckbx.setBounds(529, 741, 71, 25);
    contentPane.add(phpcheckbx);
    
    ccheckbx = new JCheckBox("C/C++");
    ccheckbx.setBackground(Color.GRAY);
    ccheckbx.setBounds(608, 741, 71, 25);
    contentPane.add(ccheckbx);
    
    nationalitycombobx = new JComboBox();
    nationalitycombobx.setModel(new DefaultComboBoxModel(new String[] { "Afghanistan", "Bangladesh", "Bhutan", 
      "India", "Maldives", "Nepal", "Pakistan", "Srilanka" }));
    nationalitycombobx.setBounds(379, 561, 344, 33);
    contentPane.add(nationalitycombobx);
    

    JButton clearbtn = new JButton("CLEAR");
    clearbtn.addActionListener(new EmployeeForm.2(this));
    










    clearbtn.setBackground(new Color(70, 130, 180));
    clearbtn.setBounds(565, 787, 125, 42);
    contentPane.add(clearbtn);
    
    bgcombobx = new JComboBox();
    bgcombobx.setModel(new DefaultComboBoxModel(
      new String[] { "A+VE", "B+VE", "AB+VE", "O+VE", "A-VE", "B-VE", "AB-VE", "O-VE" }));
    bgcombobx.setBounds(379, 423, 344, 33);
    contentPane.add(bgcombobx);
    
    JLabel lblRegistrationForm = new JLabel("    REGISTRATION FORM");
    lblRegistrationForm.setForeground(new Color(0, 128, 0));
    lblRegistrationForm.setFont(new Font("Arial Black", 1, 22));
    lblRegistrationForm.setBounds(195, 62, 396, 72);
    contentPane.add(lblRegistrationForm);
    
    htmlcheckbx = new JCheckBox("HTML");
    htmlcheckbx.setBackground(Color.GRAY);
    htmlcheckbx.setBounds(454, 741, 71, 25);
    contentPane.add(htmlcheckbx);
    
    JButton submitbtn = new JButton(" SUBMIT");
    submitbtn.setEnabled(false);
    
    JCheckBox agreecheckbx = new JCheckBox("I agree the terms and condition of the organisation.");
    agreecheckbx.addActionListener(new EmployeeForm.3(this, agreecheckbx, submitbtn));
    







    agreecheckbx.setBounds(8, 787, 347, 42);
    contentPane.add(agreecheckbx);
    
    submitbtn.addActionListener(new EmployeeForm.4(this));
    






























































    submitbtn.setBackground(new Color(70, 130, 180));
    submitbtn.setBounds(391, 787, 125, 42);
    contentPane.add(submitbtn);
    
    JButton backbtn = new JButton("BACK");
    backbtn.addActionListener(new EmployeeForm.5(this));
    








    backbtn.setBackground(new Color(70, 130, 180));
    backbtn.setBounds(27, 24, 112, 42);
    contentPane.add(backbtn);
    
    idlabel = new JLabel(" ");
    idlabel.setBounds(57, 94, 56, 16);
    contentPane.add(idlabel);
    
    JScrollPane scrollPane = new JScrollPane(contentPane);
    getContentPane().add(scrollPane);
  }
}
