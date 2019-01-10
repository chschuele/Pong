/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterGame;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ivan
 */
public class Debug {
        public static final JFrame ROOTFRAME = new JFrame();
    /**
     * Operation main
     *
     * @param args - CLI arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Debug();
            }
        });

    }

    public Debug() {
        ROOTFRAME.setTitle("Pong");
        ROOTFRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ROOTFRAME.setSize(500, 300);
        //Fenster in der Mitte des Bildschirms
        ROOTFRAME.setLocationRelativeTo(null);
        ROOTFRAME.add(new Highscores());
        ROOTFRAME.setVisible(true);

    }
}
