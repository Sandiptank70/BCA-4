using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace methodoverloading
{
    class methodold
    {
        int a, b, c, d;
        public int add(int x, int y)
        {
            a = x;
            b = y;
            return a + b;
        }
        public int add(int x, int y, int z)
        {
            a = x; b = y; c = z;
            return a + b + c;
        }
        public int add(int w, int x, int y, int z)
        {
            a = w; b = x; c = y; d = z;
            return a + b + c + d;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            methodold mo = new methodold();
            int ans = mo.add(10, 20);
            Console.WriteLine("First Method Call:" + ans);
            Console.WriteLine("Second Method Call:" + 
                mo.add(10, 20, 30));
            Console.WriteLine("Third Method Call:" +
                mo.add(10, 20, 30, 40));
            Console.Read();
        }
    }
}
