using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace objecttypedatatypeeexample
{
    class Program
    {
        static void Main(string[] args)
        {
            object ans;
            ans = 22;
            Console.WriteLine("Ans=" + ans);
            ans = "ABC";
            Console.WriteLine("Ans=" + ans);
            ans = true;
            Console.WriteLine("Ans=" + ans);
            Console.Read();
        }
    }
}
