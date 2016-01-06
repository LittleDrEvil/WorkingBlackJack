package FinalReleaseSixShuffle;

import javax.swing.*;

public class LblCardsRemaining extends JLabel {
    //Note: at the time of handing in this project, lblCardsRemaining is not being displayed when the program is run

    JLabel LblRemaining = new JLabel(""); //Initialize label LblRemaining

    public void DisplayPoints(int nPlayer) {
        String sRemain;
        sRemain = Integer.toString(nPlayer);
        LblRemaining.setText(sRemain); //Set the text of the label as how many cards are remaining in a player's deck

        
    }

}
