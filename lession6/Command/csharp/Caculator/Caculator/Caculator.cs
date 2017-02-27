using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Caculator
{
    public class Caculator
    {
        private Stack<Command> undoCmds = new Stack<Command>();
        private Stack<Command> redoCmds = new Stack<Command>();

        public void AddPressed(Command addCmd)
        {
            addCmd.Execute();
            undoCmds.Push(addCmd);
        }
    
        public void SubstractPressed(Command substractCmd)
        {
            substractCmd.Execute();
            undoCmds.Push(substractCmd);
        }

        public void UndoPressed()
        {
            if (this.undoCmds.Count > 0)
            {
                var cmd = this.undoCmds.Pop();
                cmd.Undo();
                this.redoCmds.Push(cmd);
            }
        }

        public void RedoPressed()
        {
            if (this.redoCmds.Count > 0)
            {
                var cmd = this.redoCmds.Pop();
                cmd.Execute();
                this.undoCmds.Push(cmd);
            }
        }
    }
}
