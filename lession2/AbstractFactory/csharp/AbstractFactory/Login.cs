using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactory
{
    public partial class Login : Form
    {
        public Login(AbstractFactoryProtocal.AbstractFactory factory)
        {
            InitializeComponent();
            this.Controls.Add(factory.CreateLoginButton());
            this.Controls.Add(factory.CreateLoginname());
            this.Controls.Add(factory.CreatePassword());
            this.Controls.Add(factory.CreateCancleButton());
        }

        private void Login_Load(object sender, EventArgs e)
        {
        }
        public void ChangeSkin(AbstractFactoryProtocal.AbstractFactory factory)
        {
            this.Controls.Clear();
            InitializeComponent();
            this.Controls.Add(factory.CreateLoginButton());
            this.Controls.Add(factory.CreateLoginname());
            this.Controls.Add(factory.CreatePassword());
            this.Controls.Add(factory.CreateCancleButton());
        }
    }
}
