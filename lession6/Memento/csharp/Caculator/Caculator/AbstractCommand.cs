using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


public abstract class AbstractCommand : Command
{
    public AbstractCommand(OperationApi operation)
    {
        this.operation = operation;
    }
    protected OperationApi operation = null;

    public Memento CreateMemento()
    {
        return this.operation.CreateMemento();
    }

    public abstract void Execute();

    public void Redo(Memento m)
    {
        this.operation.Memento = m;
    }

    public void Undo(Memento m)
    {
        this.operation.Memento = m;
    }
}

