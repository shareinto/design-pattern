using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySummer
{
    public class SummerLoginname : TextBox
    {
        public SummerLoginname():base()
        {
            this.BackColor = System.Drawing.Color.DeepSkyBlue;
            this.ForeColor = System.Drawing.SystemColors.WindowText;
            this.Location = new System.Drawing.Point(160, 38);
            this.Name = "textBox1";
            this.Size = new System.Drawing.Size(178, 21);
            this.TabIndex = 2;
        }
    }
}
