
package decorator;

public abstract class Gifts implements ItemsInterface {

    protected ItemsInterface tempGiftBox;

    public Gifts(ItemsInterface newGiftBox) {

        tempGiftBox = newGiftBox;

    }

    public String getDescription() {

        return tempGiftBox.getDescription();

    }

    public double getCost() {

        return tempGiftBox.getCost();

    }
}
