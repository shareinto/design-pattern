using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySummer
{
    public class SummerLoginbutton : Button
    {
        public SummerLoginbutton():base()
        {
            this.BackColor = System.Drawing.Color.DeepSkyBlue;
            this.Location = new System.Drawing.Point(161, 127);
            this.Name = "button1";
            this.Size = new System.Drawing.Size(75, 23);
            this.TabIndex = 4;
            this.Text = "登录";
            this.UseVisualStyleBackColor = false;
        }
    }
}
