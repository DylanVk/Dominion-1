/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaGUI;

import javax.swing.JFrame;
/**
 *
 * @author Matthias Carlier
 */
public class JavaGUI {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	JFrame f = new JFrame();
        f.add(new Start());
        f.pack();
        f.setVisible(true);
        
    }
    
}
