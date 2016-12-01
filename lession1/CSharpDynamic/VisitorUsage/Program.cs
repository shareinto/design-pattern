using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VisitorElement;
using VisitorExtension;

namespace VisitorUsage
{
    class Program
    {
        static void Main(string[] args)
        {
            ObjectStructure structure = new ObjectStructure();
            structure.Add(new Element1());
            structure.Add(new Element2());
            var visitor1 = new Visitor1();
            var visitor2 = new Visitor2();

            structure.Accept(visitor1);
            structure.Accept(visitor2);
            Console.Read();
        }
    }
}
