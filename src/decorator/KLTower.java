
package decorator;

import javafx.scene.image.ImageView;

public class KLTower extends Gifts {

    ItemsInterface box;

    public KLTower(ItemsInterface newGiftBox) {
        super(newGiftBox);
        this.box = newGiftBox;
    }

    @Override
    public String getDescription() {

        return tempGiftBox.getDescription() + ", KL Tower";

    }

    @Override
    public double getCost() {
        return tempGiftBox.getCost() + 10.00;
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
