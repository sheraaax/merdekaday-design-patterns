
package decorator;

public abstract class Decorations implements DecorationInterface {

    protected DecorationInterface tempBackground;

    public Decorations(DecorationInterface newBackground) {

        tempBackground = newBackground;

    }

    public String getDescription() {

        return tempBackground.getDescription();

    }

}
