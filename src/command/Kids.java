package command;

import javafx.scene.image.ImageView;

public class Kids {

    private static Boolean status = false;
    private static MerdekaMusic music = new MerdekaMusic();

    public void on() {
        status = true;
        System.out.println("Kids are displayed !");

        music.play();
    }

    public void off() {
        status = false;
        System.out.println("Kids are hidden !");

        music.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("Kids are displayed !");

        imageView.setVisible(true);
        music.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("Kids are hidden !");

        imageView.setVisible(false);
        music.stop();
    }

    public Boolean getStatus() {
        return status;
    }
    
}
