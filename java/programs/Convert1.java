class Convert1
{
	public static void main(String arg[])
	{
		float faren = Float.parseFloat(arg[0]);

		float cel = (faren - 32) / 1.8f;

		System.out.println("Farenheit = " + faren);

		System.out.println("Celcius = " + cel);
	}
}
