package structuralModel.适配器模式;

public class AdapterPatterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", ".mp3");
        audioPlayer.play("mp4", ".mp4");
        audioPlayer.play("vlc", ".vlc");
        audioPlayer.play("avi", ".avi");
    }
}
