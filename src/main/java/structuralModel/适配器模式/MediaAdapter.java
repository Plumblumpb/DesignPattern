package structuralModel.适配器模式;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter (String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }
    public void play(String audioType, String filleName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(filleName);
        }else{
            advancedMediaPlayer.playMp4(filleName);
        }
    }
}
