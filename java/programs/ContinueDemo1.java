//continue - jumping statement

class ContinueDemo1
{
	public static void main(String arg[])
	{
		int a;

		a =1;

		while(a<=10)
		{
			if(a<=5)
			{
				a=a+2;
				continue;
			}
			System.out.println("\t" + a);
			a=a+2;
		}
	}
}