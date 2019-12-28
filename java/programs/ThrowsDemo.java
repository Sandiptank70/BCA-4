//throws keyword

class ThrowsDemo
{
	public static void main(String arg[])
	{
	   try
	   {
		int m = Integer.parseInt(arg[0]);
		int n = Integer.parseInt(arg[1]);

		Division obj = new Division();

		int ans = obj.divide(m, n);

		System.out.println("Division= " +ans);
	   }
	   catch(ArithmeticException ae)
	   {
		System.out.println("Second value must be non-zero");
	   }
	}
}

		