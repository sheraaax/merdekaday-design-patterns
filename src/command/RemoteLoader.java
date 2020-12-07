package command;

import javafx.scene.image.ImageView;

public class RemoteLoader {

    public static void init(ImageView flagGif) {

        RemoteControl remoteCont = new RemoteControl();
        Flag flag = new Flag();
        FlagOnCommand flagOn = new FlagOnCommand(flag);
        FlagOffCommand flagOff = new FlagOffCommand(flag);

        // if(!flag.getStatus())
        //     remote.setCommand(flagOff);
        // else
        //     remote.setCommand(flagOn);

        remoteCont.setCommand(flag.getStatus() ? flagOff : flagOn);
        remoteCont.buttonPressed(flagGif);
    }

}
