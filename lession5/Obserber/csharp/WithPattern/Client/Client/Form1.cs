using Framework;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Client
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Downloader downloader = new Downloader("http://cdncs.101.com/v0.1/static/job_executor/GoogleSignIn-4.0.1.tar.gz?attachment=true&serviceName=job_executor", "D:\\vs.exe");
            downloader.RegistProgress(new ConsoleProgress.ConsoleProgress());
            downloader.RegistProgress(new ProgressBarProgress.ProgressBarProgress(this.progressBar1));
            downloader.AsyncDownload();
        }
    }
}
