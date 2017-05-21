/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

/**
 *
 * @author Piyush
 */
public class Location {
    private String name;
    private int ID;
    private static int count = 1;
    
    public Location(){
        this.ID = count;
        count += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
  @Override
  public String toString()
  {
    return this.name;
  }  
    
}
