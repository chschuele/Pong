/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

/**
 *
 * @author chSch
 */
import InGame.DirectionVector;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import javax.swing.Timer;
import pong.MainMenu;

public class Puck extends Point2D.Double {

    /**
     * diameter the puck optically has
     */
    public static final int DIAMETER = 10;
    private double ballX; 
    private double ballY;

    public static double getBallX() {
        return  MainMenu.getWidthPlayfield()/2;
    }

    public static double getBallY() {
        return MainMenu.getHeightPlayfield()/2;
    }
    /**
     * timer that moves the puck in it's vectors direction
     */
    private Timer mover;

    /**
     * pucks direction
     */
    private DirectionVector unitVector;


    public Puck() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation setUnitVector
     *
     * set new vector for puck
     *
     * @param x -
     * @param y -
     */
    public void setUnitVector(double x, double y) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation getUnitVector
     *
     * @return DirectionVector pucks direction
     */
    public DirectionVector getUnitVector() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * starts the timer that moves the puck
     */
    public void start(Timer timer) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * stops the timer that moves the puck
     */
    public void stop(Timer timer) {
        timer.stop();
    }

    /**
     * highers the timeout of the mover Timer
     */
    public void slower() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * lowers the timout of the mover Timer
     */
    public void faster() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation move.<br />
     *
     * move puck once in his direction
     *
     */
    public void move() {
        throw new UnsupportedOperationException("not yet implemented");
    }
    
}
