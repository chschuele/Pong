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
import pong.MainMenu;
import java.awt.Dimension;
import java.util.HashSet;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import pong.Application;

/**
 * The complete ingame logic is handled from here.
 */
public class InGame extends JPanel {

    //timer to redraw the picture
    private Timer refresher;
    // Associations: 
    //puck on the field
    private Puck puck;
    //Playfield borders
    private HashSet<PongLine> borders;
    private Player player;
    //panel the content is shown on
    private PlayFieldPanel playground;

    /**
     * Operation InGame
     *
     * @param playFieldSize - the slze we have to create our PlayFieldPanel
     * with.
     *
     */
    public InGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stats = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();

        //JPanel for the ingame sidebar holding informations like the current
        //score, if the game is paused, etc.

        jLabel1.setText("Score");

        txtScore.setText("");

        javax.swing.GroupLayout statsLayout = new javax.swing.GroupLayout(stats);
        stats.setLayout(statsLayout);
        statsLayout.setHorizontalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );
        statsLayout.setVerticalGroup(
            statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Operation to init the PlayFieldPanel
     *
     * @param playFieldSize - the slze we have to create our PlayFieldPanel
     * with.
     */
    public void initPlayFieldPanel(Dimension playFieldSize) {
    }

    //Operation to init statsPanel
    private void initStatsPanel() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    //Operation to set the borders according the choosen playfieldsize
    private void setLines(Dimension playFieldSize) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    //Operation to setup Puck
    private void setPuck() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation to movePlayer.
     * get's called from the Timer that moves the
     * player
     *
     * @param moveMent - value the puck should be moved
     */
    private void movePlayer(int moveMent) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    //check for collissions between the puck and each border
    private void checkForCollission() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * Operation calcDistance between a line and the puck
     *
     * @param line - border for which we want to check the puck distance
     * @return double calculated distance between puck and line
     */
    private double calcDistance(PongLine line) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    /**
     * mirrors the puck on the given line.
     *
     * @param line - border the puck should be mirrored on
     */
    private void changeDirection(PongLine line) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    //- stop all timers<br />
    // - collect data like score to give to the next Panel<br />
    private void exitIngame() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel stats;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
