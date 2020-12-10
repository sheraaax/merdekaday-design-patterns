
package decorator;

import javafx.scene.image.ImageView;

public class Trishaw extends Decorations {

    DecorationInterface background;

    public Trishaw(DecorationInterface newBackground) {
        super(newBackground);
        this.background = newBackground;
    }

    @Override
    public String getDescription() {

        return tempBackground.getDescription() + ", Trishaw";

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
