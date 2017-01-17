using Protocol;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProgressBarProgress
{
    public class ProgressBarProgress
    {
        private ProgressBar _bar;
        public ProgressBarProgress(ProgressBar bar)
        {
            this._bar = bar;
        }
        public void Update(State state)
        {
            if(_bar.InvokeRequired)
            {
                _bar.Invoke(new Action(()=> {
                    _bar.Maximum = state.Total;
                    _bar.Value = state.Read;
                }));
            }
        }
    }
}
