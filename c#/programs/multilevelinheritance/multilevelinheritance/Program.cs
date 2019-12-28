using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace multilevelinheritance
{
    class clsstud
    {
        int rno;
        string name;
        public int EMPNO
        {
            get { return rno; }
            set { rno = value; }
        }
        public string EMPNM
        {
            get { return name; }
            set { name = value; }
        }
    }
    class marks : clsstud
    {
        int eng, mat;
        public int English
        {
            get { return eng; }
            set { eng = value; }
        }
        public int Maths
        {
            get { return mat; }
            set { mat = value; }
        }
    }
    class result : marks
    {
        public int total
        {
            get { return English + Maths; }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            result r = new result();
            Console.Write("Enter Roll Number:");
            r.EMPNO = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Name:");
            r.EMPNM = Console.ReadLine();
            Console.Write("Enter English Marks:");
            r.English = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Maths Marks:");
            r.Maths = Convert.ToInt16(Console.ReadLine());

            Console.WriteLine("Roll Number is:" + r.EMPNO);
            Console.WriteLine("Name is:" + r.EMPNM);
            Console.WriteLine("English Marks is:" + r.English);
            Console.WriteLine("Maths Marks is:" + r.Maths);
            Console.WriteLine("===============================");
            Console.WriteLine("Total is:" + r.total);
            Console.Read();
        }
    }
}
