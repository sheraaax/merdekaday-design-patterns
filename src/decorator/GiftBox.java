
package decorator;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.ImageView;
import xmastreeswing.MerdekaDay;
import javax.imageio.ImageIO;

public class GiftBox implements ItemsInterface {

    @Override
    public String getDescription() {
        return "Merdeka Decoration Items: ";
    }

    @Override
    public double getCost() {
        return 20.00;
    }

    @Override
    public void setImage(ImageView imageView) {
    }

}
