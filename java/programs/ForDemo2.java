//for loop - factorial

class ForDemo2
{
	public static void main(String arg[])
	{
		int n= Integer.parseInt(arg[0]);
		int f=1;

		for(;n>=1;n--)
		{
			f=f*n;
		}

		System.out.println("Factorial = " + f);
	}
}
