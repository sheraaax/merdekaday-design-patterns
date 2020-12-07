
package state;

import javafx.scene.image.ImageView;

public class EmptyStreet implements State {
    
    ImageView people_gif;
    Street street;
    
    public EmptyStreet(ImageView people_gif, Street street){
        this.people_gif = people_gif;
        this.street = street;
    }

    @Override
    public void performAction() {
        System.out.println("There are no one on the street!");
        people_gif.setVisible(false);
        street.changeState(street.crowdedStreet());
    }
    
}
