using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace singlenamespace
{
    class demo
    {
        public void hi()
        {
            Console.WriteLine("Say Hi");
        }
    }
}
namespace secondnm
{
    class disp
    {
        public void hello()
        {
            Console.WriteLine("Say Hello");
        }
    }
}
    class Program
    {
        static void Main(string[] args)
        {
            singlenamespace.demo d1 = new singlenamespace.demo();
            d1.hi();
            secondnm.disp d2 = new secondnm.disp();
            d2.hello();
            Console.Read();
        }
    }

