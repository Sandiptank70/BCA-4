//Package class

package p8;

class PackageDemo
{
	public static void main(String arg[])
	{
		System.out.println("Package class Demo");
		
		Package obj = Package.getPackage("p8");

		System.out.println("getName = " + obj.getName());

		System.out.println("getImplementationTitle = " + obj.getImplementationTitle());

		System.out.println("getImplementationVendor = " + obj.getImplementationVendor());

		System.out.println("getImplementationVersion = " + obj.getImplementationVersion());

		System.out.println("hashCode = " + obj.hashCode());


	}
}


		