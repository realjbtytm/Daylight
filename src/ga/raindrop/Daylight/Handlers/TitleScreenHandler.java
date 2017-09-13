package ga.raindrop.Daylight.Handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static ga.raindrop.Daylight.Window.Setup.createGameScreen;

/**
 * Created by RainDropInMC // RealJBTYTM on 9/13/2017.
 */

public class TitleScreenHandler implements ActionListener{

    public void actionPerformed(ActionEvent event) {
        createGameScreen();
        }
}
