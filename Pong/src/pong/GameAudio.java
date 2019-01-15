/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import static java.io.File.separator;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/**
 *
 * @author ivan
 */
public class GameAudio {

    AudioInputStream stream;
    AudioFormat format;
    DataLine.Info info;
    Clip clip;

    public void playSound(String file, float volume, boolean loop) {
        try {
            InputStream is = getClass().getResourceAsStream(file);
            stream = AudioSystem.getAudioInputStream(getClass().getResource(file));
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            FloatControl.Type controlType;
            if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                controlType = FloatControl.Type.MASTER_GAIN;
            } else {
                controlType = FloatControl.Type.VOLUME;
            }
            FloatControl audioVolume = (FloatControl) clip.getControl(controlType);
            audioVolume.setValue(
                    (audioVolume.getMaximum() + Math.abs(audioVolume.getMinimum()))
                            / 100 * volume + audioVolume.getMinimum()
            );
            clip.start();
            if(loop){
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getFile(String filename) {
        return separator + "res" + separator + filename;
    }

    public void soundGameOver() {
        playSound(getFile("go.wav"), 100f, false);
    }

    public void soundBall() {
        playSound(getFile("ball.wav"), 100f,false);
    }

    public void mainTheme() {
        playSound(getFile("theme.wav"), 70f,true);
    }
}
