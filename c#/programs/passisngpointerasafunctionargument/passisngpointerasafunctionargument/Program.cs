using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace passisngpointerasafunctionargument
{

    class Program
    {
        public unsafe static void swap(int* x, int* y)
        {
            int temp;
            temp = *x;
            *x = *y;
            *y = temp;
        }
        unsafe static void Main(string[] args)
        {
            int a = 10;
            int b = 20;
            Console.WriteLine("Before Swap(): a={0}, b={1}", a, b);
            swap(&a, &b);
            Console.WriteLine("After Swap(): a={0}, b={1}", a, b);
            Console.Read();
        }
    }
}
