using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace enumerationdatatypeexample
{
    class Program
    {
        public enum Days
        {
            Monday, Tuesday, Wednesday, Thrusday, Friday,
            Saturday, Sunday
        };
        public enum Cities { Rajkot = 79, Junagadh = 55, Gondal = 56, 
            Jetpur = 89 };

        static void Main(string[] args)
        {
            Days day = Days.Monday;
            Console.WriteLine((int)day);
            Cities city = Cities.Gondal;
            Console.WriteLine("City {0} and Value {1}", city, (int)city);
            Console.Read();
        }
    }
}
