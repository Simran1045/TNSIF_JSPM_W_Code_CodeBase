//MAin Method
package com.Three_Day;
import java.util.Scanner;
public class PersonDriDemo {

	public static void main(String[] args) {
	 //Scanner
	// scanner object to accpt user inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Name:");
		String name = sc.next();// for option press ctrl+space
		System.out.println("Enter Age:");
		int age = sc.nextInt();
		System.out.println("Enter Gender:");
		String Gender = sc.next();
		
		System.out.println("Enter Income");
		int income = sc.nextInt();
		
		// person class object and initialization values using getter metod
		Person person=new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(Gender);
		person.setIncome(income);
		//using getter method
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		// or u can diplay person details using toString method
		
		System.out.println(person);
		
		
		TaxCalculation calc=new TaxCalculation();
		calc.calculateTax(person);
		System.out.println("After Calculation of tax :");
		System.out.println(person);
	
		
		
		
		
		

	}

}
