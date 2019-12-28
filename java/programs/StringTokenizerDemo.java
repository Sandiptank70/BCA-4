//StringTokenizer

import java.util.*;

class StringTokenizerDemo
{
	public static void main(String arg[])
	{
		StringTokenizer st = new StringTokenizer(arg[0], "-");

		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
