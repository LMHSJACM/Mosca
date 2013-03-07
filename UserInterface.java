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
import java.awt.event.*;
import javax.swing.*;

public class UserInterface extends JPanel implements ActionListener, KeyListener{
    
    private Dimension size = this.getSize();
    private double w = size.getWidth();
    private double h = size.getHeight();
    private Button start = new Button("START");
    private JLabel east, west, north, south, title;
    private JTextField input = new JTextField();
    private JMenuBar menu = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu help = new JMenu("Help");
    
    
    public UserInterface()
    {            
        
        this.setBackground(Color.BLACK);
        this.setLayout(new BorderLayout());
        
        start.addActionListener(this);
        this.add(start, BorderLayout.SOUTH);
        
        title = new JLabel("WELCOME TO MOSCA! PRESS START TO BEGIN!", SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        this.add(title, BorderLayout.NORTH);
        
        JMenuItem create = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        create.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        file.add(create);
        file.add(open);
        file.add(save);
        
        JMenuItem commands = new JMenuItem("Commands");
        commands.addActionListener(this);
        help.add(commands);
        
        menu.add(file);
        menu.add(help);
 
        
        east = new JLabel("EAST", SwingConstants.CENTER);
        east.setForeground(Color.WHITE);
        west = new JLabel("WEST", SwingConstants.CENTER);
        west.setForeground(Color.WHITE);
        north = new JLabel("NORTH", SwingConstants.CENTER);
        north.setForeground(Color.WHITE);
        south = new JLabel("SOUTH", SwingConstants.CENTER);  
        south.setForeground(Color.WHITE);
        
        input.addKeyListener(this);
        input.setOpaque(false);
        input.setForeground(Color.WHITE);
        input.setCaretColor(Color.WHITE);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == start)
        {
           this.remove(start); 
           this.remove(title);
           this.validate();
           
           this.add(input);
           this.add(menu);
           this.validate();
           
        }
    }
    
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            input.setText(input.getText() + "\n" + this.eventChecker());
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyTyped(KeyEvent e)
    {

    }
    
    public String eventChecker()
    {
        String event = "";
        return event;
    }
    
}
