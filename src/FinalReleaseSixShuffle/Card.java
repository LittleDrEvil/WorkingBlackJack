/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReleaseSixShuffle;

import java.awt.image.BufferedImage;

// Card function sets it to where a card will have a number of what card it
// is in the deck, an image, and a value
public class Card {

    int n, nVal, nSuit;
    BufferedImage biCard;

    Card(int _n, BufferedImage _biCard) {
        n = _n;
        biCard = _biCard;
        nVal = n % 13;
    }
    
    // accessor functions.
    BufferedImage getImg(){
        return biCard;
    }

}
