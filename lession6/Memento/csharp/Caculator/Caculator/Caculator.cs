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

        private Stack<Memento[]> undoMementos = new Stack<Memento[]>();
        private Stack<Memento[]> redoMementos = new Stack<Memento[]>();

        public void AddPressed(Command addCmd)
        {
            var m1 = addCmd.CreateMemento();
            addCmd.Execute();
            undoCmds.Push(addCmd);
            var m2 = addCmd.CreateMemento();
            this.undoMementos.Push(new Memento[] { m1, m2 });

        }
    
        public void SubstractPressed(Command substractCmd)
        {
            var m1 = substractCmd.CreateMemento();
            substractCmd.Execute();
            undoCmds.Push(substractCmd);
            var m2 = substractCmd.CreateMemento();
            this.undoMementos.Push(new Memento[] { m1, m2 });
        }

        public void UndoPressed()
        {
            if (this.undoCmds.Count > 0)
            {
                var cmd = this.undoCmds.Pop();
                var ms = this.undoMementos.Pop();
                cmd.Undo(ms[0]);
                this.redoCmds.Push(cmd);
                redoMementos.Push(ms);
            }
        }

        public void RedoPressed()
        {
            if (this.redoCmds.Count > 0)
            {
                var cmd = this.redoCmds.Pop();
                var ms = redoMementos.Pop();
                cmd.Redo(ms[1]);
                this.undoCmds.Push(cmd);
                this.undoMementos.Push(ms);
            }
        }
    }
}
