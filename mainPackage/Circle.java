package mainPackage;

import java.awt.*;

public class Circle {
    private int x;
    private int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void circleShape(Graphics2D g2d){g2d.fillOval(x,y,20,20);}


}
