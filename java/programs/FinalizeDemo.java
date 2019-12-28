class FinalizeDemo
{
	public static void main(String arg[])
	{
		FinalizeDemo obj = new FinalizeDemo();
		
		System.out.println("Start...");

		System.out.println(obj.hashCode());
		
		obj = null;

		System.gc();

		System.out.println("End....");
	}

	protected void finalize() throws Throwable
	{
		System.out.println("finalize method is called");
	}
}