package ga.raindrop.Daylight.Handlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by RainDropInMC // RealJBTYTM on 9/13/2017.
 */

public class ChoiceHandler implements ActionListener {

    public void actionPerformed(ActionEvent event) {

        String yourChoice = event.getActionCommand();

        switch (position) {
            case "startStory":
                switch (yourChoice) {
                    case "c1":
                        Test();
                        break;
                    case "c2":
                        break;
                    case "c3":
                        break;
                    case "c4":
                        break;
                }
        }
    }

}
