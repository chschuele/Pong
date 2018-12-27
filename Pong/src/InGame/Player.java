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
import javax.swing.Timer;

public class Player extends PongLine {

    /**
     * Attributes
     */

    /**
     * constant speed value for the player movage
     */
    private final int SPEED = 5;

    /**
     * Timer that moves the player
     */
    private Timer mover;

    /**
     * Associations
     */
    private Side direction;

    /**
     *
     * @param startX
     * @param startY
     * @param destX
     * @param destY
     * @param position
     */
    public Player(double startX, double startY, double destX, double destY, Side position) {
        super(startX, startY, destX, destY, position);

        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * starts to move the player
     *
     * @param direction
     */
    public void startMove(Side direction) {
        switch (direction) {
            case LEFT:
                break;
            case RIGHT:
                break;
            case BOTTOM:
                break;
            case TOP:
                break;
            default:
                break;
        }
    }

    /**
     * stops to move the player
     */
    public void stopMove() {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
