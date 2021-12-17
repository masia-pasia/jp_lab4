package mainPackage;

import mainPackage.DrawingPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MainFrame extends JFrame {
    JFrame frame;

    MainFrame(String title) {
        super(title);
     frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        this.getContentPane().setBackground(new Color(200,220,220));
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);

    JButton runningGame = new JButton("Running Game");
    runningGame.setBounds(100, 110, 150,40);
    runningGame.setBackground(new Color(90,95,200));
    runningGame.addActionListener(e -> runningButtonGame(frame));
    runningGame.setVisible(true);
        this.add(runningGame);

    JButton drawingGame = new JButton("Drawing Shapes");
    drawingGame.setBounds(300, 110, 150,40);
    drawingGame.setBackground(new Color(90,95,200));
    drawingGame.addActionListener(e -> drawingPanel(frame));
    drawingGame.setVisible(true);
        this.add(drawingGame);

}

    public void start(){setVisible(true);}

    public void runningButtonGame(JFrame recentFrame){
        recentFrame.dispose();
        JFrame newFrame = new JFrame();
        newFrame.setTitle("Running Button");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(600,300);
        newFrame.getContentPane().setBackground(new Color(200,220,220));
        newFrame.setLayout(null);
        newFrame.setResizable(false);
        newFrame.setVisible(true);

        JButton runButton = new JButton("Catch me");
        runButton.setBounds(240,110,100,40);
        runButton.setBackground(new Color(90,95,200));
        runButton.setVisible(true);
        runButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Random random = new Random();

                if(e.getX() > 5){
                    runButton.setLocation(random.nextInt(500), random.nextInt(200));
                }

            }
        });

        runButton.addActionListener(e-> defaultMenu(newFrame));
        newFrame.add(runButton);

        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(480,200,80,40);
        resetButton.setBackground(new Color(90,95,200));
        resetButton.setVisible(true);
        resetButton.addActionListener(e -> resetButtonClicked(runButton));
        newFrame.add(resetButton);
    }

    public void drawingPanel(JFrame recentFrame){
        recentFrame.dispose();
        JFrame drawingFrame = new JFrame();
        drawingFrame.setTitle("Drawing Shapes");
        drawingFrame.setSize(600,300);
        drawingFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        drawingFrame.getContentPane().setLayout(null);
        drawingFrame.setResizable(false);

        JButton resetButton = new JButton("Go back to main menu");
        resetButton.setBounds(0,210,600,50);
        resetButton.setBackground(new Color(90,95,200));
        resetButton.setVisible(true);
        resetButton.addActionListener(e -> defaultMenu(drawingFrame));
        drawingFrame.add(resetButton);


        DrawingPanel panel = new DrawingPanel();
        drawingFrame.add(panel);
        drawingFrame.setVisible(true);



    }

    public void defaultMenu(JFrame recentFrame){
        recentFrame.dispose();
    }

    public void resetButtonClicked(JButton button){
        button.setLocation(300,150);
    }

}
