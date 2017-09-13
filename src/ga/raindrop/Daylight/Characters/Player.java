package ga.raindrop.Daylight.Characters;

import ga.raindrop.Daylight.Window.Setup;

import javax.swing.*;
import java.awt.*;

import static ga.raindrop.Daylight.Window.Setup.*;

/**
 * Created By RainDropInMCYT // RealJBTYTM on 9/11/2017.
 * All Rights Reserved.
 */

public class Player {

    public static void playerSetup(){

        // Sets up Player information on screen
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        Setup.con.add(playerPanel);

        hpLabel = new JLabel("HP: ");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponLabelName = new JLabel();
        weaponLabelName.setFont(normalFont);
        weaponLabelName.setForeground(Color.white);
        playerPanel.add(weaponLabelName);

        playerHP = 100;
        weapon = "None";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
    }

}
