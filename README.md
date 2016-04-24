## Java Programs
=================

####Towers of Hanoi
===================

This is a problem many budding programmers
have wrestled with. Attempt to move a stack 
of disks, largest to smallest, down a few 
pegs without placing smaller disks on larger
ones. Hint- Try recursion, or just read below.



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
        
        int startPeg = 1;
        int endPeg = 3;
        int tempPeg =2;
        int totalDisks =3;
      
      // using nonrecursion to move all the disks
      TowersOfHanoi.moveDisks( totalDisks, startPeg, endPeg, tempPeg );
    } // end main
    } //end class towersofhanoi
    

>The rest are a few java programs from a while back in 
school.  One of them populates a gradebook and gives averages
for students. It creates two test objects which are prepopulated,
and the other program was just practice. These are here incase someone
>might find them useful.

==========================

>RouteAverage is a java program I wrote for personal use to measure the workload of
a route.  It takes the distance in feet walked, usually between 1.5 and 3 miles
per day, and the weight of product moved to determine the work which is
>measured in foot lbs.
