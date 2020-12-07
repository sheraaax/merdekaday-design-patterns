
package state;

import javafx.scene.image.ImageView;

public class EmptyStreet implements State {
    
    ImageView peopleGif;
    Street street;
    
    public EmptyStreet(ImageView peopleGif, Street street){
        this.peopleGif = peopleGif;
        this.street = street;
    }

    @Override
    public void performAction() {
        System.out.println("There are no one on the street!");
        peopleGif.setVisible(false);
        street.changeState(street.crowdedStreet());
    }
    
}
