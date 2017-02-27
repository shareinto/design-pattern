/**
 * Created by Administrator on 2017/2/27.
 */
public class Mobile {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {

        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    private double cost;

    public String getDescription() {
        return "The mobile is of type : " + this.type;
    }

    public Mobile(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public void Process() {
        this.cost = (0.9) * this.cost;
        System.out.println(String.format("The new cost is: %f and the type is %s. ",
                this.cost, this.type));
    }

    @Override
    public String toString() {
        return String.format("Mobile %s cost %f", this.type, this.cost);
    }
}
