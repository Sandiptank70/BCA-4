using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace forloop
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, no;
            Console.Write("Enter No:");
            no = Convert.ToInt16(Console.ReadLine());
            for (i = 1; i <= 10; i++)
            {
                Console.WriteLine("{0}*{1}={2}", no, i, no * i);
            }
            Console.Read();
        }
    }
}
