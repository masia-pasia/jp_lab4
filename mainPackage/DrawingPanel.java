package mainPackage;

import mainPackage.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingPanel extends JPanel {
    Circle circle;
    Square square;
    char whichShape;

DrawingPanel(){
    this.setBackground(new Color(200,220,220));
    this.setBounds(0,0,600,250);
    this.setLayout(null);
    this.setFocusable(true);
    this.setOpaque(true);

    this.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            super.keyReleased(e);
            if(e.getKeyCode() == KeyEvent.VK_C){
                whichShape = 'c';
            }

            if(e.getKeyCode()==KeyEvent.VK_S){
                whichShape = 's';
            }
        }
    });

    this.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseReleased(MouseEvent e) {
            super.mouseReleased(e);

            if(whichShape=='c'){
                circle = new Circle(e.getX(), e.getY());
                repaint();
            }

            if(whichShape=='s'){
                square = new Square(e.getX(), e.getY());
                repaint();
            }
        }
    });

}
    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g.create();
    if(whichShape=='c') {
        g2d.setColor(new Color(90,95,200));
        circle.circleShape(g2d);
    }

    if(whichShape=='s'){
        g2d.setColor(Color.darkGray);
        square.squareShape(g2d);
    }

    }
}
