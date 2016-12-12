/**
 * Created by Administrator on 2016/12/12.
 */
public class Program {
    public static void main(String[] args) {
        Horse horse = new WhiteHorse();
        Mozi mozi = new Mozi();
        mozi.ride(horse);
        horse = new BlackHorse();
        mozi.ride(horse);

        Horse horse2 = new WhiteHorse();
        horse2.eat();
        horse2 = new BlackHorse();
        horse2.eat();
    }
}
