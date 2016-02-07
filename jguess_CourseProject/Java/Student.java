/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jon_dana
 */
import java.util.ArrayList;
public class Student extends Person {
    
    private String studentID;
    private double grades;

    
    // 4 argument constructor
    public Student ( String firstName, String lastName, String studentID,
           double grades){
        super(firstName, lastName);
          setStudentID(studentID);
          setGrades(grades);
    } // end constructor

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the grade
     */
    public double getGrades() {
        return grades;
    }

    /**
     * @param grades the grade to set
     */
    public void setGrades(double grades) {
        if (grades < 0 || grades > 100){
        throw new IllegalArgumentException();
        }else{
          this.grades = grades;
         } // end else
    } // end method setGrades

    // method to get a Letter Grade
    public char getLetterGrade(){
    char letterGrade;
   if (90 <= grades) { letterGrade = 'A'; }
   else if (80 <= grades && grades < 90) { letterGrade = 'B'; }
   else if (70 <= grades && grades < 80) { letterGrade = 'C'; }
   else if (60 <= grades && grades < 70) { letterGrade = 'D'; }
   else { letterGrade = 'F'; }   // score < 60 must hold
   return letterGrade;
    } // end method
    
    // overload tostring to print 
    public String toString(){
        return String.format(getFirstName() + " " + getLastName() + " " + getStudentID()
        + " " + getLetterGrade());
     } // end tostring
} // end class