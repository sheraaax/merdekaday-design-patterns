package command;

import javafx.scene.image.ImageView;

public class KidsOffCommand implements Command {

    Kids kids;

    public KidsOffCommand(Kids kids) {
        this.kids = kids;
    }

    public void execute() {
        kids.off();
    }

    public void execute(ImageView imageView) {
        kids.off(imageView);
    }
    
}
