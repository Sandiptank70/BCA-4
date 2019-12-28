using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace abstractclassandmethod
{
    abstract class clspoly
    {
        int h, w;
        public int height
        {
            get { return h; }
            set { h = value; }
        }
        public int width
        {
            get { return w; }
            set { w = value; }
        }
        public abstract double area();
        public string nonabmethod()
        {
            return "Non-abstract Method";
        }
    }
    class clstrangle : clspoly
    {
        public override double area()
        {
            return height * width * 0.5;
        }
    }
    class clsrect : clspoly
    {
        public override double area()
        {
            return height * width;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clstrangle ct = new clstrangle();
            Console.Write("Enter Height:");
            ct.height = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Width:");
            ct.width = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("Area of Trangle is:" + ct.area());

            clsrect cr = new clsrect();
            Console.Write("Enter Height:");
            cr.height = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Width:");
            cr.width = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("Area of Rectangle is:" + cr.area());
            Console.WriteLine("Non Abstract Method Call:" + cr.nonabmethod());
            Console.Read();
        }
    }
}
