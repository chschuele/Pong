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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

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
                musicPlayer();

            }
        });

    }

    public Application() {
        MainMenu.showMainMenu();
    }

    public static void musicPlayer() {

        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;

        try {
            InputStream test = new FileInputStream("sounds\\music3.wav");
            BGM = new AudioStream(test);
            MD = BGM.getData();
            loop = new ContinuousAudioDataStream(MD);

            AudioPlayer.player.start(loop);

        } catch (FileNotFoundException e) {
            System.out.print(e.toString());
        } catch (IOException error) {
            System.out.print(error.toString());
        }
    }

}
