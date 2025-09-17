package Day_Five;

public class Finalvariables {

	public static void main(String[] args) {
		//
		
		final int x = 100;
		
		//static declare sttaic blank final varibale
		
		final static int y; // without value
		final static int z=10; // static with value
		
		// instance method - non sttaic method
		//x=30;
		//z=100;
		//y=23;
		
	

	}
	//toString impletmented
	@Override
	public String toString() {
		return "Finalvariables [x=+"]";
	}
	
	//declare a static bolk
	
	static {
		//z=89;
		y=20;
	}
	
	static {
		y=86;
		System.out.println("Value of y: "+ y);
		
		
	}
	

}
