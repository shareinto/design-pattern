using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySpring
{
    public class SpringLoginbutton : Button
    {
        public SpringLoginbutton():base()
        {
            this.BackColor = System.Drawing.Color.GreenYellow;
            this.Location = new System.Drawing.Point(161, 127);
            this.Name = "button1";
            this.Size = new System.Drawing.Size(75, 23);
            this.TabIndex = 4;
            this.Text = "登录";
            this.UseVisualStyleBackColor = false;
        }
    }
}
