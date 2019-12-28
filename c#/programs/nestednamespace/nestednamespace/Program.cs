using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace nestednamespace
{
    namespace nested2
    {
        class stud
        {
            string nm;
            public void getdata()
            {
                Console.Write("Enter Name:");
                nm = Console.ReadLine();
            }
            public void dispdata()
            {
                Console.WriteLine("Student Name is:" + nm);
                Console.Read();
            }
        }
    }
}
    class Program
    {
        static void Main(string[] args)
        {
            nestednamespace.nested2.stud s=new nestednamespace.nested2.stud();
            s.getdata();
            s.dispdata();
        }
    }

