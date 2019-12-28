//StringBuffer class

class StringBufferDemo
{
	public static void main(String arg[])
	{
		StringBuffer sb = new StringBuffer(arg[0]);

		System.out.println(sb);

		sb.append("YES");

		System.out.println("sb.append(YES) = " + sb);

		System.out.println("sb.capacity() = " + sb.capacity());

		sb.delete(2,5);

		System.out.println("sb.delete(2,5) = " + sb);

		sb.insert(2, "mpu");
		System.out.println("sb.insert(2, mpu) = " + sb);
	
		sb.reverse();

		System.out.println("sb.reverse() = " + sb);
	}
}
