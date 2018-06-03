package com.rabin.employee.dto;

import java.util.Date;



public class EmployeeDto
{
  private int id;
  private String employee_name;
  private String address;
  private long mobile_no;
  private String email;
  private Date dob;
  private String gender;
  
  public EmployeeDto() {}
  private String bloodgroup;
  private String father_name;
  private String mother_name;
  
  public int getId() { return id; }
  private String nationality;
  
  public void setId(int id) { this.id = id; }
  private String last_organisation;
  
  public String getEmployee_name() { return employee_name; }
  
  public void setEmployee_name(String employee_name) {
    this.employee_name = employee_name;
  }
  
  public String getAddress() { return address; }
  private int experience;
  
  public void setAddress(String address) { this.address = address; }
  private String academic_qualification;
  
  public long getMobile_no() { return mobile_no; }
  

  public void setMobile_no(long mobile_no) { this.mobile_no = mobile_no; }
  
  private String lanuages_familiar;
  public String getEmail() { return email; }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public Date getDob() { return dob; }
  
  public void setDob(Date dob) {
    this.dob = dob;
  }
  
  public String getGender() { return gender; }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public String getBloodgroup() { return bloodgroup; }
  
  public void setBloodgroup(String bloodgroup) {
    this.bloodgroup = bloodgroup;
  }
  
  public String getFather_name() { return father_name; }
  
  public void setFather_name(String father_name) {
    this.father_name = father_name;
  }
  
  public String getMother_name() { return mother_name; }
  
  public void setMother_name(String mother_name) {
    this.mother_name = mother_name;
  }
  
  public String getNationality() { return nationality; }
  
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }
  
  public String getLast_organisation() { return last_organisation; }
  
  public void setLast_organisation(String last_organisation) {
    this.last_organisation = last_organisation;
  }
  
  public int getExperience() { return experience; }
  
  public void setExperience(int experience) {
    this.experience = experience;
  }
  
  public String getAcademic_qualification() { return academic_qualification; }
  
  public void setAcademic_qualification(String academic_qualification) {
    this.academic_qualification = academic_qualification;
  }
  
  public String getLanuages_familiar() { return lanuages_familiar; }
  
  public void setLanuages_familiar(String lanuages_familiar) {
    this.lanuages_familiar = lanuages_familiar;
  }
}
