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
import java.util.ArrayList;
public class CourseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try
         {    
         // test objects for setter/getter/constructors
        
         //Person studentOne = new Person("Jon" , "Guess");
         //Person studentTwo = new Person("Dana" , "Guess");
         //System.out.println( studentOne );
         //System.out.println( studentTwo );
        
        //Instructor studentOne = new Instructor("Jon" , "Guess", "Dr.");
        //Instructor studentTwo = new Instructor("Dana", "Guess", "Dr.");
        //System.out.println( studentOne );
        //System.out.println( studentTwo );
        
        //Student studentOne = new Student("Jon", "Guess", "GU1111", 78);
        //Student studentTwo = new Student("Dana", "Guess", "GU0002", 98);
        //System.out.println( studentOne );
        //System.out.println( studentTwo );
        
        Instructor instructorOne = new Instructor("Terri" , "Sipantzi", "Prof.");
        Instructor instructorTwo = new Instructor("Brandon", "Jennings","Dr.");
        
        Course course1 = new Course("Java Programming", instructorOne, 5);
        Course course2= new Course("Java Advanced", instructorTwo, 5);
        
        // creating new students to populate array
        course1.addStudent(new Student("Jon", "Guess", "GU1111", 94));
        course1.addStudent(new Student("Dana", "Guess", "GU1002", 100));
        course1.addStudent(new Student("Mike", "Brown", "BR1111", 79));
        course1.addStudent(new Student("Ted", "Cruz", "CR9997", 81));
        course1.addStudent(new Student("Jenn", "Smith", "SM5018", 90));
        course1.addStudent(new Student("Henry", "Hollins", "HO2529", 88));
        
         // creating new students to populate array
        course2.addStudent(new Student("Trevor", "Wilks", "WI9011", 77));
        course2.addStudent(new Student("Helen", "Greene", "GR1002", 93));
        course2.addStudent(new Student("Mike", "Brown", "BR3411", 79));
        course2.addStudent(new Student("Justin", "Murphy", "MU9797", 81));
        course2.addStudent(new Student("Jenn", "Smith", "SM5018", 90));
        
        // call toString
        System.out.println(course1);
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println(course2);
        //System.out.println(course1.getStudentsInCourse());
        //System.out.println(course1.getAverageGrade());
        //System.out.println(course1.getHighestGrade());
         } // end try
         
         catch(ArrayIndexOutOfBoundsException ire ) // catch IAE exception
         {
          System.out.printf("\nException: %s\n" , ire);  
          System.out.println("-----------------------");
          System.out.println("Only 5 students can be enrolled at once");
         } // end catch

        
    } // end method
    
} // end class
