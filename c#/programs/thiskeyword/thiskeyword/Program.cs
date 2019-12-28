using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace thiskeyword
{
    class stud
    {
        int rno;
        string name;
        public stud(int rno, string name)
        {
            this.rno = rno;
            this.name = name;
        }
        public void printdata()
        {
            Console.WriteLine("Number is:" + rno);
            Console.WriteLine("Name is:" + name);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            stud s = new stud(1, "ABC");
            s.printdata();
            Console.Read();
        }
    }
}
