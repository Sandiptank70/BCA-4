//static and non-static data member

class Number
{
	int no;
	static int num;
}

class ClassDemo5
{
	public static void main(String arg[])
	{
		Number obj1 = new Number();
		Number obj2 = new Number();
		Number obj3 = new Number();

		obj1.no = 10;
		obj2.no = 20;
		obj3.no = 30;

		obj1.num = 100;
		obj2.num = 200;
		obj3.num = 300;

		System.out.println("obj1.no = " + obj1.no);
		System.out.println("obj2.no = " + obj2.no);
		System.out.println("obj3.no = " + obj3.no);

		System.out.println("obj1.num = " + obj1.num);
		System.out.println("obj2.num = " + obj2.num);
		System.out.println("obj3.num = " + obj3.num);
	}
}
