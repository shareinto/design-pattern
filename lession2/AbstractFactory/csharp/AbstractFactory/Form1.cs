using AbstractFactorySpring;
using AbstractFactorySummer;
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
    public partial class Form1 : Form
    {
        private Login _login;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (_login == null)
            {
                _login = new Login(new SpringFactory());
                _login.Show();
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if (_login != null)
            {
                _login.ChangeSkin(new SpringFactory());
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (_login != null)
            {
                _login.ChangeSkin(new SummerFactory());
            }
        }
    }
}
