package InGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;
import pong.MainMenu;

public class Pong extends JPanel implements KeyListener, ActionListener {

    public int height, width;
    public int score = 0;
    public boolean initialize;
    private Timer t;
    boolean gameOver = false;

    public HashSet<String> keysA = new HashSet<String>();
    public HashSet<String> keysB = new HashSet<String>();

    public Pong() {
        addKeyListener(this);
        initialize = true;
        t = new Timer(1, this);
        t.setInitialDelay(50);
        t.start();
        gameOver = false;
        Puck.velocityX = getRandomAngle();
        Puck.velocityY = getRandomAngle();
    }
    
    public double getRandomAngle() {
        Random random = new Random();
        System.out.println((random.nextBoolean() ? 1 : -1));
        return (0.2 + 0.1 * random.nextDouble()) * (random.nextBoolean() ? 1 : -1);
    }

    public int getScore() {
        return score > 0 ? score - 1 : 0;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.decode("#28292A"));
        Graphics2D g2d = (Graphics2D) g;
        height = getHeight();
        width = getWidth();
        Paddle.paddleWidth = (int) width / 4;

        if (initialize) {
            Paddle.bottomPaddleX = width / 2 - Paddle.paddleWidth / 2;
            Paddle.topPaddleX = Paddle.bottomPaddleX;
            Puck.puckX = width / 2 - Puck.PUCK_DIAMETER / 2;
            Puck.puckY = height / 2 - Puck.PUCK_DIAMETER / 2;
            initialize = false;
        }
        g2d.setColor(Color.decode("#F5BB00"));
        g2d.fill(Paddle.getBottomPaddle());
        g2d.setColor(Color.decode("#39647E"));
        g2d.fill(Paddle.getTopPaddle());
        g2d.setColor(Color.decode("#CCCCCC"));
        g2d.fill(Puck.getBall());

        String endScore = "Score: " + Integer.toString(score);
        g2d.setFont(g2d.getFont().deriveFont(Font.BOLD, 14f));
        g2d.drawString(endScore, 50, height / 2);
    }

    public void updateGame() {
        Collision.collisionSideWalls();
        //check collision Top and Bottom Walls
        if (initialize == false && (Puck.puckY < 0 || Puck.puckY + Puck.PUCK_DIAMETER > height)) {
            Puck.velocityY = -Puck.velocityY;
            MainMenu.showAfterGame();
            MainMenu.afterGame.init();
            gameOver = true;
        } else {
            Collision.collisionBottomPaddle();
            Collision.collisionTopPaddle();

        }

        Puck.puckX += Puck.velocityX;
        Puck.puckY += Puck.velocityY;

        Paddle.movePlayerA();
        Paddle.movePlayerB();

        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            updateGame();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
                keysA.add("LEFT");
                break;
            case KeyEvent.VK_RIGHT:
                keysA.add("RIGHT");
                break;
            case KeyEvent.VK_A:
                keysB.add("VK_A");
                break;
            case KeyEvent.VK_D:
                keysB.add("VK_D");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT:
                keysA.remove("LEFT");
                break;
            case KeyEvent.VK_RIGHT:
                keysA.remove("RIGHT");
                break;
            case KeyEvent.VK_A:
                keysB.remove("VK_A");
                break;
            case KeyEvent.VK_D:
                keysB.remove("VK_D");
                break;
        }
    }

}
