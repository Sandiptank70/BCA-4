//Wrapper classes

class WrapperDemo3
{
	public static void main(String arg[])
	{
		Character obj = new Character('a');

		System.out.println("isDigit(a) = " + obj.isDigit('a'));

		System.out.println("isLetter(a) = " + obj.isLetter('a'));

		System.out.println("isLowerCase(a) = " + obj.isLowerCase('a'));

		System.out.println("toUpperCase(a) = " + obj.toUpperCase('a'));

		System.out.println("charValue() = " + obj.charValue());

	}
}
	