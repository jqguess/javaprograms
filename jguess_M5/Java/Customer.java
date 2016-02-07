/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jon_dana
 */
public class Customer {
  
    int customerID = 0;
    String name = "-name required-";
    String address = "-address required-";
    String phoneNumber = "-phone number required-";
    String eMail = "-email optional-";
    
    // method to set the customers info
    public void setCustomerInfo( int id, String nm, String addr,
            String phNum){
        customerID = id;
        name = nm;
        address = addr;
        phoneNumber = phNum;
        
     } // end method

   public void display(){
       System.out.println("Customoer ID: " + customerID);
       System.out.println("Name: " + name);
       System.out.println("Address: " + address);
       System.out.println("Phone Number: " + phoneNumber);
               
               
      } // end method
} // end class
