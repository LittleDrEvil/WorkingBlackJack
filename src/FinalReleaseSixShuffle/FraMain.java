package FinalReleaseSixShuffle;

import javax.swing.*;
import java.awt.*;

public class FraMain extends JFrame {

    FraMain() {
        Deck deck = new Deck();
        BtnDraw btnDraw = new BtnDraw(" ");
        this.setLayout(new BorderLayout());
        PanPlayer panPlay = new PanPlayer(deck, btnDraw);
        PanHouse panHouse = new PanHouse(deck);
        PanButton panButton = new PanButton();
        
        
        setTitle("BlackyJacky"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((400), (400)); 
        this.setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
        
        
        add(panHouse, BorderLayout.CENTER);
        add(panPlay, BorderLayout.NORTH); 
        add(panButton, BorderLayout.EAST);
        
    }
    
    
    
    public void Deal() {

        for (int i = 0; i < 52; i++) {
            alnHand1.add(alnShuffle.get(0));
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
