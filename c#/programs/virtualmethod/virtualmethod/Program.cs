using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace virtualmethod
{
    class clspoly
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
        public virtual string display()
        {
            return "From Base class";
        }
    }
    class clstrangle:clspoly
    {
        public override string display()
        {
            string ans;
            ans = "Area Of Trangle is:" + (height * width * 0.5);
            return ans;
        }
 	}
    class Program
    {
        static void Main(string[] args)
        {
            clspoly obj = new clstrangle();
            Console.Write("Enter Height:");
            obj.height = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Width:");
            obj.width = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine(obj.display());
            Console.Read();
        }
    }
}
