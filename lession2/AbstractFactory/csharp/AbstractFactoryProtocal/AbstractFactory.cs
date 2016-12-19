using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactoryProtocal
{
    public interface AbstractFactory
    {
        TextBoxBase CreateLoginname();
        TextBoxBase CreatePassword();
        ButtonBase CreateLoginButton();
        ButtonBase CreateCancleButton();

    }
}
