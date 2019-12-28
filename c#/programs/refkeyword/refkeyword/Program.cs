using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace refkeyword
{
    class demo
    {
        public void swap(ref int a, ref int b)
        {
            int c;
            c = a;
            a = b;
            b = c;
            Console.WriteLine("A is:" + a);
            Console.WriteLine("B is:" + b);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            Console.Write("Enter A:");
            a = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter B:");
            b = Convert.ToInt16(Console.ReadLine());
            demo d = new demo();
            d.swap(ref a, ref b);
            Console.Read();
        }
    }
}
