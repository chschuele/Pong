/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import static InGame.Puck.PUCK_DIAMETER;
import static InGame.Puck.lastDirectionChange;
import static InGame.Puck.puckX;
import static InGame.Puck.puckY;
import static InGame.Puck.velocityX;
import static InGame.Puck.velocityY;
import pong.GameAudio;
import pong.MainMenu;

/**
 *
 * @author chSch
 */
public class Collision {

    private static final GameAudio gameAudio = new GameAudio();

    public static void paddleHit() {
        MainMenu.pong.score++;
        velocityY *= 1.05;
        velocityX *= 1.05;
    }

    public static void collisionTopPaddle() {
        if (puckY <= Paddle.paddleHeight + Paddle.inset && velocityY < 0) {

            if (puckX + PUCK_DIAMETER >= Paddle.topPaddleX && puckX <= Paddle.topPaddleX + Paddle.paddleWidth) {
                (new GameAudio()).soundBall();
                velocityY = -velocityY;
            }
            if (lastDirectionChange != 2) {
                lastDirectionChange = 2;
                paddleHit();
            }
        }

    }

    public static void collisionBottomPaddle() {
        if (puckY + PUCK_DIAMETER >= MainMenu.pong.height - Paddle.paddleHeight - Paddle.inset && velocityY > 0) {

            if (puckX + PUCK_DIAMETER >= Paddle.bottomPaddleX && puckX <= Paddle.bottomPaddleX + Paddle.paddleWidth) {
                gameAudio.soundBall();
                velocityY = -velocityY;
            }
            if (MainMenu.pong.initialize == false && lastDirectionChange != 1) {

                lastDirectionChange = 1;
                paddleHit();

            }
        }

    }

    public static void collisionSideWalls() {
        if (Puck.puckX < 0 || Puck.puckX > MainMenu.pong.width - Puck.PUCK_DIAMETER) {
            Puck.velocityX = -Puck.velocityX;
            gameAudio.soundBall();
        }
    }

}
