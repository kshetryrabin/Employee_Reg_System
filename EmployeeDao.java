package com.rabin.employee.dao;

import com.rabin.employee.dto.EmployeeDto;
import com.rabin.employee.util.EmployeeUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao
{
  public EmployeeDao() {}
  
  PreparedStatement ps = null;
  
  public void saveEmployeeDetails(EmployeeDto employeeDto) throws ClassNotFoundException, SQLException {
    String sql = "insert into employee_details(employee_name,address,mobile_no,email,dob,gender,bloodgroup,father_name,mother_name,nationality,last_organisation,experience,academic_qualification,languages_familiar) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    ps = EmployeeUtil.getConnection().prepareStatement(sql);
    ps.setString(1, employeeDto.getEmployee_name());
    ps.setString(2, employeeDto.getAddress());
    ps.setLong(3, employeeDto.getMobile_no());
    ps.setString(4, employeeDto.getEmail());
    ps.setDate(5, new java.sql.Date(employeeDto.getDob().getTime()));
    ps.setString(6, employeeDto.getGender());
    ps.setString(7, employeeDto.getBloodgroup());
    ps.setString(8, employeeDto.getFather_name());
    ps.setString(9, employeeDto.getMother_name());
    ps.setString(10, employeeDto.getNationality());
    ps.setString(11, employeeDto.getLast_organisation());
    ps.setInt(12, employeeDto.getExperience());
    ps.setString(13, employeeDto.getAcademic_qualification());
    ps.setString(14, employeeDto.getLanuages_familiar());
    ps.executeUpdate();
  }
  
  public void updateEmployeeDetails(EmployeeDto employeeDto) throws ClassNotFoundException, SQLException {
    String sql = "update employee_details set employee_name=?,address=?,mobile_no=?,email=?,dob=?,gender=?,bloodgroup=?,father_name=?,mother_name=?,nationality=?,last_organisation=?,experience=?,academic_qualification=?,languages_familiar=? where id=?";
    
    ps = EmployeeUtil.getConnection().prepareStatement(sql);
    ps.setString(1, employeeDto.getEmployee_name());
    ps.setString(2, employeeDto.getAddress());
    ps.setLong(3, employeeDto.getMobile_no());
    ps.setString(4, employeeDto.getEmail());
    ps.setDate(5, new java.sql.Date(employeeDto.getDob().getTime()));
    ps.setString(6, employeeDto.getGender());
    ps.setString(7, employeeDto.getBloodgroup());
    ps.setString(8, employeeDto.getFather_name());
    ps.setString(9, employeeDto.getMother_name());
    ps.setString(10, employeeDto.getNationality());
    ps.setString(11, employeeDto.getLast_organisation());
    ps.setInt(12, employeeDto.getExperience());
    ps.setString(13, employeeDto.getAcademic_qualification());
    ps.setString(14, employeeDto.getLanuages_familiar());
    ps.setInt(15, employeeDto.getId());
    ps.executeUpdate();
  }
  
  public List<EmployeeDto> getAllEmployeeList()
  {
    List<EmployeeDto> employeeList = new java.util.ArrayList();
    String sql = "select * from employee_details";
    try {
      ps = EmployeeUtil.getConnection().prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(rs.getInt("id"));
        employeeDto.setEmployee_name(rs.getString("employee_name"));
        employeeDto.setAddress(rs.getString("address"));
        employeeDto.setMobile_no(rs.getLong("mobile_no"));
        employeeDto.setEmail(rs.getString("email"));
        employeeDto.setDob(rs.getDate("dob"));
        employeeDto.setGender(rs.getString("gender"));
        employeeDto.setBloodgroup(rs.getString("bloodgroup"));
        employeeDto.setFather_name(rs.getString("father_name"));
        employeeDto.setMother_name(rs.getString("mother_name"));
        employeeDto.setNationality(rs.getString("nationality"));
        employeeDto.setLast_organisation(rs.getString("last_organisation"));
        employeeDto.setExperience(rs.getInt("experience"));
        employeeDto.setAcademic_qualification(rs.getString("academic_qualification"));
        employeeDto.setLanuages_familiar(rs.getString("languages_familiar"));
        employeeList.add(employeeDto);
      }
    }
    catch (ClassNotFoundException|SQLException e)
    {
      e.printStackTrace();
    }
    return employeeList;
  }
  
  public List<EmployeeDto> searchEmployeeDetails(String employee_name)
  {
    List<EmployeeDto> employeeList = new java.util.ArrayList();
    String sql = " select * from employee_details where employee_name like ?";
    try {
      ps = EmployeeUtil.getConnection().prepareStatement(sql);
      ps.setString(1, "%" + employee_name + "%");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(rs.getInt("id"));
        employeeDto.setEmployee_name(rs.getString("employee_name"));
        employeeDto.setAddress(rs.getString("address"));
        employeeDto.setMobile_no(rs.getLong("mobile_no"));
        employeeDto.setEmail(rs.getString("email"));
        employeeDto.setDob(rs.getDate("dob"));
        employeeDto.setGender(rs.getString("gender"));
        employeeDto.setBloodgroup(rs.getString("bloodgroup"));
        employeeDto.setFather_name(rs.getString("father_name"));
        employeeDto.setMother_name(rs.getString("mother_name"));
        employeeDto.setNationality(rs.getString("nationality"));
        employeeDto.setLast_organisation(rs.getString("last_organisation"));
        employeeDto.setExperience(rs.getInt("experience"));
        employeeDto.setAcademic_qualification(rs.getString("academic_qualification"));
        employeeDto.setLanuages_familiar(rs.getString("languages_familiar"));
        employeeList.add(employeeDto);
      }
    }
    catch (ClassNotFoundException|SQLException e)
    {
      e.printStackTrace();
    }
    return employeeList;
  }
  
  public void DeleteEmployee(int id)
  {
    String sql = "delete from employee_details where id=?";
    try {
      ps = EmployeeUtil.getConnection().prepareStatement(sql);
      ps.setInt(1, id);
      ps.executeUpdate();
    } catch (ClassNotFoundException|SQLException e) {
      e.printStackTrace();
    }
  }
}
