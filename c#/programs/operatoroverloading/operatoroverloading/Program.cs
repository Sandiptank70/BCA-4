using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace operatoroverloading
{
    class clsmath
    {
        public int a, b;
        public clsmath()
        {
            a = b = 0;
        }
        public clsmath(int x, int y)
        {
            a = x;
            b = y;
        }
        public static clsmath operator +(clsmath m1, clsmath m2)
        {
            clsmath m3 = new clsmath();
            m3.a = m1.a + m2.a;
            m3.b = m1.b + m2.b;
            return m3;
        }
        public static clsmath operator *(clsmath m1, clsmath m2)
        {
            clsmath m3 = new clsmath();
            m3.a = m1.a * m2.a;
            m3.b = m1.b * m2.b;
            return m3;
        }
        public static bool operator ==(clsmath m1, clsmath m2)
        {
            return ((m1.a == m2.a) && (m1.b == m2.b));
        }
        public static bool operator !=(clsmath m1, clsmath m2)
        {
            return ((m1.a != m2.a) && (m1.b != m2.b));
        }
        public static bool operator >(clsmath m1, clsmath m2)
        {
            return m1.a + m1.b > m2.a + m2.b;
        }
        public static bool operator <(clsmath m1, clsmath m2)
        {
            return m1.a + m1.b < m2.a + m2.b;
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            clsmath m1 = new clsmath(20, 40);
            clsmath m2 = new clsmath(5, 6);
            clsmath m3 = new clsmath();
            m3 = m1 + m2;
            Console.WriteLine("A is:" + m3.a);
            Console.WriteLine("B is:" + m3.b);
            m3 = m1 * m2;
            Console.WriteLine("A is:" + m3.a);
            Console.WriteLine("B is:" + m3.b);
            bool ans;
            ans = m1 == m2;
            Console.WriteLine(ans);
            ans = m1 != m2;
            Console.WriteLine(ans);
            ans = m1 > m2;
            Console.WriteLine(ans);
            ans = m1 < m2;
            Console.WriteLine(ans);
            Console.Read();
        }
    }
}
