
package decorator;

import javafx.scene.image.ImageView;

public class Background implements DecorationInterface {

    @Override
    public String getDescription() {
        return "Merdeka Decoration Items: ";
    }

    @Override
    public void setImage(ImageView imageView) {
    }

}
