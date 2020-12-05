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

public class NoFlag implements State {
    
    ImageView flag_gif;
    Flag flag;
    
    public NoFlag(ImageView flag_gif, Flag flag){
        this.flag_gif = flag_gif;
        this.flag = flag;
    }

    @Override
    public void performFlagAction() {
        System.out.println("Flag is taken down!");
        flag_gif.setVisible(false);
        flag.changeState(flag.waveFlag());
    }
    
}
