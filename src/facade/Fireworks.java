
package facade;

import javafx.scene.image.ImageView;

public class Fireworks
{
    ImageView fireworks1;
    ImageView fireworks2;
    ImageView fireworks3;
    static boolean showfireworks=false;
    
    public Fireworks(ImageView fireworks1, ImageView fireworks2, ImageView fireworks3)
    {
        this.fireworks1=fireworks1;
        this.fireworks2=fireworks2;
        this.fireworks3=fireworks3;
    }
    
    public void setFireworks()
    {
        if(showfireworks)
        {
            fireworks1.setVisible(false);
            fireworks2.setVisible(false);
            fireworks3.setVisible(false);
            
            showfireworks=false;
            System.out.println("No fireworks are displayed!");
        }
        else
        {
            fireworks1.setVisible(true);
            fireworks2.setVisible(true);
            fireworks3.setVisible(true);
            
            showfireworks=true;
            System.out.println("All fireworks are displayed!");
        }
    }
    
    
}
