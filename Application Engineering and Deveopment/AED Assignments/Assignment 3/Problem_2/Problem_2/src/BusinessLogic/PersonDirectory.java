/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
       
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
   
    public void deleteVitalSign(Person person){
        personList.remove(person);
    }   
    
    public Person searchAccount(String personID)
    {
        for(Person person : personList){
            if(personID.equals(String.valueOf(person.getPersonID()))){
                return person;
    }
    }
    return null;
}
    @Override
    public String toString() {
        return personList.toString();
    }
}
