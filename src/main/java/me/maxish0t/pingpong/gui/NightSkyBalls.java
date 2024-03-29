package me.maxish0t.pingpong.gui;

import me.maxish0t.pingpong.util.Constants;

import java.awt.geom.Ellipse2D;

public class NightSkyBalls {

    private static final double ELLIPSE_W = 20;
    private static final double ELLIPSE_H = ELLIPSE_W;
    private int x = 0;
    private int y = 0;
    private Ellipse2D ellipse = new Ellipse2D.Double(x, y, ELLIPSE_W, ELLIPSE_H);
    int uLeftXPos, uLeftYPos;
    int xDirection = 1;
    int yDirection = 1;
    int diameter;
    int width = Constants.displayWidth;
    int height = Constants.displayHeight;

    public NightSkyBalls(int randomStartXPos, int randomStartYPos, int Diam) {
        super();
        this.xDirection = (int) (Math.random() * 4 + 1);
        this.yDirection = (int) (Math.random() * 4 + 1);
        // Holds the starting x & y position for the Rock
        this.uLeftXPos = randomStartXPos;
        this.uLeftYPos = randomStartYPos;
        this.diameter = Diam;

        x = uLeftXPos;
        y = uLeftYPos;
        ellipse = new Ellipse2D.Double(x, y, ELLIPSE_W, ELLIPSE_H);
    }

    public Ellipse2D getEllipse() {
        return ellipse;
    }

    public void move() {
        if (uLeftXPos + xDirection < 0)
            xDirection = 1;
        if (uLeftXPos + xDirection > width - 30)
            xDirection = -1;
        if (uLeftYPos + yDirection < 0)
            yDirection = 1;
        if (uLeftYPos + yDirection > height - 50)
            yDirection = -1;

        uLeftXPos = uLeftXPos + xDirection;
        uLeftYPos = uLeftYPos + yDirection;
        x = uLeftXPos;
        y = uLeftYPos;
        ellipse = new Ellipse2D.Double(x, y, ELLIPSE_W, ELLIPSE_H);
    }
}
