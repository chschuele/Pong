/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import static java.io.File.separator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author ivan
 */
public class GameAudio {

    private AudioPlayer MGP = AudioPlayer.player;
    private AudioStream BGM;
    private AudioData MD;
    private ContinuousAudioDataStream loop = null;
    
    public void playSound(String path) {
        try {
            InputStream test = new FileInputStream("sounds" + separator + path);
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
        } catch (FileNotFoundException e) {
            System.out.print(e.toString());
        } catch (IOException error) {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }

    public void soundGameOver() {
        playSound("go.wav");
    }

    public void soundBall() {
        playSound("ball.wav");
    }
    
    public void mainTheme() {
        playSound("music3.wav");
    }
}
