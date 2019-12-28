using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sealedclass
{
    sealed class clsseal
    {
        int x, y;
        public clsseal()
        {
            x = 10;
            y = 20;
        }
        public int display()
        {
            return x * y;
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            clsseal cs = new clsseal();
            Console.WriteLine("Multiplication is:" + cs.display());
            Console.Read();
        }
    }
}
