//Array of object

import java.util.*;

class Employee
{
	int code;
	String name;
}


class ClassDemo9
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);

		Employee emp[] = new Employee[5];

		int a;

		for(a=0;a<5;a++)
		{
			emp[a] = new Employee();

			System.out.print("Enter Emp. Code = " );
			emp[a].code = obj.nextInt();

			System.out.print("Enter Emp. Name = ");
			emp[a].name = obj.next();
		}

		for(a=0;a<5;a++)
		{
			System.out.println("\nEmp. Code = " + emp[a].code);

			System.out.println("Emp. Name = " + emp[a].name);
		}
	}
}
