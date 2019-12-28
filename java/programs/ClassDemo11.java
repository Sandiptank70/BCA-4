//Constructor-Default constructor


class First
{
	First()
	{
		System.out.println("Default constructor is called");
	}
}


class ClassDemo11
{
	public static void main(String arg[])
	{
		First obj = new First();

		First arr[] = new First[5];

		int a;

		for(a=0;a<5;a++)
		{
			arr[a] = new First();
		}

	}
}
