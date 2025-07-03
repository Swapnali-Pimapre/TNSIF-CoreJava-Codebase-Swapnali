package com.tnsif.MultilevelInheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City city=new City();
		city.setArea("85967");
		
		city.setCountryname("India");
		city.setCapital("New Delhi");
		city.setStatename("Maharastra");
		city.setCityname("Pune");
		city.setLanguage("Marathi");
		
		System.out.println(city);
	}

}
