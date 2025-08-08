package com.Three_Day;

public class TaxCalculation {
	// metgod declaration - function to caluclate tqx - Person is a class & reference is small person, methos name=calculateTax
	public void calculateTax(Person person) {
		                                  // can give female , FEMALE any Case 
		if(person.getAge() > 60 || person.getGender().equalsIgnoreCase("Female")) {
			person.setTax(0);
			System.out.println("Tax Is Not applicable! ");
		}
		else {
			if(person.getIncome() <= 200000) {
				person.setTax(0);
			}
			else if(person.getIncome()> 200000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome() - 200000)*20/100 + 34000);
			}
			else {
				person.setTax((person.getIncome() - 800000)*30/100);
			}
	  }
		
	}

}
