/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towersofhanoi;

/**
 *
 * @author jqguess
 */
public class TowersOfHanoi {
    public static void moveDisks(int disks, int pegOne, int pegTwo, int pegThree){
    
       if (disks == 1){
           System.out.printf( "\n%d --> %d", pegOne, pegTwo);
       return;
       } // end if
       // recursive call to move disks
       moveDisks(disks-1, pegOne, pegThree, pegTwo);
       // move last disk from pegone to pegtwo
       System.out.printf("\n%d --->%d", pegOne, pegTwo);
       // move disks from pegThree to pegTwo
       moveDisks(disks-1, pegThree, pegTwo, pegOne);
    
     } // End method mmoveDisks 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg =2;
        int totalDisks =3;
      // using nonrecursion to move all the disks
      TowersOfHanoi.moveDisks( totalDisks, startPeg, endPeg, tempPeg );
    } // end main
    
} //end class towersofhanoi
