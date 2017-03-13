/**
 * Created by Administrator on 2017/3/13.
 */
public class Program {
    public static void main(String[] args) {
        Parser parser = new Parser();
        Expression expression = parser.parse("+b-c");
        Context caculate = new
                CaculateContext();
        Context validate = new ValidateContext();
        caculate.getMaps().put("a", 100);
        caculate.getMaps().put("b", 200);
        caculate.getMaps().put("c", 20);
        System.out.println(expression.interpret(validate));
    }
}
