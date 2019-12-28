using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace methodoverriding
{
    class fy
    {
        int x;
        public fy(int x)
        {
            this.x = x;
        }
        public string display()
        {
            return "X=" + x;
        }
    }
    class sy : fy
    {
        int y;
        public sy(int x, int y)
            : base(x)
        {
            this.y = y;
        }
        public new string display()
        {
            return base.display() + "Y=" + y;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            sy s = new sy(5, 6);
            Console.WriteLine(s.display());
            Console.Read();
        }
    }
}
