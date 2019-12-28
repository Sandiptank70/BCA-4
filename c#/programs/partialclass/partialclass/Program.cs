using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace partialclass
{
    public partial class demo
    {
        public void hi()
        {
            Console.WriteLine("First Part Execute");
        }
    }
    public partial class demo
    {
        public void hello()
        {
            Console.WriteLine("Second Part Execute");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            demo d = new demo();
            d.hi();
            d.hello();
            Console.Read();
        }
    }
}
