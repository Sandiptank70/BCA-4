using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace staticconstructor
{
    class stud
    {
        int rno;
        static string name;
        static stud()
        {
            name = "ABC";
        }
        public stud()
        {
            rno = 1;
        }
        public void printdata()
        {
            Console.WriteLine("No is:" + rno);
            Console.WriteLine("Name is:" + name);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            stud s = new stud();
            s.printdata();
            Console.Read();
        }
    }
}
