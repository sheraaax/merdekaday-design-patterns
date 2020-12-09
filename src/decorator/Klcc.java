
package decorator;

import javafx.scene.image.ImageView;

public class Klcc extends Gifts {

    ItemsInterface box;

    public Klcc(ItemsInterface newGiftBox) {
        super(newGiftBox);
        this.box = newGiftBox;
    }

    @Override
    public String getDescription() {

        return tempGiftBox.getDescription() + ", KLCC";

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
