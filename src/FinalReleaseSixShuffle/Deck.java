package FinalReleaseSixShuffle;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Deck {

    //BufferedImage[] abiCards = SplitSprites(); //Array of BufferedImages
    Card[] arCards = new Card[52];
    BufferedImage biDeck = null, biCard = null;
    int nWidth, nHeight, nRows, nColumns, n;
    
    Deck(){
        try {
            biDeck = ImageIO.read(new File("PlayingCardsSpreadsheet.png")); //Read in the entire SpreadSheet
        } catch (IOException e) {
        }
        nRows = 4; //Number of rows in the SpreadSheet
        nColumns = 13; //Number of columns in the Spreadsheet
        nHeight = biDeck.getHeight()/nRows;  // Height of each card
        nWidth = biDeck.getWidth()/nColumns;     //Width of each card
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColumns; j++) {
                biCard = biDeck.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);               
                arCards[n] = new Card(n, biCard);
                n++;
            }
        }       
    }
    
    
    Card getCard(int _n){
        n = _n;
        return arCards[n];
    }   
        
    
}
