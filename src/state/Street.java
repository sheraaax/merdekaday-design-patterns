
package state;

import javafx.scene.image.ImageView;

public class Street {
    
    private State emptyStreet;
    private State crowdedStreet;
    private State state;
    ImageView gif;
    
    public Street(ImageView gif){
        this.gif = gif;
        emptyStreet = new EmptyStreet(gif, this);
        crowdedStreet = new CrowdedStreet(gif,  this);
        state = crowdedStreet;
    }
    
    public State getState(){
        return this.state;
    }
    
    public void changeState(State state){
        this.state = state;
    }
    
    public void performAction(){
        state.performAction();
    }
    
    public State emptyStreet(){
        return emptyStreet;
    }
    
    public State crowdedStreet(){
        return crowdedStreet;
    }
}
