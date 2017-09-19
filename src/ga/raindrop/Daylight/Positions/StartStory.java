package ga.raindrop.Daylight.Positions;

import ga.raindrop.Daylight.Handlers.ChoiceHandler;
import ga.raindrop.Daylight.Window.Setup;

/**
 * Created by RainDropInMC // RealJBTYTM on 9/14/2017.
 */

public class StartStory {

    public void startStory() {
        ChoiceHandler.position = "startStory";
        Setup.mainTextArea.setText("Hello.");
    }

}
