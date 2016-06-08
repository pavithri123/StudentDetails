package com.util;

import java.util.Date;

public class GetData {
	
	private int ID;
	private String Student_Name;
	private String DOB;
	private String Address;


public int getid(){
    return ID;
 }

 public String getStudentName(){
    return Student_Name;
 }

 public String getDob(){
    return DOB;
 }
 
 public String getAddress(){
	    return Address;
	 }
 public void setid( int newid){
	 ID = newid;
  }

  public void setStudent_Name(String newStudent_Name){
	  Student_Name = newStudent_Name;
  }

  public void setDob( String newDob){
	  DOB = newDob;
  }
  
  public void setaddress(String newaddress){
	  Address = newaddress;
  }
}


