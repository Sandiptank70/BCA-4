//Parameterized constructor

class Student
{
	int rno;
	String name;

	Student(int no, String nm)
	{
		rno = no;
		name = nm;
	}
}

class ClassDemo12
{
	public static void main(String arg[])
	{
		Student st= new Student(12, "Raj");

		System.out.println("Roll No = " + st.rno);
		System.out.println("Name = " + st.name);

	}
}

