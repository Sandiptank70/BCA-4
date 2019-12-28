//Non-static or instance data member 

class Student
{
	int rollno;
	String name;
}

class ClassDemo3
{
	public static void main(String arg[])
	{
		Student obj= new Student();

		obj.rollno = 12;
		obj.name = "Raj";

		System.out.println("Roll No = " + obj.rollno);
		System.out.println("Name = " + obj.name);
	}
}
