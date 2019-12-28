//Hierarchical Inheritance

import java.util.*;

class Stream
{
	int no_of_students;
}

class BSc extends Stream
{	

}

class BCom extends Stream
{

}

class BA extends Stream
{

}

class Inheritance5
{
	public static void main(String arg[])
	{
		Scanner obj = new Scanner(System.in);
		BSc obj1 = new BSc();
		BCom obj2 = new BCom();
		BA obj3 = new BA();

		System.out.print("Enter total BSc Students = ");
		obj1.no_of_students = obj.nextInt();

		System.out.print("Enter total BCom students = ");
		obj2.no_of_students = obj.nextInt();

		System.out.print("Enter total BA students = ");
		obj3.no_of_students = obj.nextInt();

		int total = obj1.no_of_students + obj2.no_of_students + obj3.no_of_students;

		System.out.println("\nTotal BSc students = " + obj1.no_of_students);

		System.out.println("Total BCom studetns = " + obj2.no_of_students);

		System.out.println("Total BA students = " + obj3.no_of_students);

		System.out.println("Total Students = " + total);
	}
}



