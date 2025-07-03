package com.tnsif.HierarchicalInheritance;

public class Student extends Person {
	private String classyear;
	private float percent;
	public Student() {
	
		System.out.println("student default values");
		classyear="BE";
		percent=80.53f;
	}
	public Student(String classyear, float percent,String name, String city) {
		super(name, city);
		this.classyear = classyear;
		this.percent = percent;
	}
	public String getClassyear() {
		return classyear;
	}
	public void setClassyear(String classyear) {
		this.classyear = classyear;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [classyear=" + classyear + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
	
	

}
