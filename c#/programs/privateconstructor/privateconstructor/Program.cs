using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace privateconstructor
{
    class stud
    {
        int rno;
        string name;
        private stud()
        {
            rno = 1;
            name = "ABC";
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
