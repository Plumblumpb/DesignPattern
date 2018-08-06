package structuralModel.适配器模式;

public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("MP4 file:"+fileName);


    }
}
