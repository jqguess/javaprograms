/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routeaverage;
import java.util.Scanner;
/**
 * This is a Java Program to estimate the work done in foot lbs on a particular 
 * route given the distance in feet and truck route weight
 * @author jqguess
 */
public class RouteAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // new scanner object
        
        int distance; // variable for steps taken
        int weight;
        int workDone; // this is a foot/lb measurement
        /**
         * This prompt assumes the user has a smart phone and uses a
         * step counter application.  Simply read the distance in ft at the
         * end of the route.
         */
        System.out.print("Enter distance in feet from your app: ");
        distance = input.nextInt();
        /**
         * The route weight can be taken from the route master which lists
         * the exact pound weight of the entire load. Use this number for
         * weight
         */
          System.out.print("Enter the route weight: ");
          weight = input.nextInt();
          
          /**
           * This calculation divides distance by two because half the time spent
           * walking you are not carrying weight.
           * EQUATION
           * work(ft/lbs) = force * distance(ft.)
           */
          workDone = weight *(distance/2);
          System.out.printf("Estimated work in foot pounds is: %d\n", workDone );
         
          // print additional message based on weightMoved
          if (workDone > 2000000){
             System.out.println("Wow, you beast!");
          }else{
                System.out.println("You had an easy day!");
                } // end if else
          
    } // end main method
    
} // end class RouteAverage
