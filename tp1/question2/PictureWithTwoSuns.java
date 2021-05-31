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
public class PictureWithTwoSuns extends Picture{
    private Circle sun2;

    /**
     * Constructor for objects of class PictureWithTwoSuns
     */
    public PictureWithTwoSuns() {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw() {
        super.draw();
        
        sun2 = new Circle();
        sun2.changeColor("yellow");
        sun2.moveHorizontal(230);
        sun2.moveVertical(10);
        sun2.changeSize(60);
        sun2.makeVisible();
    }
    
    public void makeInvisible(){
        super.makeInvisible();
        sun2.makeInvisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite() {
        if (super.getWall() != null) // only if it's painted already...
        {
            super.setBlackAndWhite();
            sun2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor() {
        if (super.getWall() != null) // only if it's painted already...
        {
            super.setColor();
            sun2.changeColor("yellow");
        }
    }

}
