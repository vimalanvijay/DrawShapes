package shapes;

import java.awt.*;

public abstract class Shapes {
    protected Point pos;
    protected Color col;

    public Shapes(Point initPos, Color col) {
        pos=initPos;
        this.col=col;
    }

    public abstract void draw(Graphics g);
}
