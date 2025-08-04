
public class IfDemo {

	public static void main(String[] args) {
		//if statement
		
		int x =9;  // user provided
		if(x<=9) {                     // bank ex fixed amt
			System.out.println("Value of x is 9");
			
			int x1 =10;  // user provided
			if(x1>=10) {                     // bank ex fixed amt
				System.out.println("Value of x is 10");
			
				
			int age = 18;
			
			if(age>18) {
				
			System.out.println("You are eligible for a voting");
			}
		}
			
			
		} 
		
		// if-else 
		
		int age = 20;
		
		if(age<18) {
			System.out.println("You are minor");
		}
		else {
			System.out.println("You are adult");
		}
		
		// else if
		
		//nested if else
		
		int a=10; int b=20; int c=5;                
		System.out.println("The Largest No is:");
		
		if(a>b) {              // outer if
			if(a>c) {                          // inner if
				System.out.println(a);
			}
			else {
				System.out.println();
			}
			if (c>b){
				System.out.println(c);
			}
		
		else {
			System.out.println(b);
		}
		
		
		
		
		}
		
	}

}
