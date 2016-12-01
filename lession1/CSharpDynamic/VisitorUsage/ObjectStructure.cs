using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using VisitorElement;
using VisitorExtension;

namespace VisitorUsage
{
    public class ObjectStructure
    {
        private IList<object> _list = new List<object>();
        public void Add(object element)
        {
            _list.Add(element);
        }

        public void Accept(dynamic visitor)
        {
            foreach (dynamic element in _list)
            {
                Accept(element, visitor);
            }
        }

        private void Accept(Element1 element, Visitor1 visitor)
        {
            visitor.View(element);
        }
        private void Accept(Element1 element, Visitor2 visitor)
        {
            visitor.View(element);
        }
        private void Accept(Element2 element, Visitor1 visitor)
        {
            visitor.View(element);
        }
        private void Accept(Element2 element, Visitor2 visitor)
        {
            visitor.View(element);
        }
    }
}
