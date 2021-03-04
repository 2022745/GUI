/*
Nombre: Serafin Rodriguez
Matricula: 2022745
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Cesba");
        
        frame.setResizable(true);
        // Formato normal:
        //frame.getContentPane().setBackground(Color.GREEN);
        // Formato RGB:
        frame.getContentPane().setBackground(new Color(28, 26,198));
        // Formato Exadecimal:
       //frame.getContentPane().setBackground(Color ());
        
    }
    
}
