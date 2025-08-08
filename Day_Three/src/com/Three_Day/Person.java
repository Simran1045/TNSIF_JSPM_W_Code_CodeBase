//Program_1 using Scanner class for Tax
package com.Three_Day;

public class Person {
	// data members
	private String name;
	private int income;
	private int age;
	private String Gender;
	private int tax;
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", age=" + age + ", Gender=" + Gender + ", tax=" + tax
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
}


