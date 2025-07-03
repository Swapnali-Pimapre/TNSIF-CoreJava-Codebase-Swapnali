package com.tnsif.singleInheritance;

public class Student extends Citizen {////Child class

//	private String studentname;
//	private String address;
//	private long phoneno;
	private int rollno;
	private String collegename;
	public Student() {
		super();
	}
	public Student(int rollno, String collegename,String name, String adharno, String address, long phone) {
		super(name, adharno, address, phone);
		this.rollno = rollno;
		this.collegename = collegename;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone()
				+ "]";
	}
//	public void displayInfo() {
//		System.out.println("Roll no:"+);
//	}
//	
}
