package com.model;
//model class which is used to create objects
public class Patient {
	
	@Override
	public String toString() {
		return "Name : "+this.getName()+"\n"+"Age : "+this.getAge()+"\n"+"Gender :"+this.getGender()+"\n"+
				"Phone Number :"+this.getPhoneNumber()+"\n"+"Blood Group : "+this.getBloodGroup()+"\n"+
				"Address : "+this.getAddress()+"\n"+"Disease : "+this.getDisease()+"\n"+
				"Doctor : "+this.getDoctor();
	}
	//properties of the patient
	private String name;
	private int age;
	private String gender;
	private long phoneNumber;
	private String bloodGroup;
	private String address;
	private String disease;
	private String doctor;
	
	public Patient(String name,int age, String gender, long phoneNumber, String bloodGroup, String address, 
			String disease, String doctor){
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.phoneNumber=phoneNumber;
		this.bloodGroup=bloodGroup;
		this.address=address;
		this.disease=disease;
		this.doctor=doctor;
			
	}
	
	//getters and setters to access them indirectly
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
}
