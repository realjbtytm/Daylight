package ga.raindrop.Daylight.Positions;

import ga.raindrop.Daylight.Handlers.ChoiceHandler;
import ga.raindrop.Daylight.Window.Setup;

/**
 * Created by RainDropInMC // RealJBTYTM on 9/14/2017.
 */

public class StartStory {

    public static void startStory() {
        ChoiceHandler.position = "startStory";
        Setup.mainTextArea.setText("You are in a dark room. A book sits right beside you.");

        Setup.choice1.setText("Read the book.");
        Setup.choice2.setText("");
        Setup.choice3.setText("");
        Setup.choice4.setText("");

    }

}
