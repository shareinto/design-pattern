using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace AbstractFactorySummer
{
    public class SummerCanclebutton : Button
    {
        public SummerCanclebutton():base()
        {
            this.BackColor = Color.DeepSkyBlue;
            this.Location = new System.Drawing.Point(257, 127);
            this.Name = "";
            this.Size = new System.Drawing.Size(75, 23);
            this.TabIndex = 5;
            this.Text = "取消";
            this.UseVisualStyleBackColor = false;
        }
    }
}
