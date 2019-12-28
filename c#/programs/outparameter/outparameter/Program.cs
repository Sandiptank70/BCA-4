using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace outparameter
{
    class swapdemo
    {
        public void swap(out int x, out int y, int p, int q)
        {
            int z;
            x = p;
            y = q;
            z = x;
            x = y;
            y = z;
            Console.WriteLine("Value of A is:" + x);
            Console.WriteLine("Value of B is:" + y);
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
            swapdemo s = new swapdemo();
            s.swap(out a, out b, a, b);
            Console.Read();
        }
    }
}
