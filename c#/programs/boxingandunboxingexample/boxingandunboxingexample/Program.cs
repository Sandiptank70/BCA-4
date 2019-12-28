using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace boxingandunboxingexample
{
    class Program
    {
        static void Main(string[] args)
        {
            object ans = 22;
            int a;
            a = Convert.ToInt16(ans);//Unboxing
            Console.WriteLine("Value of A is:" + a);

            string nm = "ABC";
            object temp;
            temp = nm;//Boxing;
            Console.WriteLine("Value of Temp is:" + temp);
            Console.Read();

        }
    }
}
