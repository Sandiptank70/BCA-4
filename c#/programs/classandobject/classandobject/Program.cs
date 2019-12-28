using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace classandobject
{
    class stud
    {
        int rno;
        public static string name = "ABC";
        public void getdata()
        {
            Console.Write("Enter Roll Number:");
            rno = Convert.ToInt16(Console.ReadLine());
            //Console.Write("Enter Name:");
            //name = Console.ReadLine();
        }
        public void putdata()
        {
            Console.WriteLine("Roll Number is:" + rno);
            Console.WriteLine("Name is:" + name);
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            stud s = new stud();
            s.getdata();
            s.putdata();
            Console.WriteLine("Class Variable Value is:" +
                stud.name);
            Console.Read();
        }
    }
}
