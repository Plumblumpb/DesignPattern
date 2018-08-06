package structuralModel.适配器模式;

public class AudioPlayer implements MediaPlayer{
    MediaPlayer mediaAdapter;
    public void play(String audioType, String filleName) {
        if(audioType.equalsIgnoreCase("avi")){
            System.out.println("avi file:"+filleName);
        }else  if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filleName);
        }else{
            System.out.println("not supported");
        }
    }
}
