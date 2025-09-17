package FirstPackage;

public class Base {

	
	//declare the variables
	int varDefault= 10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	
	//methods declarations
	void methodDefault()
	{
		System.out.println("default access Base class");
		System.out.println("default variables : "+ varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("public access Base class");
		System.out.println("public variables : "+ varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access Base class");
		System.out.println("Private variables : "+ varPrivate);
	}
	
	
	protected void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected variables : "+ varProtected);
	}
		
}