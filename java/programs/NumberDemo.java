//Number class

class NumberDemo
{
	public static void main(String arg[])
	{
		int a = Integer.parseInt(arg[0]);

		int b = Integer.valueOf(arg[1]).intValue();

		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("Product = " + (a*b));
	}
}

// long n = Long.valueOf(arg[0]).longValue();
// float f = Float.valueOf(arg[0]).floatValue();
// double d = Double.valueOf(arg[0]).doubleValue();
// byte b = Byte.valueOf(arg[0]).byteValue();
// short s = Short.valueOf(arg[0]).shortValue(); 