using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Caculator
{
    public partial class Form1 : Form
    {
        private Caculator caculator = new Caculator();
        private OperationApi operationApi = new Operation();
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var cmd = new AddCommand(this.operationApi, Convert.ToInt32(this.textBox1.Text));
            caculator.AddPressed(cmd);
            textBox2.Text = operationApi.Result.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            var cmd = new SubstractCommand(this.operationApi, Convert.ToInt32(this.textBox1.Text));
            caculator.AddPressed(cmd);
            textBox2.Text = operationApi.Result.ToString();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            caculator.UndoPressed();
            RefreshResult();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            caculator.RedoPressed();
            RefreshResult();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void RefreshResult()
        {
            textBox2.Text = operationApi.Result.ToString();
        }
    }
}
