
public class SubstractCommand : Command{

    private OperationApi operation = null;

    private int opeNum;

    public SubstractCommand(OperationApi operation,int opeNum){
        this.operation = operation;
        this.opeNum = opeNum;
    }

    public void Execute() {
        this.operation.Substract(opeNum);
    }

    public void Undo() {
        this.operation.Add(opeNum);
    }
}