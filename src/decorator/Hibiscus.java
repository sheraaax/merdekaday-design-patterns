
package decorator;

import javafx.scene.image.ImageView;

public class Hibiscus extends Decorations {

    DecorationInterface background;

    public Hibiscus(DecorationInterface newBackground) {
        super(newBackground);
        this.background = newBackground;
    }

    @Override
    public String getDescription() {

        return tempBackground.getDescription() + ", Hibiscus";

    }


    @Override
    public void setImage(ImageView imageView) {
        if (!imageView.isVisible()) {
            imageView.setVisible(true);
        } else {
            imageView.setVisible(false);
        }
    }

}
