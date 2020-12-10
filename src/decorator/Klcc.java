
package decorator;

import javafx.scene.image.ImageView;

public class Klcc extends Decorations {

    DecorationInterface background;

    public Klcc(DecorationInterface newBackground) {
        super(newBackground);
        this.background = newBackground;
    }

    @Override
    public String getDescription() {

        return tempBackground.getDescription() + ", KLCC";

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
