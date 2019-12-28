class Sum2
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);


		while(a>0)
		{
			a--;
			b++;
		}

		System.out.println("Sum = " + b);

	}
}
