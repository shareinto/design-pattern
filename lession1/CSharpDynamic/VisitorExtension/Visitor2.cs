using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VisitorElement;

namespace VisitorExtension
{
    public class Visitor2
    {
        public void View(Element1 element)
        {
            Console.WriteLine("visitor2 view element1");
        }

        public void View(Element2 element)
        {
            Console.WriteLine("visitor2 view element2");
        }
    }
}
