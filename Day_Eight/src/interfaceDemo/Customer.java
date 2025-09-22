package interfaceDemo;

public class Customer {
	
	private String name;
	private String city;
	
	//Getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//para cont
	public Customer(String name, String city) {
		
		this.name = name;
		this.city = city;
	}
	
	//default const
	public Customer() {
		super();
	}

}
