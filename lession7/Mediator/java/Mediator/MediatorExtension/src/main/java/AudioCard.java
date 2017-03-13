/**
 * Created by Administrator on 2017/3/13.
 */
public class AudioCard extends Colleague{
    public AudioCard(Mediator mediator) {
        super(mediator);
    }
    public void soundData(String data){
        System.out.println("画外音："+data);
    }
}
