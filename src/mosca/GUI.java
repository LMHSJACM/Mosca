/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mosca;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Mochoa
 */
public class GUI {
    private int width,height;
    
    private String title;
    
    private JLabel roomName, playerAction;
    
    public GUI(int w, int h, String t){
        width = w;
        height = h;
        title = t;
        
        JFrame gui = new JFrame(title);
        gui.setSize(width, height);
        
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container holder = gui.getContentPane();
        
        JPanel top = new JPanel();
        
        top.setBackground(Color.GRAY);
        
        top.setLayout(new FlowLayout());
        
        roomName = new JLabel("Current Room : ", SwingConstants.CENTER);
        
        top.add(roomName, BorderLayout.NORTH);
        
        top.add(new JLabel("Text EAST", SwingConstants.CENTER), BorderLayout.EAST);
        top.add(new JLabel("Text WEST", SwingConstants.CENTER), BorderLayout.WEST);
        top.add(new JLabel("Text SOUTH", SwingConstants.CENTER), BorderLayout.SOUTH);
        
        holder.add(new JLabel("Text Middle", SwingConstants.CENTER), BorderLayout.CENTER);
        
        holder.add(top, BorderLayout.CENTER);
        
        JTextPane inputArea = new JTextPane();
        
        inputArea.setBackground(Color.LIGHT_GRAY);
        
        holder.add(inputArea, BorderLayout.SOUTH);
        
        gui.setVisible(true);
        
        
    }
}
