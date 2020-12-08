package template;

import javafx.scene.image.ImageView;

public class BlueLights extends LightsTemplate {

    static boolean status = false;


	public void setLights(ImageView bluelights) {
        if(!status) {
            bluelights.setVisible(true);
            status = true;
            System.out.println("Blue lights are up !");
        } else {
            bluelights.setVisible(false);
            status = false;
            System.out.println("Blue lights are down !");
        }
    }
    
}
