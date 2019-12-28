//get data


import java.util.Scanner;

class GetValue
{
	public static void main(String arg[])
	{
		Scanner obj = new Scanner(System.in);

		int age;
		String name;

		System.out.print("Enter your name = " );
		name = obj.next();

		System.out.print("Enter your age = ");
		age = obj.nextInt();

		System.out.println("Name = " + name);
		System.out.println("Age = "+ age);
	}
}
