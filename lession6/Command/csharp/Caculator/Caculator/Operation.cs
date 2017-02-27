
public class Operation : OperationApi
{

    public int Result { get; set; }
    public void Add(int num)
    {
        Result += num;
    }
    public void Substract(int num)
    {
        Result -= num;
    }
}
