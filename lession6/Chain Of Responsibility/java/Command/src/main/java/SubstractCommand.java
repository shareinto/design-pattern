
public class SubstractCommand implements Command{

    private OperationApi operation = null;

    private int opeNum;

    public SubstractCommand(OperationApi operation,int opeNum){
        this.operation = operation;
        this.opeNum = opeNum;
    }

    public void execute() {
        this.operation.substract(opeNum);
    }

    public void undo() {
        this.operation.add(opeNum);
    }
}