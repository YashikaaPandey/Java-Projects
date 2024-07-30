import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PingPongGame extends JPanel implements KeyListener, ActionListener {

    private boolean play = false;
    private int score = 0;

    private int totalBricks = 21;
    private Timer timer;
    private int delay = 8;

    private int playerX = 310;
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -1;

    public PingPongGame() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        // borders
        g.setColor(Color.green);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(0, 0, 3, 592);

        // paddle
        g.setColor(Color.yellow);
        g.fillRect(playerX, 550, 100, 8);

        // The ball
        g.setColor(Color.green);
        g.fillOval(ballposX, ballposY, 20, 20);

        // score
        g.setColor(Color.white);
        g.drawString("Score: " + score, 10, 20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballposX += ballXdir;
        ballposY += ballYdir;

        // Collision detection with walls
        if (ballposX < 0 || ballposX > 680) {
            ballXdir = -ballXdir;
        }
        if (ballposY < 0) {
            ballYdir = -ballYdir;
        }

        // Collision detection with paddle
        if (ballposY > 540 && ballposX > playerX && ballposX < playerX + 100) {
            ballYdir = -ballYdir;
            score++;
        }

        // Game over
        if (ballposY > 592) {
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            score = 0;
        }

        // Update the screen
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (playerX >= 600) {
                playerX = 600;
            } else {
                moveRight();
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (playerX < 10) {
                playerX = 10;
            } else {
                moveLeft();
            }
        }
    }

    public void moveRight() {
        play = true;
        playerX += 20;
    }

    public void moveLeft() {
        play = true;
        playerX -= 20;
    }
}
