package com.cjc.ims.app.client;
import  com.cjc.ims.app.servicei.CJC;
import  com.cjc.ims.app.serviceimpl.Karvenagar;

import java.util.Scanner;

public class TestUI {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Karvenagar cjc=new Karvenagar();

		
	System.out.println("**** MENU ****");
	System.out.println("1. Add Course");
	System.out.println("2. View Course");
	System.out.println("3. Add Faculty");
	System.out.println("4. View Faculty");
	System.out.println("5. Add Batch");
	System.out.println("6. View Batch");
	System.out.println("7. Add Student");
	System.out.println("8. View Student");
	System.out.println("9. Exit");
	
while(true) {
	System.out.println("Enter Your Choice");
	int ch=sc.nextInt();
	if(ch==1)
	{
		cjc.addCourse();
	}
	else if(ch==2)
	{
		cjc.viewCourse();
	}
	else if(ch==3)
	{
		cjc.addFaculty();
	}
	else if(ch==4)
	{
		cjc.viewFaculty();
	}
	else if(ch==5)
	{
		cjc.addBatch();
		
	}else if(ch==6)
	{
		cjc.viewBatch();
		
	}else if(ch==7)
	{
		cjc.addStudent();
		
	}else if(ch==8)
	{
		cjc.viewStudent();
		
	}else if(ch==9)
	{
		break;
	}
	else 
	{
		System.out.println("Invalid Option");
	}
		
	}
System.out.println("Thank You Visiting..!");

	}


}
