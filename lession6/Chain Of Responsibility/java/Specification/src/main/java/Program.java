import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Program {
    public static void main(String[] args) {
        Handler employee = new Employee();
        Handler supervisor = new Supervisor();
        Handler manager = new Manager();
        Handler seniorManager = new SeniorManager();
        employee.setHandler(supervisor);
        supervisor.setHandler(manager);
        manager.setHandler(seniorManager);

        ISpecification<Mobile> basicSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getType().equals("Basic");
            }
        });

        ISpecification<Mobile> budgetSec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getType().equals("Budget");
            }
        });


        ISpecification<Mobile> premiumSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getType().equals("Premium");
            }
        });

        ISpecification<Mobile> budgetLowCostSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getCost() < 200 && o.getCost() >= 100;
            }
        });


        ISpecification<Mobile> budgetHighCostSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getCost() >= 200;
            }
        });

        ISpecification<Mobile> premiumLowCostSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getCost() < 500;
            }
        });

        ISpecification<Mobile> premiumHighCostSpec = new Specification<Mobile>(new IExpression<Mobile>() {
            public boolean isSatisfiedBy(Mobile o) {
                return o.getCost() >= 500;
            }
        });

        employee.setSpecification(basicSpec);
        supervisor.setSpecification(basicSpec);
        manager.setSpecification(budgetSec.And(budgetHighCostSpec).Or(premiumSpec.And(premiumLowCostSpec)));
        seniorManager.setSpecification(premiumSpec.And(premiumHighCostSpec));

        for (Mobile mobile : init()) {
            employee.handleRequest(mobile);
        }
    }

    private static List<Mobile> init() {

        List<Mobile> mobiles = new ArrayList<Mobile>();
        mobiles.add(new Mobile("Premium", 450));
        mobiles.add(new Mobile("Premium", 800));
        mobiles.add(new Mobile("Basic", 100));
        mobiles.add(new Mobile("Budget", 160));
        mobiles.add(new Mobile("Premium", 800));
        mobiles.add(new Mobile("Budget", 250));
        mobiles.add(new Mobile("Basic", 1));
        return mobiles;
    }
}
