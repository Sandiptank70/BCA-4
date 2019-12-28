//break - jumping statement

class BreakDemo1
{
	public static void main(String arg[])
	{
		int a=10;
		
		while(a >= 1)
		{
			if(a<5)
			{
				break;
			}
			System.out.println("\t" + a);

			a--;
		}
	}
}
