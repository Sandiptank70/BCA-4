using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Multidimarray
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] a = new int[5, 5];
            int[,] b = new int[5, 5];
            int[,] c = new int[5, 5];
            int i, j, row, col;
            Console.Write("Enter Row:");
            row = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Column:");
            col = Convert.ToInt16(Console.ReadLine());

            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Console.Write("Enter a[{0}][{1}]:", i, j);
                    a[i, j] = Convert.ToInt16(Console.ReadLine());
                }
            }
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Console.Write(a[i, j]);
                }
                Console.WriteLine();
            }
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Console.Write("Enter b[{0}][{1}]:", i, j);
                    b[i, j] = Convert.ToInt16(Console.ReadLine());
                }
            }
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Console.Write(b[i, j]);
                }
                Console.WriteLine();
            }
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    c[i, j] = a[i, j] + b[i, j];
                }
            }
            Console.WriteLine("===========================");
            for (i = 0; i < row; i++)
            {
                for (j = 0; j < col; j++)
                {
                    Console.Write(c[i, j]);
                }
                Console.WriteLine();
            }

            Console.Read();
        }
    }
}
