
package decorator;

import javafx.scene.image.ImageView;


public class AddDecoration {

    public static void init(DecorationInterface background, ImageView img1, ImageView img2, ImageView img3, ImageView img4) {

        if (img1.isVisible()) {
            img1.yProperty().set(95);
            img1.xProperty().set(-30);
        }
        if (img2.isVisible()) {
            img2.yProperty().set(210);
        }
        if (img3.isVisible()) {
            img3.yProperty().set(110);
        }
        if (img4.isVisible()) {
            img4.yProperty().set(200);
        }

    }

}
