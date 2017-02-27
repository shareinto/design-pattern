public class AddCommand : Command {

    private OperationApi operation = null;

    private int opeNum;

    public void Execute() {
        this.operation.Add(opeNum);
    }

    public void Undo() {
        this.operation.Substract(opeNum);
    }

    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }
}