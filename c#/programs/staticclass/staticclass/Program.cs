using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace staticclass
{
    static class demo
    {
       
        public static void print()
        {
            Console.WriteLine("Static method");
        }
    }
    class Program
    {


        static void Main(string[] args)
        {
            demo.print();
            Console.Read();
        }
    }
}
