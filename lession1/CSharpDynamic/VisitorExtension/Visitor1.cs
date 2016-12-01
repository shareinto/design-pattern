using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VisitorElement;

namespace VisitorExtension
{
    public class Visitor1
    {
        public void View(Element1 element)
        {
            Console.WriteLine("visitor1 view element1");
        }

        public void View(Element2 element)
        {
            Console.WriteLine("visitor1 view element2");
        }
    }
}
