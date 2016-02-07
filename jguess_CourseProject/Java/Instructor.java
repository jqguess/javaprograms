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
public class Instructor extends Person {
    // private field for instructor title
    private String title;
    // 3 argument constructor
    public Instructor(String firstName, String lastName, String title){
        super(firstName, lastName);
        setTitle(title);
    } // end constructor

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    } // end method

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    } // end method
   public String toString(){
        return String.format(getTitle() + " " + getFirstName() + " " + getLastName());

   } // end overloaded toString method
} // end class instructor
