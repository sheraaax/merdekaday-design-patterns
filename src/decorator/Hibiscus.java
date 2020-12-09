
package decorator;

import javafx.scene.image.ImageView;

public class Hibiscus extends Gifts {

    ItemsInterface box;

    public Hibiscus(ItemsInterface newGiftBox) {
        super(newGiftBox);
        this.box = newGiftBox;
    }

    @Override
    public String getDescription() {

        return tempGiftBox.getDescription() + ", Hibiscus";

    }

    @Override
    public double getCost() {

        return tempGiftBox.getCost() + 200.00;

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
