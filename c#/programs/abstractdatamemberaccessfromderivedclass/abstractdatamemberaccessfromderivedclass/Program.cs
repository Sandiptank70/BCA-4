using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstractdatamemberaccessfromderivedclass
{
    abstract class clspoly
    {
        public int h, w;
        public abstract double area();
    }
    class clsrect : clspoly
    {
        public clsrect(int x, int y)
        {
            base.h = x;
            base.w = y;
        }
        public override double area()
        {
            return base.h * base.w;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsrect cr = new clsrect(10, 10);
            Console.WriteLine("Area Of RectAngle is:" + cr.area());
            Console.Read();
        }
    }
}
