package template;

import javafx.scene.image.ImageView;

public abstract class LightsTemplate {


    public void prepareLights(ImageView lights) {
        setLights(lights);
    }
    
    public abstract void setLights(ImageView lights);
    
}
