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

public class Flag {
    
    private State putUpFlag;
    private State noFlag;
    private State state;
    ImageView gif;
    
    public Flag(ImageView gif){
        this.gif = gif;
        putUpFlag = new PutUpFlag(gif, this);
        noFlag = new NoFlag(gif,  this);
        state = putUpFlag;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void changeState(State state){
        this.state = state;
    }
    
    public void performFlagAction(){
        state.performFlagAction();
    }
    
    public State putUpFlag(){
        return putUpFlag;
    }
    
    public State noFlag(){
        return noFlag;
    }
}
