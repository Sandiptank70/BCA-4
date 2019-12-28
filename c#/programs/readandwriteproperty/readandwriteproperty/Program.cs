using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace readandwriteproperty
{
    class clsemp
    {
        private int m_eno,salary;
        private string m_ename;
        public int EMPNO
        {
            get { return m_eno; }
            set {
                if (value > 0)
                    m_eno = value;
                else
                    Console.WriteLine("Please Enter Proper Value");
            }
        }
        public string EMPNM
        {
            get { return m_ename.ToUpper(); }
            set { m_ename = value; }
        }
        public int EMPSAL
        {
            get { return salary; }
            set
            {
                if (value > 0)
                    salary = value;
                else
                    salary = 0;
            }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsemp e1 = new clsemp();
            Console.Write("Enter Employee Number:");
            e1.EMPNO = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Employee Name:");
            e1.EMPNM =Console.ReadLine();
            Console.Write("Enter Employee Salary:");
            e1.EMPSAL =Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("No is:{0} Name= {1}  Salray= {2}"
                , e1.EMPNO, e1.EMPNM,e1.EMPSAL);
            Console.Read();
        }
    }
}
