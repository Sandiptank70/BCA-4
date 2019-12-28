using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace sealedmethod
{
    class Base
    {
        public virtual string display()
        {
            return "Selaed Method";
        }
    }
    class Derived : Base
    {
        public sealed override string display()
        {
            return "selaed Method From Derived Class";
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Derived d = new Derived();
            Console.WriteLine(d.display());
            Console.Read();
        }
    }
}
