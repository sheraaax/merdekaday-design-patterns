
package decorator;

import javafx.scene.image.ImageView;

public class KLTower extends Decorations {

    DecorationInterface background;

    public KLTower(DecorationInterface newBackground) {
        super(newBackground);
        this.background = newBackground;
    }

    @Override
    public String getDescription() {

        return tempBackground.getDescription() + ", KL Tower";

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
