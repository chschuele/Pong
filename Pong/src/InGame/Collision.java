/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import static InGame.Pong.width;
import static InGame.Puck.PUCK_DIAMETER;
import static InGame.Puck.lastDirectionChange;
import static InGame.Puck.puckX;
import static InGame.Puck.puckY;
import static InGame.Puck.velocityY;
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
 * @author chSch
 */
public class Collision {

    public static void collisionTopPaddle() {
        if (puckY <= Paddle.paddleHeight + Paddle.inset && velocityY < 0) {

            if (puckX + PUCK_DIAMETER >= Paddle.topPaddleX && puckX <= Paddle.topPaddleX + Paddle.paddleWidth) {
                soundBall();
                velocityY = -velocityY;
            }
            if (lastDirectionChange != 2) {

                lastDirectionChange = 2;
                Pong.score++;
            }
        }

    }

    public static void collisionBottomPaddle() {
        if (puckY + PUCK_DIAMETER >= Pong.height - Paddle.paddleHeight - Paddle.inset && velocityY > 0) {

            if (puckX + PUCK_DIAMETER >= Paddle.bottomPaddleX && puckX <= Paddle.bottomPaddleX + Paddle.paddleWidth) {
                soundBall();
                velocityY = -velocityY;
            }
            if (Pong.initialize == false && lastDirectionChange != 1) {

                lastDirectionChange = 1;
                Pong.score++;

            }
        }

    }

    public static void collisionSideWalls() {
        if (Puck.puckX < 0 || Puck.puckX > width - Puck.PUCK_DIAMETER) {
            Puck.velocityX = -Puck.velocityX;
        }
    }

    public static void soundBall() {
        AudioPlayer MGP = AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop = null;

        try {
            InputStream test = new FileInputStream("sounds\\ball.wav");
            BGM = new AudioStream(test);
            AudioPlayer.player.start(BGM);
        } catch (FileNotFoundException e) {
            System.out.print(e.toString());
        } catch (IOException error) {
            System.out.print(error.toString());
        }
        MGP.start(loop);
    }

}
