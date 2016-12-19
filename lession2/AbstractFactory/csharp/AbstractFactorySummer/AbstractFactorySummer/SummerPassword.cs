using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySummer
{
    public class SummerPassword : TextBox
    {
        public SummerPassword():base()
        {
            this.BackColor = System.Drawing.Color.DeepSkyBlue;
            this.Location = new System.Drawing.Point(161, 80);
            this.Name = "textBox2";
            this.Size = new System.Drawing.Size(177, 21);
            this.TabIndex = 3;
        }
    }
}
