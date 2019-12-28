class CommandLineArguments
{
	public static void main(String arg[])
	{
		int a;

		System.out.println("Total Arguments = " + arg.length);

		for(a=0;a<arg.length;a++)
		{
			System.out.print("\t" + arg[a]);

			System.out.println("\t" + arg[a].length());
		}
	}
}
 