package FinalReleaseSixShuffle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class PanMain extends JPanel {
    Deck deck = new Deck();
    JLabel lblCards1 = new JLabel();
    JLabel lblCards2 = new JLabel();
    ArrayList<Integer> alnHand1 = new ArrayList<>();//ArrayList of all of Player 1's shuffled cards
    ArrayList<Integer> alnHand2 = new ArrayList<>();//ArrayList of all of Player 2's shuffled cards
    ArrayList<Integer> alnPile = new ArrayList<>();//ArrayList of the pile of cards in the middle.
    ArrayList<Integer> alnCards = new ArrayList<>();//ArrayList of all 52 integers of cards, shuffled
    ArrayList<Integer> alnShuffle = new ArrayList<>();//ArrayList of all 52 integers of cards, shuffle
    ImageIcon icon;
    int nRand;
    int nCount = 26, nCard1, nCard2;
    Card card;

    public PanMain() {
        
    }

    public void Deal() {

        for (int i = 0; i < 26; i++) {
            alnHand1.add(alnShuffle.get(0));
            alnShuffle.remove(0);
            alnHand2.add(alnShuffle.get(0));
            alnShuffle.remove(0);
        }
        System.out.println(alnShuffle);
    }

    public void ShuffleCards() {
        for (int i = 0; i < 52; i++) {
            alnCards.add(i);
        }
        System.out.println(alnCards);
        System.out.println(alnCards.size());
        for (int i = 0; i < 52; i++) {
            nRand = (int) (Math.random() * (alnCards.size() - 1));
            alnShuffle.add(alnCards.get(nRand));
            alnCards.remove(nRand);
            System.out.println("i is " + i + " and nRand is " + nRand + " size is " + alnCards.size());
        }
        System.out.println(alnShuffle);
    }
}
