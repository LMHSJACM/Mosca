/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mosca.runner;

/**
 *
 * @author JACM
 */

import java.awt.*;
import javax.swing.*;

public class Mosca extends JFrame{
    
    
    public Mosca()
    {   
        this.setTitle("MOSCA");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,500);
        this.setLayout(new BorderLayout());
        this.add(new UserInterface());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        
    }

    public static void main(String[] args) {
        
        new Mosca();
        
    }
}

