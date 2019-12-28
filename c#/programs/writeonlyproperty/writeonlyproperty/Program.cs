using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace writeonlyproperty
{
    class clsstud
    {
        int rno;
        string name;
        public int EMPNO
        {
            set { rno = value; }
        }
        public string EMPNM
        {
            set { name = value; }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsstud cs = new clsstud();
            cs.EMPNO = 1;
            cs.EMPNM = "ABC";
            //Console.WriteLine("No = {0} and Name = {1}", cs.EMPNO, cs.EMPNM);
            Console.Read();
        }
    }
}
