//Single Inheritance

class Base
{
	int no;
}

class Derived extends Base
{
	String str;
}

class Inheritance2
{
	public static void main(String arg[])
	{
		Derived obj = new Derived();

		obj.no = Integer.parseInt(arg[0]);
		obj.str = arg[1];

		System.out.println("Number = " + obj.no);
		System.out.println("String = " + obj.str);
	}
}
