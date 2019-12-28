using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pointerexample
{
    class Program
    {
        unsafe static void Main(string[] args)
        {
            int x = 100;
            int y = 200;
            int z = 300;
            int* ptr1 = &x;
            int* ptr2, ptr3;
            ptr2 = &y;
            ptr3 = &z;

            Console.WriteLine("X={0} *ptr1= {1}, (int)ptr1= {2}",
                x, *ptr1, (int)ptr1);
            Console.WriteLine("Y={0} *ptr2= {1}, (int)ptr2= {2}",
                y, *ptr2, (int)ptr2);
            Console.WriteLine("Z={0} *ptr3= {1}, (int)ptr3= {2}",
                z, *ptr3, (int)ptr3);
            Console.Read();
        }
    }
}
