package StaticBlockMethod;

public class Employee1 {

	//declare instance variables 
	
	private String name;
	private int id;
	
	//declare a static varibles companyname with data type string 
	
	//TNS which is common for all the object 
	static String companyName="TNS";

	//para constructor 
	public Employee1(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id +
				",Company="+companyName+"]";
	}
