using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace constructorchaining
{
    class stud
    {
        int rno;
        string name;
        private stud()
        {
            rno = 0;
            name = "";
        }
        private stud(int rno)
            : this()
        {
            this.rno = rno;
        }
        public stud(int rno, string name)
            : this(rno)
        {
            this.name = name;
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
            stud s = new stud(1, "ABC");
            s.printdata();
            Console.Read();
        }
    }
}
