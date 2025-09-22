package dayeight.StringDemo;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "TNSIF"; // Heap memory
		String s2 = "TNSIF";
		
		String s3 = new String ("TNSIF");  
		String s4 = new String ("TNSIF"); // 2 new memories places created
		
		// == Equals - is data same? 
		// == - object reference
		// equals - data
		
		System.out.println("Caes 1 :"+ (s1==s2));
		System.out.println("Caes 2 :"+ (s1==s2));
		System.out.println("Caes 3 :"+ (s2.equals(s1)));
		System.out.println("Caes 4 :"+ (s2.equals(s4)));
		System.out.println("Caes 5 :"+ (s3==s4));
		System.out.println("Caes 6 :"+ (s3.equals(s4)));
		

	}

}
