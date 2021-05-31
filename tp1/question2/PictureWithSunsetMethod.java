package question2;

import question1.Circle;
import question1.Square;
import question1.Triangle;

/**
 * This class represents a simple picture. You can draw the picture using the
 * draw method. But wait, there's more: being an electronic picture, it can be
 * changed. You can set it to black-and-white display and back to colors (only
 * after it's been drawn, of course).
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.1 (24 May 2001)
 */
public class PictureWithSunsetMethod extends Picture{

    /**
     * Constructor for objects of class PictureWithSunsetMethod
     */
    public PictureWithSunsetMethod() {
        // nothing to do... instance variables are automatically set to null
    }
    
    public void makeInvisible(){
        super.makeInvisible();
    }

    protected void sunset(){
        super.getSun().slowMoveVertical(300);
    }

}
