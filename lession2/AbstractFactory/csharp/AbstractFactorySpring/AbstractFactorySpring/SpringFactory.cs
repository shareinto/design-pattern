using AbstractFactoryProtocal;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySpring
{
    public class SpringFactory : AbstractFactory
    {
        public ButtonBase CreateCancleButton()
        {
            return new SpringCanclebutton();
        }

        public ButtonBase CreateLoginButton()
        {
            return new SpringLoginbutton();
        }

        public TextBoxBase CreateLoginname()
        {
            return new SpringLoginname();
        }

        public TextBoxBase CreatePassword()
        {
            return new SpringPassword();
        }
    }
}
