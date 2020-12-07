package command;

import javafx.scene.image.ImageView;

public class FlagOnCommand implements Command {

    Flag flag;

    public FlagOnCommand(Flag flag) {
        this.flag = flag;
    }

    public void execute() {
        flag.on();
    }

    public void execute(ImageView imageView) {
        flag.on(imageView);
    }
    
}
