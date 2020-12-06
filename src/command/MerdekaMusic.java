package command;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import java.io.File;

public class MerdekaMusic {

    private static Boolean loop = false;
    private static final String musicPath = "./src/res/tanggal31.mp3";
    private static final Media media = new Media(new File(musicPath).toURI().toString());
    private static final MediaPlayer music = new MediaPlayer(media);

    public MerdekaMusic() {
        // Empty method
    }

    public static void play() {
        if(loop) {
            music.setOnEndOfMedia(new Runnable(){
                public void run() {
                    music.seek(Duration.ZERO);
                }
            });
        }
        music.play();
    }

    public static void stop() {
        music.stop();
    }
    
}
