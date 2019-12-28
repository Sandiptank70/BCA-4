using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Multipleinheritance
{
    interface ifaceemp
    {
        int eid { get; set; }
        string ename { get; set; }
        DateTime doj { get; set; }
        int experience();
    }
    interface ifacedept
    {
        string dname { get; set; }
    }
    class csharp : ifaceemp, ifacedept
    {
        int id;
        string name, dept;
        DateTime dt;
        public int eid
        {
            get { return id; }
            set { id = value; }
        }
        public string ename
        {
            get { return name; }
            set { name = value; }
        }
        public string dname
        {
            get { return dept; }
            set { dept = value; }
        }
        public DateTime doj
        {
            get { return dt; }
            set { dt = value; }
        }
        public int experience()
        {
            TimeSpan diffresult = DateTime.Now.Subtract(dt);
            return diffresult.Days / 365;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            csharp cs = new csharp();
            Console.Write("Enter Employee id:");
            cs.eid = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Employee Name:");
            cs.ename = Console.ReadLine();
            Console.Write("Enter Employee Department:");
            cs.dname = Console.ReadLine();
            Console.Write("Enter Date Of Joining:");
            cs.doj = Convert.ToDateTime(Console.ReadLine());

            Console.WriteLine("Employee Id is: " + cs.eid);
            Console.WriteLine("Employee Name is: " + cs.ename);
            Console.WriteLine("Employee Department is:" + cs.dname);
            Console.WriteLine("Date of Joing is:" + cs.doj);
            Console.WriteLine("Total Experience is:" + cs.experience() + " Years ");
            Console.Read();
        }
    }
}
