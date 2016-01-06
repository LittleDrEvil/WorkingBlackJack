/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package FinalReleaseSixShuffle;
import java.awt.BorderLayout;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;

public class PanButton extends JPanel {
    public PanButton() {
        setLayout(new BorderLayout());
        BtnDraw btnDraw = new BtnDraw("Draw");
        add(btnDraw, BorderLayout.SOUTH);
    }
}
