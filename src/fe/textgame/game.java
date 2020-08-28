package fe.textgame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class game {

    //Variables
    int WIDTH = 800;
    int HEIGHT = 600;
    String TITLE = "Text Adventure v0.1";

    //Declaring awt and swing stuff
    JFrame frame;
    Container container;
    JPanel TitleTextPanel, StartButtonPanel, ExitButtonPanel, MainTextPanel, BackButtonPanel;
    JLabel TitleName;
    JButton StartButton, ExitButton, BackButton;
    JTextArea MainTextArea;

    Border NoBorder = BorderFactory.createEmptyBorder(0, 0, 0, 0);

    //Declaring Fonts
    Font TitleFont = new Font("Roboto", Font.PLAIN, 90);
    Font ButtonFont = new Font("Roboto", Font.PLAIN, 26);
    Font NormalFont = new Font("Roboto", Font.PLAIN, 16);

    public game() {

        //Creating the Frame
        frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        //Creating the title text panel
        TitleTextPanel = new JPanel();
        TitleTextPanel.setBounds(100, 100, 600, 150);
        TitleTextPanel.setBackground(Color.BLACK);

        //Creating the title name text
        TitleName = new JLabel("ADVENTURE");
        TitleName.setForeground(Color.WHITE);
        TitleName.setFont(TitleFont);
        TitleTextPanel.add(TitleName);                                   //Adding the title name to the title text panel

        //Creating the starting button panel & the button
        StartButtonPanel = new JPanel();
        StartButtonPanel.setBounds(300, 300, 200, 50);
        StartButtonPanel.setBackground(Color.BLACK);
        StartButton = new JButton("START");
        StartButton.setBackground(Color.BLACK);
        StartButton.setForeground(Color.WHITE);
        StartButton.setFont(ButtonFont);
        StartButton.setFocusPainted(false);
        StartButton.setBorder(NoBorder);
        StartButtonPanel.add(StartButton);

        //Creating the exit button panel & the button
        ExitButtonPanel = new JPanel();
        ExitButtonPanel.setBounds(650, 500, 150, 50);
        ExitButtonPanel.setBackground(Color.BLACK);
        ExitButton = new JButton("EXIT");
        ExitButton.setBackground(Color.BLACK);
        ExitButton.setForeground(Color.WHITE);
        ExitButton.setFont(ButtonFont);
        ExitButton.setFocusPainted(false);
        ExitButton.setBorder(NoBorder);
        ExitButtonPanel.add(ExitButton);

        //Creating the back button panel & the button
        BackButtonPanel = new JPanel();
        BackButtonPanel.setBounds(0, 500, 150, 50);
        BackButtonPanel.setBackground(Color.BLACK);
        BackButton = new JButton("BACK");
        BackButton.setBackground(Color.BLACK);
        BackButton.setForeground(Color.WHITE);
        BackButton.setFont(ButtonFont);
        BackButton.setFocusPainted(false);
        BackButton.setBorder(NoBorder);
        BackButtonPanel.add(BackButton);
        BackButtonPanel.setVisible(false);

        //Getting the Content panel from frame and adding the panels
        container = frame.getContentPane();
        container.add(TitleTextPanel);
        container.add(StartButtonPanel);
        container.add(ExitButtonPanel);
        container.add(BackButtonPanel);

        //For better user interaction a mouseOver effect
        StartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartButton.setBackground(Color.GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartButton.setBackground(Color.BLACK);
            }
        });
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButton.setBackground(Color.GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButton.setBackground(Color.BLACK);
            }
        });

        //The Start Button
        StartButton.addActionListener(e -> createGameScreen());

        //The Back Button
        BackButton.addActionListener(e -> createTitleScreen());

        //The Exit Button
        ExitButton.addActionListener(e -> System.exit(0));
    }

    public void createTitleScreen() {
        //Making the game screen invisible
        MainTextArea.setVisible(false);
        BackButtonPanel.setVisible(false);

        //Making the title screen visible
        TitleTextPanel.setVisible(true);
        StartButtonPanel.setVisible(true);
        ExitButtonPanel.setVisible(true);
    }

    public void createGameScreen() {
        //Making the title screen invisible
        TitleTextPanel.setVisible(false);
        StartButtonPanel.setVisible(false);
        ExitButtonPanel.setVisible(false);

        //Creating a new panel for the main text
        MainTextPanel = new JPanel();
        MainTextPanel.setBounds(100, 100, 600, 250);
        MainTextPanel.setBackground(Color.BLACK);

        //Creating a text area for the main text
        MainTextArea = new JTextArea();
        MainTextArea.setBounds(100, 100, 600, 250);
        MainTextArea.setBackground(Color.BLACK);
        MainTextArea.setForeground(Color.WHITE);
        MainTextArea.setFont(NormalFont);
        MainTextArea.setLineWrap(true);

        //Adding the text area to the panel
        MainTextPanel.add(MainTextArea);

        //Making the game screen visible
        MainTextPanel.setVisible(true);
        BackButtonPanel.setVisible(true);
    }

    public static void main(String[] args) {
        //Starting the Game
        new game();
    }
}