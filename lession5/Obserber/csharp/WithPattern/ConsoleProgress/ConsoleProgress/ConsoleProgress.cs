using Protocol;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleProgress
{
    public class ConsoleProgress : Progress
    {
        public void Update(State state)
        {
            if (state.Completed)
            {
                Console.WriteLine("donwload has completed");
            }
            else
            {
                Console.WriteLine(string.Format("{0}/{1} {2}%", state.Read, state.Total, ((double)state.Read / state.Total * 100).ToString("0")));
            }
        }
    }
}
