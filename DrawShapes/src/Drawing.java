
import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.Point;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    private JFrame f;
    private Circle circle;
    private Rect rectangle;
    private Square square;

    public Drawing() {
        Point var1 = new Point(200, 200);
        Color var2 = new Color(10035814);
        this.circle = new Circle(var1, var2, 100);

        Point p1 = new Point(100, 100);
        Color c1 = new Color(10035814);
        this.rectangle = new Rect(p1, c1, 100,200);

        Point p2 = new Point(50, 50);
        Color c2 = new Color(10035814);
        this.square= new Square(p2,c2,100,100);

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        this.setBackground(Color.WHITE);
        this.setSize(500, 500);
    }

    private void setupFrame() {
        this.f = new JFrame("My window");
        this.f.add(this);
        this.f.setLayout((LayoutManager)null);
        this.f.setSize(400, 400);
        this.f.setVisible(true);
        this.f.setDefaultCloseOperation(3);
    }

    public void paint(Graphics g) {

        this.circle.draw(g);
        this.rectangle.draw(g);
        this.square.draw(g);
    }
}
