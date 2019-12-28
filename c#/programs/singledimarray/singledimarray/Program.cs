using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace singledimarray
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a = new int[6] { 11, 12, 13, 14, 15, 16 };
            int[] b;
            b = new int[3] { 1, 2, 3 };
            int[] c = { 11, 22 };
            int[] d = new int[] { 5, 6, 7, 8 };

            string []nm = new string[3];
            nm[0] = "ABC";
            nm.SetValue("BCD", 1);
            nm[2] = "CCC";

            for (int i = 0; i < a.Length; i++)
            {
                Console.WriteLine(a[i]);
            }
            object temp = nm.GetValue(2);
            Console.WriteLine(temp);
            string tmp = nm[1];
            Console.WriteLine(tmp);

            foreach (int val in d)
            {
                Console.WriteLine(val);
            }
            Console.Read();
        }
    }
}
