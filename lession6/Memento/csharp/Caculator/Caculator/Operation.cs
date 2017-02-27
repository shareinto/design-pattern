
using System;

public class Operation : OperationApi
{
    private int result;

    public Memento Memento
    {
   
        set
        {
            var m = value as MementoImpl;
            if (m == null)
            {
                this.result = 0;
            }
            else
            {
                this.result = m.getResult();
            }
        }
    }

    public int Result
    {
        get
        {
            return result;
        }
    }
    public void Add(int num)
    {
        result += num;
    }

    public Memento CreateMemento()
    {
        MementoImpl m = new MementoImpl(result);
        return m;
    }

    public void Substract(int num)
    {
        result -= num;
    }
    private class MementoImpl : Memento
    {
        private int result = 0;
        public MementoImpl(int result)
        {
            this.result = result;
        }
        public int getResult()
        {
            return result;
        }
    }
}
