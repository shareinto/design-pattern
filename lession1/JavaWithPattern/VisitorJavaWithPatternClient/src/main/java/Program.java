/**
 * Created by Administrator on 2016/12/1.
 */
public class Program {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new Element1());
        structure.add(new Element2());
        structure.accept(new Visitor1());
        structure.accept(new Visitor2());
        structure.accept(new Visitor3());
    }
}
