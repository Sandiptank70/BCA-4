//do...while - reverse number

class DoWhileDemo2
{
	public static void main(String arg[])
	{
		int n = Integer.parseInt(arg[0]);

		int r, rev=0;

		do
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		while(n!=0);

		System.out.println("Reverse Number = " + rev);
	}
}
