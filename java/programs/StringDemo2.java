

class StringDemo2
{
	public static void main(String arg[])
	{
		String obj = arg[0];

		System.out.println(obj);

		obj = obj.replace('c', 'd');

		System.out.println(obj);


		StringBuffer obj2 = new StringBuffer(arg[0]);

		System.out.println(obj2);

		obj2.replace(3,4,"d");

		System.out.println(obj2);

	}
}
