package fe.textgame;

import javax.swing.*;
import java.awt.Container;
import java.awt.Color;

public class game
{
    //Variables
    int WIDTH = 800;
    int HEIGHT = 600;
    String TITLE = "Text Adventure v0.1";

    JFrame frame;
    Container container;
    JPanel TitleTextPanel;

    public game()
    {
        frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        TitleTextPanel = new JPanel();
        TitleTextPanel.setBounds(100, 100, 600, 150);
        TitleTextPanel.setBackground(Color.WHITE);

        container = frame.getContentPane();
        container.add(TitleTextPanel);
    }

    public static void main(String[] args)
    {
        //Starting the Game
        new game();
    }
}
