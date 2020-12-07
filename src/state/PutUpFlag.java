/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import javafx.scene.image.ImageView;

/**
 *
 * @author Amirah Rozey
 */

public class PutUpFlag implements State{
    
    ImageView flag_gif;
    
    private final Flag flag;
    
    public PutUpFlag(ImageView flag_gif, Flag flag){
        this.flag_gif = flag_gif;
        this.flag = flag;
    }

    @Override
    public void performFlagAction() {
        System.out.println("Flag is put up!");
        flag_gif.setVisible(true);
        flag.changeState(flag.noFlag());
    }
    
}
