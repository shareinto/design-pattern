import sun.nio.cs.HistoricallyNamedCharset;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Program {
    public static void main(String[] args) {
        Handler employee = new Employee();
        Handler supervisor = new Supervisor();
        Handler seniorManager = new SeniorManager();
        employee.setHandler(supervisor);
        supervisor.setHandler(seniorManager);

        Mobile mobile = new Mobile("Budget",10);

        employee.handleRequest(mobile);
    }
}
