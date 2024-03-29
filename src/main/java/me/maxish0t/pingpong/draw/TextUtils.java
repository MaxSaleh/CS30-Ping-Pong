package me.maxish0t.pingpong.draw;

import me.maxish0t.pingpong.util.Constants;

import java.awt.*;

public class TextUtils {

    /**
     * Draws a text
     */
    public static void drawText(String string, int x, int y, int size, Color color, Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(color);
        graphics.setFont(new Font("TimesRoman", Font.PLAIN, size));
        g2.drawString(string, x, y);

        if (Constants.debugStrings == true) {
            System.out.println("String: " + string + " Size X: " + x + " Size Y: " + y + " Size: " + size + " Color: " + color);
            Constants.debugStrings = false;
        }
    }

}
