/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InGame;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import pong.MainMenu;

public class Paddle {

    public static final int SPEED_PADDLE = 2;
    public static int paddleHeight = 10, paddleWidth = 100;
    public static int bottomPaddleX, topPaddleX;
    public static int inset = 0;

    public static Rectangle2D getBottomPaddle() {
        Rectangle2D bottomPaddle = new Rectangle(bottomPaddleX, MainMenu.pong.height - paddleHeight - inset, paddleWidth, paddleHeight);
        return bottomPaddle;
    }

    public static Rectangle2D getTopPaddle() {
        Rectangle2D topPaddle = new Rectangle(topPaddleX, inset, paddleWidth, paddleHeight);
        return topPaddle;
    }

    public static void movePlayerA() {
        if (MainMenu.pong != null && MainMenu.pong.keysA.size() == 1) {
            if (MainMenu.pong.keysA.contains("LEFT")) {
                bottomPaddleX -= (bottomPaddleX > 0) ? SPEED_PADDLE : 0;
            } else if (MainMenu.pong.keysA.contains("RIGHT")) {
                bottomPaddleX += (bottomPaddleX < MainMenu.pong.width - paddleWidth) ? SPEED_PADDLE : 0;
            }
        }
    }

    public static void movePlayerB() {
        if (MainMenu.pong != null && MainMenu.pong.keysB.size() == 1) {
            if (MainMenu.pong.keysB.contains("VK_A")) {
                topPaddleX -= (topPaddleX > 0) ? SPEED_PADDLE : 0;
            } else if (MainMenu.pong.keysB.contains("VK_D")) {
                topPaddleX += (topPaddleX < MainMenu.pong.width - paddleWidth) ? SPEED_PADDLE : 0;
            }
        }
    }
}
