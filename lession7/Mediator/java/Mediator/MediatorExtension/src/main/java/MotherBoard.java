/**
 * Created by Administrator on 2017/3/13.
 */
public class MotherBoard implements Mediator{

    private CDDriver cdDriver = null;

    private CPU cpu = null;

    private VideoCard videoCard = null;

    private AudioCard audioCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
    public void setAudioCard(AudioCard audioCard) {
        this.audioCard = audioCard;
    }
    public void changed(Colleague colleague) {
        if(colleague == cdDriver){
            this.opeCDDriverReadData((CDDriver)colleague);
        }else if(colleague == cpu){
            this.opeCPU((CPU)colleague);
        }
    }

    private void opeCDDriverReadData(CDDriver cd){
        String data = cd.getData();
        this.cpu.executeData(data);
    }

    private void opeCPU(CPU cpu){
        String videoData = cpu.getVideoData();
        String soundData = cpu.getSoundData();
        this.videoCard.showData(videoData);
        this.audioCard.soundData(soundData);
    }
}
