/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jon_dana
 */
public class ClassMap {
    
    public String name;
    private static int NUMBER_DESKS = 10;
    private String[] deskArray;
    private int deskPosition;
    
    // start method
    public void setClassMap() {
        deskArray = new String[NUMBER_DESKS];
        for (int i=0; i<deskArray.length; i++) {
            deskArray[i] = "";
        }
        deskPosition = 0; //start at the first desk
    } // end method
    
    // start method
    public void setDesk() {
        if (!"".equals(name)) { //if name is not blank
            deskArray[deskPosition++] = name;
        }
        else { //if name is blank
            System.out.println("You must set the name property before "
                    + "calling setDesk().");
        } // end else
    } // end method
    
    // start method
    public void displayDeskMap() {
        for (int i=0; i<deskPosition; i++) {
            System.out.printf("%s sets at Desk %d\n", deskArray[i], i+1);
        } // end for
    } // end method
    
    // start method
    public void searchDesk() {
        boolean found = false;
        for (int i=0; i<deskPosition; i++) {
            if (name.equals(deskArray[i]) && !found) {
                System.out.printf("%s sits at Desk %d\n", name, i+1);
                found = true;
            }
        }
        if (!found) {
            System.out.printf("%s does not have a desk.\n", name);
        }
    } // end method
} // end class

