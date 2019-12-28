//String class

class StringDemo
{
	public static void main(String arg[])
	{
		String obj = arg[0];

		System.out.println("obj.length() = " + obj.length());

		System.out.println("obj.charAt(3) = " + obj.charAt(3));

		System.out.println("obj.compareTo(Welcome) = " + obj.compareTo("Welcome"));


		System.out.println("obj.compareToIgnoreCase(Welcome) = " + obj.compareToIgnoreCase("Welcome"));

		System.out.println("obj.concat(test) = " + obj.concat("test"));

		System.out.println("obj.startsWith(Wel) = " + obj.startsWith("Wel"));

		System.out.println("obj.endsWith(come) = " + obj.endsWith("come"));

		System.out.println("obj.hashCode() = " + obj.hashCode());

		System.out.println("obj.indexOf(o) = " + obj.indexOf('o'));

		System.out.println("obj.replace(i,k) = " + obj.replace('i','k'));

		System.out.println("obj.substring(4) = " + obj.substring(4));

		System.out.println("obj.toLowerCase() = " + obj.toLowerCase());

		System.out.println("obj.toUpperCase() = " + obj.toUpperCase());

	}
}
 