import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



                JFrame obj = new JFrame();
                PingPongGame gamePlay = new PingPongGame();
                obj.setBounds(10, 10, 700, 600);
                obj.setTitle("Ping Pong Game");
                obj.setResizable(false);
                obj.setVisible(true);
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                obj.add(gamePlay);
            }
        }

