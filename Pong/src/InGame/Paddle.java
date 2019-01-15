/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Paddle {

    public static final int SPEED_PADDLE = 2;
    public static int paddleHeight = 10, paddleWidth = 100;
    public static int bottomPaddleX, topPaddleX;
    public static int inset = 0;

    public static Rectangle2D getBottomPaddle() {
        Rectangle2D bottomPaddle = new Rectangle(bottomPaddleX, Pong.height - paddleHeight - inset, paddleWidth, paddleHeight);
        return bottomPaddle;
    }

    public static Rectangle2D getTopPaddle() {
        Rectangle2D topPaddle = new Rectangle(topPaddleX, inset, paddleWidth, paddleHeight);
        return topPaddle;
    }

    public static void movePlayerA() {
        if (Pong.keysA.size() == 1) {
            if (Pong.keysA.contains("LEFT")) {
                bottomPaddleX -= (bottomPaddleX > 0) ? SPEED_PADDLE : 0;
            } else if (Pong.keysA.contains("RIGHT")) {
                bottomPaddleX += (bottomPaddleX < Pong.width - paddleWidth) ? SPEED_PADDLE : 0;
            }
        }
    }

    public static void movePlayerB() {
        if (Pong.keysB.size() == 1) {
            if (Pong.keysB.contains("VK_A")) {
                topPaddleX -= (topPaddleX > 0) ? SPEED_PADDLE : 0;
            } else if (Pong.keysB.contains("VK_D")) {
                topPaddleX += (topPaddleX < Pong.width - paddleWidth) ? SPEED_PADDLE : 0;
            }
        }
    }
}
