using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySpring
{
    public class SpringCanclebutton : Button
    {
        public SpringCanclebutton():base()
        {
            this.BackColor = System.Drawing.Color.GreenYellow;
            this.Location = new System.Drawing.Point(257, 127);
            this.Name = "";
            this.Size = new System.Drawing.Size(75, 23);
            this.TabIndex = 5;
            this.Text = "取消";
            this.UseVisualStyleBackColor = false;
        }
    }
}
