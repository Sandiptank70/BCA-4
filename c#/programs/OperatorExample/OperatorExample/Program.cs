using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OperatorExample
{
    class Program
    {
        static void Main(string[] args)
        {
            int a = 18, b = 4, c = 3;
            Console.WriteLine("Add=" + (a + b + c));
            Console.WriteLine("Sub=" + (a - b - c));
            Console.WriteLine("Mul=" + (a * b * c));
            Console.WriteLine("Div=" + (a / b) / c);
            Console.WriteLine("Mod=" + (a % c));

            if (a > b && a > c)
            {
                Console.WriteLine("A is Max");
            }
            else if (b > a && b > c)
            {
                Console.WriteLine("B is Max");
            }
            else if (c > a && c > b)
            {
                Console.WriteLine("C is Max");
            }
            else
            {
                Console.WriteLine("Equal");
            }
            if (b == c)
            {
                Console.WriteLine("Add of B and C is:" + (b + c));
            }
            else if (b >= c)
            {
                Console.WriteLine("Sub of B and C is:" + (b - c));
            }
            else if (b <= c)
            {
                Console.WriteLine("Mul of B and C is:" + (b * c));
            }
            else if (b != c)
            {
                Console.WriteLine("Div of B and C is:" + (b / c));
            }
            Console.Read();
        }
    }
}
