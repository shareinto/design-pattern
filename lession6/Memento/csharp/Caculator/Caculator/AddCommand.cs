using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


public class AddCommand : AbstractCommand
{
    private int opeNum;
    public AddCommand(OperationApi operation,int opeNum)
        :base(operation)
    {
        this.opeNum = opeNum;
    }
    public override void Execute()
    {
        this.operation.Add(this.opeNum);
    }
}

