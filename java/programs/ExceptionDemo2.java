//Exception Handling

class ExceptionDemo2
{
	public static void main(String arg[])
	{
	   try
	   {
		System.out.println("before a");
		a();
		System.out.println("after a");
	   }
	   catch(Exception e)
	   {
		System.out.println("Exception : " + e);
	   }
	}

	static void a()
	{
	   try
	   {	
		System.out.println("before b");
		b();
		System.out.println("after b");
	   }
	   catch(ArithmeticException ae)
	   {
		System.out.println("Second value must be non-zero");
	   }
	}

	static void b()
	{
	   try
	   {
		System.out.println("before c");
		c();
		System.out.println("after c");
	   }
	   catch(NumberFormatException ne)
	   {
		System.out.println("values are numeric");
	   }
  	}

	static void c()
	{
	   try
	   {
		System.out.println("Before Division");
		int ans = 12/0;
		System.out.println("After Division");
	   }
	   catch(ArrayIndexOutOfBoundsException ae)
	   {
		System.out.println("Array index not in range");
	   }
	}
}