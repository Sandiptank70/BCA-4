//Array within class

import java.util.*;

class Student
{
	int rollno[] = new int[5];
	String []name = new String[5];
}

class ClassDemo8
{
	public static void main(String arg[])
	{
		Scanner obj = new Scanner(System.in);

		Student st = new Student();

		int a;

		for(a=0;a<5;a++)
		{
			System.out.print("Enter Roll No = ");
			st.rollno[a] = obj.nextInt();

			System.out.print("Enter Name = ");
			st.name[a] = obj.next();
		}

		for(a=0;a<5;a++)
		{
			System.out.println("\nRoll No = " + st.rollno[a]);
			System.out.println("Name = " + st.name[a]);
		}
	}
}
