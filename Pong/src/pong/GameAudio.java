/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pong;

import java.io.File;
import static java.io.File.separator;
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

    public void playSound(File file, Float volume) {
        try {
            stream = AudioSystem.getAudioInputStream(file);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            //clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl.Type controlType;
            if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                controlType = FloatControl.Type.MASTER_GAIN;
            } else {
                controlType = FloatControl.Type.VOLUME;
            }
            FloatControl audioVolume = (FloatControl) clip.getControl(controlType);
            //audioVolume.setValue((audioVolume.getMaximum() - audioVolume.getMinimum()) / 100 * volume);
            audioVolume.setValue(volume);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playMusic(File file, Float volume) {
        try {
            stream = AudioSystem.getAudioInputStream(file);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            FloatControl.Type controlType;
            if (clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                controlType = FloatControl.Type.MASTER_GAIN;
            } else {
                controlType = FloatControl.Type.VOLUME;
            }
            FloatControl audioVolume = (FloatControl) clip.getControl(controlType);
            //audioVolume.setValue((audioVolume.getMaximum() - audioVolume.getMinimum()) / 100 * volume);
            audioVolume.setValue(volume);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public File getFile(String filename) {
        return new File("sounds" + separator + filename);
    }

    public void soundGameOver() {
        playSound(getFile("go.wav"), -0.0f);
    }

    public void soundBall() {
        playSound(getFile("ball.wav"), -0.0f);
    }

    public void mainTheme() {
        playMusic(getFile("music3.wav"), -20.0f);
    }
}
