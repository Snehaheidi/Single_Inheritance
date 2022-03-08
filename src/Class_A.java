
public class Class_A 
{
	static String color = "white";	  // --> super keyword use variable --> called child class
	public void Bank()            // --> Method Overriding
	{
	   String color = "white";	
       System.out.println("State Bank of India : ");
       System.out.println(color);
	}
	public Class_A()  //-->Constructor
	{
		System.out.println("Constructor...");
	}
	public void display()
	{
		//static int i =10;  --> non-static --> static var decalre panna mudiayathu
		System.out.println("The parent Class Executed...");
		System.out.println(color); //static varibale change child class so excute green var
	}
}
