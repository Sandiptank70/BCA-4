using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace readonlyproperty
{
    class clsstud
    {
        int rno;
        string name;
        public int EMPNO
        {
            get { return 1; }
        }
        public string EMPNM
        {
            get { return "ABC"; }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsstud cs = new clsstud();
            Console.WriteLine("No = {0} and Name = {1}",
                cs.EMPNO, cs.EMPNM);
            Console.Read();
        }
    }
}
