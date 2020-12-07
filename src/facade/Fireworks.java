
package facade;

import javafx.scene.image.ImageView;

public class Fireworks
{
    ImageView fireworks1, fireworks2, fireworks3;
    static boolean showfireworks=false;
    
    public Fireworks(ImageView fireworks1, ImageView fireworks2, ImageView fireworks3)
    {
        this.fireworks1=fireworks1;
        this.fireworks2=fireworks2;
        this.fireworks3=fireworks3;
        // this.orn4=orn4;
        // this.orn5=orn5;
    }
    
    public void setFireworks()
    {
        if(showfireworks)
        {
            fireworks1.setVisible(false);
            fireworks2.setVisible(false);
            fireworks3.setVisible(false);
            // orn4.setVisible(false);
            // orn5.setVisible(false);
            showfireworks=false;
        }
        else
        {
            fireworks1.setVisible(true);
            fireworks2.setVisible(true);
            fireworks3.setVisible(true);
            // orn4.setVisible(true);
            // orn5.setVisible(true);
            showfireworks=true;
        }
    }
    
    
}
