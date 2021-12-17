package mainPackage;

import java.awt.*;

public class Square {
    private int x;
    private int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void squareShape(Graphics2D g2d){g2d.fillRect(x,y,20,20);}
}
