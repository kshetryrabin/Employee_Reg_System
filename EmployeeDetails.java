package com.rabin.employee.form;

import com.rabin.employee.dao.EmployeeDao;
import com.rabin.employee.dto.EmployeeDto;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;





















public class EmployeeDetails
  extends JInternalFrame
{
  private JPanel contentPane;
  private JTable table;
  private JTextField searchtf;
  EmployeeDao employeeDao = new EmployeeDao();
  

















  public EmployeeDetails()
  {
    addMouseListener(new EmployeeDetails.1(this));
    




    setClosable(true);
    setTitle("EMPLOYEE DETAILS");
    
    setSize(2000, 450);
    contentPane = new JPanel();
    contentPane.setBackground(SystemColor.activeCaption);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    table = new JTable();
    table.setBorder(new EtchedBorder(1, new Color(128, 0, 0), new Color(85, 107, 47)));
    table.setBackground(new Color(152, 251, 152));
    String[] columnname = { "id", "employee_name", "address", "mobile_no", "email", "dob", "gender", "bloodgroup", "father_name", "mother_name", "nationality", "last_organisation", "experience", "academic_qualification", "language_familiar" };
    DefaultTableModel tableModel = new DefaultTableModel(columnname, 0);
    table.setModel(new DefaultTableModel(
      new Object[0][], 
      
      new String[] {
      "id", "employee_name", "address", "mobile_no", "email", "dob", "gender", "bloodgroup", "father_name", "mother_name", "nationality", "last_organisation", "experience", "academic_qualification", "language_familiar" }));
    

    table.setSize(2000, 450);
    

    JScrollPane scrollPane = new JScrollPane(table);
    scrollPane.setVerticalScrollBarPolicy(22);
    scrollPane.setHorizontalScrollBarPolicy(32);
    scrollPane.setLocation(0, 80);
    scrollPane.setSize(1914, 450);
    contentPane.add(scrollPane);
    
    searchtf = new JTextField();
    searchtf.setBounds(757, 25, 137, 28);
    contentPane.add(searchtf);
    searchtf.setColumns(10);
    






    JButton newbtn = new JButton("New");
    newbtn.addActionListener(new EmployeeDetails.2(this));
    








    newbtn.setBackground(new Color(70, 130, 180));
    newbtn.setBounds(644, 560, 97, 37);
    contentPane.add(newbtn);
    
    JButton searchbtn = new JButton("Search");
    searchbtn.setBackground(new Color(70, 130, 180));
    searchbtn.addActionListener(new EmployeeDetails.3(this));
    











    searchbtn.setBounds(957, 25, 97, 28);
    contentPane.add(searchbtn);
    
    JButton deletebtn = new JButton("Delete");
    deletebtn.addActionListener(new EmployeeDetails.4(this));
    









    deletebtn.setBackground(new Color(70, 130, 180));
    deletebtn.setBounds(957, 560, 97, 37);
    contentPane.add(deletebtn);
    
    JLabel lblRegisteredEmployees = new JLabel("REGISTERED EMPLOYEE'S DETAILS:");
    lblRegisteredEmployees.setForeground(new Color(0, 128, 0));
    lblRegisteredEmployees.setFont(new Font("Tahoma", 1, 18));
    lblRegisteredEmployees.setBounds(12, 13, 332, 54);
    contentPane.add(lblRegisteredEmployees);
    

    JButton editbtn = new JButton("Edit");
    editbtn.addActionListener(new EmployeeDetails.5(this));
    






































































    editbtn.setBackground(new Color(70, 130, 180));
    editbtn.setBounds(797, 560, 97, 37);
    contentPane.add(editbtn);
    



    LoadDataInTable();
  }
  
  public void LoadDataInTable() { DefaultTableModel tamodel = (DefaultTableModel)table.getModel();
    tamodel.setRowCount(0);
    
    List<EmployeeDto> employeeList = employeeDao.getAllEmployeeList();
    for (EmployeeDto employeeDto : employeeList) {
      tamodel.addRow(new Object[] { Integer.valueOf(employeeDto.getId()), employeeDto.getEmployee_name(), employeeDto.getAddress(), Long.valueOf(employeeDto.getMobile_no()), employeeDto.getEmail(), employeeDto.getDob(), employeeDto.getGender(), employeeDto.getBloodgroup(), employeeDto.getFather_name(), employeeDto.getMother_name(), employeeDto.getNationality(), employeeDto.getLast_organisation(), Integer.valueOf(employeeDto.getExperience()), employeeDto.getAcademic_qualification(), employeeDto.getLanuages_familiar() });
    }
  }
  
  public void SearchInTable(String employee_name) {
    DefaultTableModel tamodel = (DefaultTableModel)table.getModel();
    tamodel.setRowCount(0);
    

    List<EmployeeDto> employeeList = employeeDao.searchEmployeeDetails(employee_name);
    for (EmployeeDto employeeDto : employeeList) {
      tamodel.addRow(new Object[] { Integer.valueOf(employeeDto.getId()), employeeDto.getEmployee_name(), employeeDto.getAddress(), Long.valueOf(employeeDto.getMobile_no()), employeeDto.getEmail(), employeeDto.getDob(), employeeDto.getGender(), employeeDto.getBloodgroup(), employeeDto.getFather_name(), employeeDto.getMother_name(), employeeDto.getNationality(), employeeDto.getLast_organisation(), Integer.valueOf(employeeDto.getExperience()), employeeDto.getAcademic_qualification(), employeeDto.getLanuages_familiar() });
    }
  }
}
