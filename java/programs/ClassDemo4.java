//static data member

class First
{
	static int no;
}

class ClassDemo4
{
	public static void main(String arg[])
	{
		First.no = 15;

		System.out.println("First.No= " + First.no);

		First obj=new First();
		obj.no=24;

		System.out.println("obj.no = " + obj.no);
	}
}
