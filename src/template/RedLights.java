package template;

import javafx.scene.image.ImageView;

public class RedLights extends LightsTemplate {
    
    static boolean status = false;


	public void setLights(ImageView redlights) {
        if(!status) {
            redlights.setVisible(true);
            status = true;
            System.out.println("Red lights are up!");
        } else {
            redlights.setVisible(false);
            status = false;
            System.out.println("Red lights are down!");
        }
    }
}
