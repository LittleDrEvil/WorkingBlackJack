/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalReleaseSixShuffle;

/**
 *
 * @author karnh7634
 */
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class PanPlayer extends JPanel {
     BtnDraw btnDraw = new BtnDraw(" ");
     Deck deck = new Deck();
     JLabel lblCards1 = new JLabel();
     ArrayList<Integer> alnPile = new ArrayList<>();//ArrayList of the pile of cards in the middle.
     ArrayList<Integer> alnCards = new ArrayList<>();//ArrayList of all 52 integers of cards, shuffled
     ArrayList<Integer> alnShuffle = new ArrayList<>();//ArrayList of all 52 integers of cards, shuffle
     ImageIcon icon;
     int nRand;
     int nCount = 52, nCard1, nCard2;
     Card card;

    public PanPlayer(Deck deck_, BtnDraw btnDraw_) {
        
        deck = deck_;
        btnDraw = btnDraw_;
        setLayout(new BorderLayout());
        icon = new ImageIcon("card_back.png");
        icon.getImage();
        lblCards1.setIcon(icon);
        add(lblCards1, BorderLayout.CENTER);
        PanPlayer.evtDraw eD = new PanPlayer.evtDraw();
        btnDraw.addActionListener(eD);
        
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(alnCards);
            nCard1 = alnCards.get(0);
            alnCards.remove(0);
            card = deck.getCard(nCard1);
            icon = new ImageIcon(card.getImg());
            lblCards1.setIcon(icon);
        }
    }
    
    public void Deal() {

        for (int i = 0; i < 52; i++) {
            alnCards.add(alnShuffle.get(0));
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
            //System.out.println("i is " + i + " and nRand is " + nRand + " size is " + alnCards.size());
        }
        
        System.out.println(alnShuffle);
        
    }

    

}