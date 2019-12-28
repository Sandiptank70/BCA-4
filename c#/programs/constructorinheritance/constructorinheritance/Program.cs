using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace constructorinheritance
{
    class A
    {
        int no;
        public A(int no)
        {
            this.no = no;
        }
        public void disp()
        {
            Console.WriteLine("No is:" + no);
        }
    }
    class B : A
    {
        int y;
        public B(int no, int y)
            : base(no)
        {
            this.y = y;
        }
        public void print()
        {
            base.disp();
            Console.WriteLine("Y is:" + y);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            B obj = new B(10, 20);
            obj.print();
            Console.Read();
        }
    }
}
