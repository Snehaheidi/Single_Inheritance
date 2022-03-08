
public class Class_B extends Class_A
{
	@Override
	public void Bank()
	{
		color = "green";
		System.out.println("Indian Overseas Bank : ");
		System.out.println(color);
		super.Bank();       //--> called parent class constructorS method
		super.display();  //--> called parent class method
		//System.out.println(super.color); // called parent class --> variable		
	}
}