
public class UsernamePass {

	public static void main(String[] args) {
		String Username = "Admin";
		String Password = "Password0998";
		
		System.out.println("Enter a username:");
		System.out.println("Enter a Password:");
		
		if(Username == "Admin") {
			System.out.println("You are logged in successfully-!!!");
		}
		else if (Username!="Admin") {
			System.out.println("Username is incorrect.");
		}
		else if(Password!="Password0998") {
			System.out.println("Password is Incorrect.");
		} else {
			System.out.println("Both Username & Password are Correct");
		}
		
	}

}
