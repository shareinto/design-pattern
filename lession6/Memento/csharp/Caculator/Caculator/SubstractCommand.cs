using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


public class SubstractCommand : AbstractCommand
{
    private int opeNum;
    public SubstractCommand(OperationApi operation, int opeNum)
        : base(operation)
    {
        this.opeNum = opeNum;
    }
    public override void Execute()
    {
        this.operation.Substract(this.opeNum);
    }
}

