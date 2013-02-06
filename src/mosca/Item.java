/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mosca;

public class Item {
    
    private String itemName;
    private String itemDescript;
    private boolean special;
    
    public Item(String name, String description, boolean isSpecial){
        itemName = name;
        itemDescript = description;
        special = isSpecial;
    }
    
    public String getName(){
        return itemName;
    }
    
    public String getDescript(){
        return itemDescript;
    }
    
    public boolean getSpecial(){
        return special;
    }
    
}
