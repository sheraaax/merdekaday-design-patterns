package command;

import javafx.scene.image.ImageView;

public class KidsOnCommand implements Command {

    Kids kids;

    public KidsOnCommand(Kids kids) {
        this.kids = kids;
    }

    public void execute() {
        kids.on();
    }

    public void execute(ImageView imageView) {
        kids.on(imageView);
    }
    
}
