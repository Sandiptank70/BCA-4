class CommandLineArgumentDemo
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);

		int c = a + b;
		System.out.println("Sum = " + c);

		c = a - b;
		System.out.println("Sub = " + c);

		System.out.println("Mul = " + a * b);
		System.out.println("Div = " + a/b);
	
	}
}
