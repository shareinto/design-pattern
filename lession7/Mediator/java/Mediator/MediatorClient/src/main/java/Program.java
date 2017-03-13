/**
 * Created by Administrator on 2017/3/13.
 */
public class Program {
    public static void main(String[] args) {

        MotherBoard mediator = new MotherBoard();

        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        AudioCard sc = new AudioCard(mediator);

        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setAudioCard(sc);

        cd.readCD();
    }
}
