package fe.textgame;

import javax.swing.*;
import java.awt.*;

public class game
{
    //Variables
    int WIDTH = 800;
    int HEIGHT = 600;
    String TITLE = "Text Adventure v0.1";

    //Declaring awt and swing stuff
    JFrame frame;
    Container container;
    JPanel TitleTextPanel;
    JLabel TitleName;
    Font TitleFont = new Font("Roboto", Font.PLAIN, 28);

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

        TitleName = new JLabel("ADVENTURE");
        TitleName.setForeground(Color.BLACK);
        TitleName.setFont(TitleFont);

        container = frame.getContentPane();
        container.add(TitleTextPanel);
    }

    public static void main(String[] args)
    {
        //Starting the Game
        new game();
    }
}
