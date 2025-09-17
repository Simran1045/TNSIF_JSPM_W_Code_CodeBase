package Hierarchical_Inheritance.Demo;

public class HierarchicalDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();
		System.out.println(p1);
		
//		Student s1=new Student("Simran", "Pune", "SY", 23.78f);
//
//		Employee e1=new Employee("Simran", "Pune", 1009, 123459, "ENTC");
		
		Person p;
		p=new Person("Simran","Pune");
		System.out.println(p);
		
		p=new Employee("Shreya", "nashik", 1002, 23456, "QA");
		System.out.println(p);
		
		p=new Student("Shanti", "Mumbai", "TY", 12345f);
		System.out.println(p);
				
		

	}

}
