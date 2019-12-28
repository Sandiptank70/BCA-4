//Instance method or Non-static method


class Message
{
	void display()
	{
		System.out.println("Welcome to Instance Method");
	}
}


class ClassDemo1
{
	public static void main(String arg[])
	{
		Message obj = new Message();
		obj.display();
	}
}