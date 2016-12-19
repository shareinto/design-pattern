using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySpring
{
    public class SpringLoginname : TextBox
    {
        public SpringLoginname():base()
        {
            this.BackColor = System.Drawing.Color.GreenYellow;
            this.ForeColor = System.Drawing.SystemColors.WindowText;
            this.Location = new System.Drawing.Point(160, 38);
            this.Name = "textBox1";
            this.Size = new System.Drawing.Size(178, 21);
            this.TabIndex = 2;
        }
    }
}
