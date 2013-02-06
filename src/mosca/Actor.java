/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mosca;


public class Actor {
    private String actorName;
    private String actorDescript;
    private String actorLocation;
    private boolean isImportant;
    private boolean objComplete;
    
    public Actor(String name, String description, String location, boolean important){
        actorName = name;
        actorDescript = description;
        isImportant = important;
        actorLocation = location;
        objComplete = false;
    }
    
    public String getName(){
        return actorName;
    
    }
    
    public String getDescript(){
        return actorDescript;
        
    }
    
    public boolean getImportance(){
        return isImportant;
    }
    
    public boolean isComplete(){
        return objComplete;
    }
    
    public void changeStatus(){
        objComplete = true;
    }
}
