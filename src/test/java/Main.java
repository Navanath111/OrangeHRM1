
public class Main {
	
	static void demo(String a)
	{
		System.out.println("Hi");
		if (a.equals("end"))
		{
		   throw new ArrayIndexOutOfBoundsException();
		}	
	}
	
	static String s;
	public static void main(String[] args)
	{
		//demo("ended");
		int a=10;
		int b=0;
		int c=0;
		
	//try-->catch-->finally
		try
		{
			System.out.println("try started");
			System.out.println(s.charAt(1));//null
			c=a/b;//risky code  //Arth
			System.out.println("try ended");
		}
		
		catch(Exception e)
		{
			//System.out.println("You have entered value of b as" + b + "which is incorrect & operation is not allowed");
			
			System.err.println(e.getStackTrace());
			System.err.println(e.getMessage());
			System.out.println(e.toString());
			
			//alternative code
		}
		
		System.out.println("end code of our program");

		//finally
		//{
			//System.out.println("This is the end code of our program");
		//}
	}
		
}


