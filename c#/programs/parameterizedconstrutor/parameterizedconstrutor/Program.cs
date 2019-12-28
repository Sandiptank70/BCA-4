using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace parameterizedconstrutor
{
    class stud
    {
        int rno;
        string name;
        public stud(int no, string nm)
        {
            rno = no;
            name = nm;
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
            int no;
            string nm;
            Console.Write("Enter No:");
            no = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Name:");
            nm = Console.ReadLine();
            stud s = new stud(no, nm);
            s.printdata();
            Console.Read();
        }
    }
}
