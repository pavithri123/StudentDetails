package com.util;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		String id=sc.next();
		Common common =new Common ();
		common.readFile(id);
		sc.close();
	}
	
}