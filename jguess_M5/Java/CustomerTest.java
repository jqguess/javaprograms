/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jon_dana
 */
public class CustomerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(), // new customer instances
                 c2 = new Customer();            
        // set customer information
        c1.setCustomerInfo(4, "Jon Guess", "123 Main St", "540-111-1111");
        c2.setCustomerInfo(2, "Dana Guess", "123 Main St", "540-222-2222");
        // display customer information
        c1.display();
        c2.display();
    
    } // end main method
    
} // end class
