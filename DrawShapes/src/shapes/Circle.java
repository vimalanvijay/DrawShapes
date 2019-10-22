package shapes;

import java.awt.*;

public class Circle extends Shapes {
    private int rad; // Fields

    public Circle(Point initPos, Color col, int radius){
        super(initPos, col); // The constructor
        rad=radius; // Initialize fields
    }
    @Override
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad, rad);
    }
}