package Multithreading_demo;

public class ChildDemo {
public static void main(String[] args) {
		
		
		ChildThread c=new ChildThread(9, "Welcome");
		ChildThread c1=new ChildThread(6, "TNSIF");
		c.start();
		c1.start();
		System.out.println("End of the program");

	}

}
