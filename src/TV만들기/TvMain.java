package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TvClass samsungTv = new TvClass();
        samsungTv.getTv();
        TvClass lgTv = new TvClass(true,12,20);
        lgTv.getTv();
        lgTv.setChannel(900);
        lgTv.setVolume(90);
        lgTv.getTv();


    }
}
