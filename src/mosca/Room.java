/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mosca;

/**
 *
 * @author Mochoa
 */
interface Room {
    
    String getEntryText();
    
    void setEntryText();
    
    String getRoomName();
    
    void setRoomName();
    
    boolean getCompleted();
    
    void setCompleted();
    
    Item[] getItems();
   
    Actor[] getCharacters();
   
    int getRoomType();
}
