package structuralModel.适配器模式;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("vlc file:"+fileName);
    }

    public void playMp4(String fileName) {

    }
}
