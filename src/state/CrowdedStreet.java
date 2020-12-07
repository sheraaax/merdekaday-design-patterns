
package state;

import javafx.scene.image.ImageView;

public class CrowdedStreet implements State{
    
    ImageView people_gif;
    private final Street street;
    
    public CrowdedStreet(ImageView people_gif, Street street){
        this.people_gif = people_gif;
        this.street = street;
    }

    @Override
    public void performAction() {
        System.out.println("There are people on the street!");
        people_gif.setVisible(true);
        street.changeState(street.emptyStreet());
    }
    
}
