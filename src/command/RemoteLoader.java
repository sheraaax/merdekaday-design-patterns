package command;

import javafx.scene.image.ImageView;

public class RemoteLoader {

    public static void init(ImageView kidsGif) {

        RemoteControl remote = new RemoteControl();
        Kids kids = new Kids();
        KidsOnCommand kidsOn = new KidsOnCommand(kids);
        KidsOffCommand kidsOff = new KidsOffCommand(kids);

        // if(!kids.getStatus())
        //     remote.setCommand(kidsOff);
        // else
        //     remote.setCommand(kidsOn);

        remote.setCommand(kids.getStatus() ? kidsOff : kidsOn);
        remote.buttonPressed(kidsGif);
    }


    // public static void init(ImageView santaImage) {
    //     RemoteControl remote = new RemoteControl();
    //     Santa santa = new Santa();
    //     SantaOnCommand santaOn = new SantaOnCommand(santa);
    //     SantaOffCommand santaOff = new SantaOffCommand(santa);

    //     remote.setCommand(santa.getStatus() ? santaOff : santaOn);
    //     remote.buttonPressed(santaImage);
    // }
}
