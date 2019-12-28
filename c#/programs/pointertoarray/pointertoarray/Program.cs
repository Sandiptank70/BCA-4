using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace pointertoarray
{
    class Program
    {
        public unsafe static void printall(int* ptr)
        {
            for (int i = 0; i < 10; i++)
            {
                Console.WriteLine(*(ptr + i));
            }
        }
        unsafe static void Main(string[] args)
        {
            int[] arr = new int[10];
            for (int count = 0; count < 10; count++)
                arr[count] = count * count;
            fixed (int* ptr = arr)
                printall(ptr);
            Console.Read();
        }
    }
}
