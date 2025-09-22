package dayeight.StringDemo;

public class StringOperationsDemo {

	public static void main(String[] args) {
		String s1 = new String(" INDIAN ");  // pool Memory
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		int a = s2.length();
		System.out.println(" Length is "+a);
		
		
		String s3 = s1.substring(1, 7);
		System.out.println(s3);
		
		System.out.println(s1.trim());  // white space removes
		System.out.println(s1.stripTrailing());  // removes spaces from front
		System.out.println(s1.isEmpty());   // false becoz i have data
		
		// String Compare
		
		s2=new String(s1);
		
		System.out.println("Case 1"+ s1.equals(s2));
		System.out.println("Case 2"+ s1==s2);   // false boz it has different memory location
		
		
	}

}
