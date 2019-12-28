class Calculate1
{
	public static void main(String arg[])
	{
		float radius= Float.parseFloat(arg[0]);

		float area = 3.141592f * radius * radius;

		float cir = 2 * 3.141592f * radius;

		System.out.println("Area = " + area);

		System.out.println("Circumference = " + cir);

	}
}