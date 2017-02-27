public class AddCommand implements Command {

    private OperationApi operation = null;

    private int opeNum;

    public void execute() {
        this.operation.add(opeNum);
    }

    public void undo() {
        this.operation.substract(opeNum);
    }

    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }
}