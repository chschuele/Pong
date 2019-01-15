/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import java.awt.geom.Ellipse2D;

public class Puck {

    public static double puckX, puckY, velocityX = 0.1, velocityY = 0.1;
    public static final int PUCK_DIAMETER = 20;
    public static int lastDirectionChange;

    public static Ellipse2D getBall() {
        Ellipse2D ball = new Ellipse2D.Double(puckX, puckY, PUCK_DIAMETER, PUCK_DIAMETER);
        return ball;
    }
}
