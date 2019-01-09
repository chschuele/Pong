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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.util.HashSet;

import javax.swing.JPanel;

/**
 * playfield
 */
public class PlayFieldPanel extends JPanel {

    /**
     * Attributes
     */

    /**
     * playfield borders
     */
    private final HashSet<PongLine> lines;

    /**
     * puck
     */
    private final Puck puck;

    /**
     * Operation PlayFieldPanel
     *
     * @param playFieldSize - size of this panel
     * @param left -
     * @param right -
     * @param puck -
     * @param player -
     * @return
     */
    public PlayFieldPanel(Dimension playFieldSize, HashSet<PongLine> lines, Puck puck) {
       this.setPreferredSize(playFieldSize);
       this.setVisible(true);
        throw new UnsupportedOperationException("not yet implemented");
    }
    
    /**
     * Operation initComponents
     *
     * @param playFieldSize - size of this panel
     */
    private void initComponents(Dimension playFieldSize) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation paintComponent
     *
     * painting all elements placed on this panel
     *
     * @param gc - Graphics to draw on
     */
    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);
		
        // Draw the ball
        int x = (int)(Puck.getBallX() - Puck.DIAMETER);
        int y = (int)(Puck.getBallY() - Puck.DIAMETER);
        int size = 2*Puck.DIAMETER;
        gc.setColor(Color.RED);
        gc.fillOval(x, y, size, size);

//        // Draw the paddles
//        g.setColor(Color.BLUE);
//        g.fillRect(5, aY - paddleSize/2, 15, paddleSize);
//        g.setColor(Color.BLUE);
//        g.fillRect(getWidth() - 20, bY - paddleSize/2, 15, paddleSize);
    }
}
