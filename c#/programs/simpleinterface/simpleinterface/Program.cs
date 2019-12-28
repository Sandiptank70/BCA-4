using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace simpleinterface
{
    interface ifaceproduct
    {
        int pid { get; set; }
        string pname { get; set; }
        double price { get; set; }
        double pro_qty(int qty);
    }
    class clsproduct : ifaceproduct
    {
        int id;
        string name;
        double cost;
        public int pid
        {
            get
            {
                return id;
            }
            set { id = value; }
        }
        public string pname
        {
            get { return name; }
            set { name = value; }
        }
        public double price
        {
            get { return cost; }
            set { cost = value; }
        }
        public double pro_qty(int qty)
        {
            return price * qty;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            clsproduct cp = new clsproduct();
            Console.Write("Enter Product ID:");
            cp.pid = Convert.ToInt16(Console.ReadLine());
            Console.Write("Enter Product Name:");
            cp.pname = Console.ReadLine();
            Console.Write("Enter Product Price:");
            cp.price = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Product Id is:" + cp.pid);
            Console.WriteLine("Product Name is:" + cp.pname);
            Console.WriteLine("Product Price is:" + cp.price);
            Console.WriteLine("Product Total Cost is:" + cp.pro_qty(20));
            Console.Read();
            
        }
    }
}
