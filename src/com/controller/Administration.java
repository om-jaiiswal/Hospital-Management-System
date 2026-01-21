package com.controller;
import com.model.Patient;
import java.util.*;

public class Administration {
	//Global scope ArrayList variable in order to access everywhere.
	static List<Patient> li=new ArrayList<Patient>();
	//admit method to perform the admission
	public static boolean admit(Scanner sc) {
		sc.nextLine();
		System.out.println("Provide the patient name :");
		String name=sc.nextLine();
		System.out.println("Provide patient age :");
		int age=sc.nextInt();
		System.out.println("Provide the patient gender :");
		String gender=sc.next();
		System.out.println("Provide the patient phone number :");
		long phoneNumber=sc.nextLong();
		System.out.println("Provide the patient blood group :");
		String bloodGroup=sc.next();
		sc.nextLine();
		System.out.println("Provide the patient address :");
		String address=sc.nextLine();
		System.out.println("Provide the patient disease :");
		String disease=sc.nextLine();
		System.out.println("Provide the doctor name :");
		String doctor=sc.nextLine();
		
		Patient p = new Patient(name,age,gender,phoneNumber,bloodGroup,address,disease,doctor);
		if(payment(sc)) {
			li.add(p);
			return true;
		}
		else 
			return false;
	}
	//to take payment from user
	public static boolean payment(Scanner sc) {
		System.out.println("Please select payment method :");
		System.out.println("Select 1 for Online :");
		System.out.println("Select 2 for Card");
		System.out.println("Select 3 for Cash");
		int userChoice=sc.nextInt();
		switch (userChoice) {
		case 1:{
			System.out.println("Payment done successfully");
			return true;
		}
		case 2:{
			System.out.println("Payment done successfully");
			return true;
		}
		case 3:{
			System.out.println("Payment done successfully");
			return true;
		}
		default:
			System.out.println("Payment declined");
			return false;
		}
	}
	//in order to search the details of the patient
	public static Patient search(Scanner sc) {
		Iterator<Patient> i = li.iterator();
		System.out.println("Enter the patient name :");
		sc.nextLine();
		String name=sc.nextLine();
		while(i.hasNext()) {
			Patient p=i.next();
			if(p.getName().equalsIgnoreCase(name))
				return p;
		}
		return null;
	}
	//in order to remove the patient from the hospital
	public static boolean discharge(Scanner sc) {
		sc.nextLine();
		System.out.println("Provide the patient name : ");
		String name=sc.nextLine();
		Iterator<Patient> i=li.iterator();
		while(i.hasNext()) {
			if(i.next().getName().equalsIgnoreCase(name))
				i.remove();
			return true;
		}
		return false;
	}
}