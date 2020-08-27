package fe.textgame.frame;

import javax.swing.*;
import fe.textgame.game;

public class Window {

    public Window(int WIDTH, int HEIGHT, String Title, game window){
        //Initial Variables
        JFrame frame = new JFrame(Title);
        JPanel Textpanel = new JPanel();
        JPanel Inputpanel = new JPanel();
        JTextArea textArea = new JTextArea();
        JTextField textField = new JTextField();

        //Preparing the Window
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        //Setting up the textArea
        textArea.setEditable(false);

        //Adding the content to the panels
        Textpanel.add(textArea);
        Inputpanel.add(textField);

        //Adding the Layout
        frame.add(Textpanel);
        frame.add(textArea);

        //frame.add(window); Kann WICHTIG sein

        window.start();

    }
}