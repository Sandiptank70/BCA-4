using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace whileloop
{
    class Program
    {
        static void Main(string[] args)
        {
            int i, no;
            Console.Write("Enter No:");
            no = Convert.ToInt16(Console.ReadLine());
            i = 1;
            while (i <= no)
            {
                Console.WriteLine("Cube of {0} is : {1}", i, i * i * i);
                i++;
            }
            Console.Read();
        }
    }
}
