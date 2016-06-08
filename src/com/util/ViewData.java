package com.util;

public class ViewData extends GetData {
public void view(){
	System.out.println("Name "+getStudentName());
	System.out.println("DOB "+getDob());
	System.out.println("Address "+getAddress());
}
}
