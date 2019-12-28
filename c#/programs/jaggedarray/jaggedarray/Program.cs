using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace jaggedarray
{
    class Program
    {
        static void Main(string[] args)
        {
            string[][] nm = new string[2][]
            {
                new string[]{"A","B","C","D"},
                new string[]{"a","b"}
            };
            for (int i = 0; i < 2; i++)
            {
                //for (int j = 0; j < nm[i].Length; j++)
                foreach(string val in nm[i])
                {
                    //Console.Write(nm[i][j]);
                    Console.Write(val);
                }
                Console.WriteLine();
            }
            Console.Read();
        }
    }
}
