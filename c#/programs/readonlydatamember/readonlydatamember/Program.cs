using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace readonlydatamember
{
    class stud
    {
        readonly int rno = 1;
        readonly string name;
        const string college = "SSSDIIT";
        public stud(int no, string nm)
        {
           // rno = no;
            name = nm;
           
        }
        public void printdata()
        {
            Console.WriteLine("No is:" + rno);
            Console.WriteLine("Name is:" + name);
            Console.WriteLine("College is:" + college);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            stud s = new stud(2, "ABC");
            s.printdata();
            Console.Read();
        }
    }
}
