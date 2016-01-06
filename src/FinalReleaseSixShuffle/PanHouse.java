/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReleaseSixShuffle;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author karnh7634
 */
public class PanHouse extends JPanel {
    BtnDraw btnDraw = new BtnDraw(" ");
    Deck deck = new Deck();
    JLabel lblCards1 = new JLabel();
    JLabel lblCards2 = new JLabel();
    ArrayList<Integer> alnHand2 = new ArrayList<>();
    ArrayList<Integer> alnPile = new ArrayList<>();
    ArrayList<Integer> alnCards = new ArrayList<>();
    ArrayList<Integer> alnShuffle = new ArrayList<>();
    ImageIcon icon;
    int nRand;
    int nCount = 26, nCard1, nCard2;
    Card card;

    public PanHouse(Deck deck_) {
        deck = deck_;
        setLayout(new GridLayout(1,2));
        icon = new ImageIcon("card_back.png");//Load in the image of the back of a playing card
        icon.getImage();
        lblCards1.setIcon(icon); //Set the initial images to be of the back of a playing card
        lblCards2.setIcon(icon); //Set the initial images to be of the back of a playing card
        add(lblCards1, GridLayout.class);
        add(lblCards2, GridLayout.class);
        PanHouse.evtDraw eD = new PanHouse.evtDraw();
        btnDraw.addActionListener(eD);
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            nCard2 = alnHand2.get(0);
            alnHand2.remove(0);
            card = deck.getCard(nCard2);
            icon = new ImageIcon(card.getImg());
            lblCards2.setIcon(icon);
            
        }
    }
    
    
    public void Deal() {

        for (int i = 0; i < 26; i++) {
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