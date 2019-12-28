using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace indexerexample
{
    class clsindexer
    {
        string[] range = new string[5];
        public string this[int indexrange]
        {
            get { return range[indexrange]; }
            set { range[indexrange] = value; }
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsindexer ci = new clsindexer();
            for (int i = 0; i < 4; i++)
            {
                Console.Write("Enter Value of ci[{0}]:", i);
                ci[i] = Console.ReadLine();
            }
            for (int i = 0; i < 4; i++)
            {
                Console.WriteLine("Value of ci[{0}]: {1}", i, ci[i]);
            }
            Console.Read();
        }
    }
}
