
public class Operation implements OperationApi{

    private int result;
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public void add(int num) {
        result += num;
    }
    public void substract(int num) {
        result -= num;
    }
}
