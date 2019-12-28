//throw keyword

class ThrowDemo2
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
		System.out.println("Exception caught");
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
		throw ae;
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
	   catch(ArithmeticException ae)
	   {
		throw ae;
	   }
	}

	static void c()
	{
	   try
	   {
		System.out.println("Before Division");
		int ans = 5/0;
		System.out.println("After Division");
	   }
	   catch(ArithmeticException ae)
	   {
		throw ae;
	   }
	}
}
