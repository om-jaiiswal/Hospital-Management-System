package com.view;
import java.util.Scanner;
import com.controller.*;

public class Hospital {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("*Welcome to our Hospital");
	String choice="";
	do {
	System.out.println("Please select your required purpose :-");
	System.out.println("Select 1 for new patient admission.");
	System.out.println("Select 2 for discharge formalities");
	System.out.println("Select 3 for searching the patient details.");
	
	int userChoice=sc.nextInt();
	switch(userChoice) {
	case 1:{
		System.out.println(Administration.admit(sc) ? "Patient added successfully" : "Patient did not get add");
		break;
	}
	case 2:{
		System.out.println(Administration.discharge(sc) ? "Patient discharged successfully" : "Patient died");
		break;
	}
	case 3:{
		System.out.println(Administration.search(sc));
		break;
	}
	default:
		System.out.println("Invalid input");
	}
	System.out.println("If you want to continue then type \"Yes\" or else press any other key ");
	choice =sc.next();
	} while("yes".equalsIgnoreCase(choice));
		
	}
}
