/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

/**
 *
 * @author chSch aliv grdo
 */
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Application {

    /**
     * Attributes
     */
    /**
     * name of programs configuration files base folder<br />
     * So if you want to write somefiles onto the disk, please do it all in a
     * central place like this.
     */
    protected static final String BASEFOLDER = System.getProperty("user.home") + "/.swp1ws1819/group_xyz";

    /**
     * Root JFrame into which we put our JComponents we want to show.
     */
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
                new Application();
                (new GameAudio()).mainTheme();

            }
        });

    }

    public Application() {
        MainMenu.showMainMenu();
    }

}
