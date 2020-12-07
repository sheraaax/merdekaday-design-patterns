
package state;

import javafx.scene.image.ImageView;

public class CrowdedStreet implements State{
    
    ImageView peopleGif;
    private final Street street;
    
    public CrowdedStreet(ImageView peopleGif, Street street){
        this.peopleGif = peopleGif;
        this.street = street;
    }

    @Override
    public void performAction() {
        System.out.println("There are people on the street!");
        peopleGif.setVisible(true);
        street.changeState(street.emptyStreet());
    }
    
}
