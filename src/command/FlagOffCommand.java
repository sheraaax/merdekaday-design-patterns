package command;

import javafx.scene.image.ImageView;

public class FlagOffCommand implements Command {

    Flag flag;

    public FlagOffCommand(Flag flag) {
        this.flag = flag;
    }

    public void execute() {
        flag.off();
    }

    public void execute(ImageView imageView) {
        flag.off(imageView);
    }
    
}
