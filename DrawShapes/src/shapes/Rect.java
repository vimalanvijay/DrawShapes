package shapes;

import java.awt.*;

public class Rect extends Shapes {
    private int width; // Fields
    private int height; // Fields

    public Rect(Point initPos, Color col, int w,int h){
        super(initPos, col); // The constructor
        height=h; // Initialize fields
        width=w;
    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width, height);
    }
}