package ga.raindrop.Daylight.Window;

import javax.swing.*;
import java.awt.*;

/**
 * Created by RainDropInMC // RealJBTYTM on 9/9/2017.
 */

public class Setup {
    public JFrame window;
    public Container con;
    public JPanel titleNamePanel, startButtonPanel, authorNamePanel, mainTextPanel, choiceButtonPanel, playerPanel;
    public JLabel titleNameLabel, authorNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    public Font titleFont = new Font("Times New Roman", Font.PLAIN, 75);
    public Font normalFont = new Font ("Times New Roman", Font.PLAIN, 28);
    public Font authorFont = new Font ("Times New Roman", Font.PLAIN, 55);
    public JButton startButton;
    public static JButton choice1;
    public static JButton choice2;
    public static JButton choice3;
    public static JButton choice4;
    public static JTextArea mainTextArea;
    int playerHP, CristopherHP;
    public String weapon;
    public static String position;

    public static void main(String[] args) {new Setup();}

    // Boilerplate Initial Screen
    public Setup() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setTitle("Daylight - RainDrop Studios");

        con = window.getContentPane();

        // Sets up contents for Start Screen

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Daylight");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        authorNamePanel = new JPanel();
        authorNamePanel.setBounds(200, 200, 350, 100);
        authorNamePanel.setBackground(Color.black);
        authorNameLabel = new JLabel("RainDrop Studios");
        authorNameLabel.setForeground(Color.white);
        authorNameLabel.setFont(authorFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("BEGIN");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        authorNamePanel.add(authorNameLabel);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
        con.add(authorNamePanel);
    }
    // Creates Game Screen visually.
    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        authorNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("The Main Text Area.");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4, 1));

    }


}
