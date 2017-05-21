/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Traveller;

/**
 *
 * @author Piyush
 */
public class Traveller {
  private String name;
  private int id;
  private static int count = 1;
  
  public Traveller()
  {
    this.id = count;
    count ++;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public String toString()
  {
    return this.name;
  }
}
