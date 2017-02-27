/**
 * Created by Administrator on 2017/2/27.
 */
public interface Command {

    void Execute();

    void Undo(Memento m);

    void Redo(Memento m);

    Memento CreateMemento();
}
