using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ValueTypeExample
{
    class Program
    {
        static void Main(string[] args)
        {
            int rno = 5;
            double fees = 3445.2356;
            bool ans = 5 > 21;
            decimal temp = 212112312321;
            Console.WriteLine("Rno=" + rno);
            Console.WriteLine("Fees={0}", fees);
            Console.WriteLine("ans=" + ans);
            Console.WriteLine("Temp=" + temp);
            Console.Read();
        }
    }
}
