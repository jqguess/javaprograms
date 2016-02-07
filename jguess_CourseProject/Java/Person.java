/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon Guess
 * BMIS312-D01
 */
public class Person {
    
    private String firstName;
    private String lastName;
    
    // two argument constructor
    public Person (String firstName, String lastName){
    setFirstName(firstName);
    setLastName(lastName);
}

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // used to override object
    @Override
    public String toString(){
        return String.format(getFirstName() + " " + getLastName());
    }
} // end class Person
