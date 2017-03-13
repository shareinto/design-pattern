/**
 * Created by Administrator on 2017/3/13.
 */
public class CDDriver extends Colleague{
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    private String data = "";
    public String getData(){
        return this.data;
    }

    public void readCD(){
        this.data = "我的家乡在黄土高坡,上吐下泄就秀逗";
        this.getMediator().changed(this);
    }
}
