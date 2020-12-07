package command;

import javafx.scene.image.ImageView;

public class Flag {

    private static Boolean status = false;
    private static MerdekaMusic music = new MerdekaMusic();

    public void on() {
        status = true;
        
        music.play();
    }

    public void off() {
        status = false;

        music.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.print("Play music! ");
        System.out.println("Flag is put up!");

        imageView.setVisible(true);
        music.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.print("Stop music! ");
        System.out.println("Flag is taken down!");

        imageView.setVisible(false);
        music.stop();
    }

    public Boolean getStatus() {
        return status;
    }
    
}
