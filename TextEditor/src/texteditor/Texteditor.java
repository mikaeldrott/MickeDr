/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;

import javax.swing.JFrame;

/**
 *
 * @author Mikael
 */
public class Texteditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextEditorFrame frame = new TextEditorFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       /* frame.setLocationRealtiveTo(null);*/
        frame.setVisible(true);
    }
    
}
