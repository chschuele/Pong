/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author chSch
 */
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * collects player data if score should be listed on the highscores list
 */
public class AfterGame extends JPanel {

    /**
     * Attributes
     */

    /**
     * for inputing players name
     */
    private JTextField player;

    /**
     * showing the reached score
     */
    private JTextField score;

    /**
     * adding the score with the entered Player name to the list and show it
     */
    private JButton next;

    /**
     * don't add the score to the list, just show it
     */
    private JButton skip;

    /**
     * Operation AfterGame
     *
     * @param score - reached score during game
     * @return
     */
    public AfterGame(String score) {
    }

    /**
     * Operation initComponents
     *
     */
    private void initComponents() {
    }
}
