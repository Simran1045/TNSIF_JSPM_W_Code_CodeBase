package Day_One;

public class Typecast {
	public static void main(String[] args) {
		// Widening - Implicit type casting - small data type to big priority range
		
		byte b = 10;   // datatype variablr name - syntax
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;    
		System.out.println(d);
		
		// char 2 byte & int 4 byte - implicit small to big
		
		char ch='A';
		int i =ch;
		System.out.println(i);
		
		// Narrowing - explicit type casting - forcefully adding Big to Small data Range - chances to loss data
		
		double f1 = 10.52f; // data losses only receive 10 not 10.52
		
		long ll =(long) f1;
		System.out.println(ll);
		
		int i2=130;  // 256 or 156+128 or long cont num
		byte b1=(byte) i2;
		System.out.println(b1); 
			
	}

}


