using AbstractFactoryProtocal;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySummer
{
    public class SummerFactory : AbstractFactory
    {
        public ButtonBase CreateCancleButton()
        {
            return new SummerCanclebutton();
        }

        public ButtonBase CreateLoginButton()
        {
            return new SummerLoginbutton();
        }

        public Form CreateLoginForm()
        {
            throw new NotImplementedException();
        }

        public TextBoxBase CreateLoginname()
        {
            return new SummerLoginname();
        }

        public TextBoxBase CreatePassword()
        {
            return new SummerPassword();
        }
    }
}
