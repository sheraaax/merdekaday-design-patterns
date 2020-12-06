package command;

import javafx.scene.image.ImageView;

public class RemoteLoader {

    public static void init(ImageView kidsGif) {

        RemoteControl remoteCont = new RemoteControl();
        Kids kids = new Kids();
        KidsOnCommand kidsOn = new KidsOnCommand(kids);
        KidsOffCommand kidsOff = new KidsOffCommand(kids);

        // if(!kids.getStatus())
        //     remote.setCommand(kidsOff);
        // else
        //     remote.setCommand(kidsOn);

        remoteCont.setCommand(kids.getStatus() ? kidsOff : kidsOn);
        remoteCont.buttonPressed(kidsGif);
    }

}
