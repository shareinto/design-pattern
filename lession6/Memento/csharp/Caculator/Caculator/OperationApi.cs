
public interface OperationApi
{
    int Result { get; }

    void Add(int num);

    void Substract(int num);
    Memento Memento { set; }
    Memento CreateMemento();
}
