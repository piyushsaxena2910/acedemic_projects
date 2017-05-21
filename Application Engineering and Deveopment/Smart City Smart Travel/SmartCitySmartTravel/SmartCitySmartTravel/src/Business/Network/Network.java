/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Piyush
 */
public class Network {
  private String name;
  private LocationDirectory localionDirectory;
  private EnterpriseDirectory enterpriseDirectory;
  
  public Network()
  {
    this.enterpriseDirectory = new EnterpriseDirectory();
    this.localionDirectory = new LocationDirectory();
  }
  
  public EnterpriseDirectory getEnterpriseDirectory()
  {
    return this.enterpriseDirectory;
  }

    public LocationDirectory getLocalionDirectory() {
        return localionDirectory;
    }

    public void setLocalionDirectory(LocationDirectory localionDirectory) {
        this.localionDirectory = localionDirectory;
    }
  
  
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  @Override
  public String toString()
  {
    return this.name;
  }
}
