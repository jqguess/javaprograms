/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon Guess
 */
public class TwodimensionalArray {
    
     // declare new array
    int [] [] twoarrays;
    // method to set the array
    public void setArray(){
       twoarrays = new int [10] [10]; // initialize twoarrays
    // intialize twoarrays
     for( int i = 0; i < twoarrays.length; i++){
         for( int j = 0; j < twoarrays[i].length; j++){
             
         } // end for
       } // end for
    } // end method  

    public void displayArray(){
        for( int i =1; i < twoarrays.length; i++){
            for( int j = 1; j < twoarrays[i].length; j++){
               System.out.println(" " + twoarrays[i] [j] + " "); 
            }
        }
        

    }
    
} // end class TwodimensionalArray

   