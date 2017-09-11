package ga.raindrop.Daylight.Characters;


/**
 * Created By RainDropInMCYT // RealJBTYTM on 9/11/2017.
 * All Rights Reserved.
 */

public class Player {

    public void playerSetup(){
        playerHP = 100;
        weapon = "None";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);

        startStory();
    }

}
