class Swap
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);

		System.out.println("Before swapping values : ");
		System.out.println("\tA = " + a);
		System.out.println("\tB = " + b);

		int c;
		c = a;
		a = b;
		b = c;

		System.out.println("\nAfter swapping values : ");
		System.out.println("\tA = " + a);
		System.out.println("\tB = " + b);
	}
}
