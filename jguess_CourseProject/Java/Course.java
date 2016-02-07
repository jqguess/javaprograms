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
public class Course {
    
    // declare course fields
    public ArrayList<Student> students;
    
    private String courseTitle;
    private Instructor instructor;
    private int currentStudents;
    private int maxStudents = 5;
    private double averageGrade;
    private double highestGrade;
    private double lowestGrade;
    
    // 3 argument constructor
    public Course(String courseTitle, Instructor instructor, int maxStudents){
    students = new ArrayList(maxStudents);
    setCourseTitle(courseTitle);
    setInstructor(instructor);
    setMaxStudents(maxStudents);
    setCurrentStudents(currentStudents);
    } // end constructor

    /**
     * @param courseTitle the courseTitle to set
     */
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    } // end method
    
    // method to set coursetitle
    public String getCourseTitle() {
        return courseTitle;
    } // end method
    /**
     * @return the instructor
     */
    public Instructor getInstructor() {
        return instructor;
    } // end method

    /**
     * @param instructor the instructor to set
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
   } // end method

   public int getMaxStudents(){
       return maxStudents;
   } // end method
    
   public void setMaxStudents(int maxStudents){
       this.maxStudents = maxStudents;
       
       
   } // end method
   
   // method to add students to the course
   public void addStudent(Student student){
       if (students.size() >=0 && students.size() <=5)
       students.add(student);
       else throw new ArrayIndexOutOfBoundsException();
     } // end method
   
// method to enroll new students
   public String getStudentsInCourse() {
       String output = ""; 
        for (Student student : students) { // enhanced for
                output += student.toString() + "\n";
          } // end for
       return output;
   } // end method
   
   // method to get the average grade
   public double getAverageGrade(){
       double totalGrade = 0;
       double averageGrade = 0;
       // for loop to iterate over the array
       for(int i = 0; i<students.size(); i++){
           totalGrade += students.get(i).getGrades();
       } // end for
       
       averageGrade = totalGrade / students.size();
       return averageGrade;
   } // end method
   
    // method to return the highest grade
    public double getHighestGrade(){
        double highestGrade = 0;
        for (int i = 0; i<students.size(); i++){
            if (students.get(i).getGrades()> highestGrade)
            highestGrade = students.get(i).getGrades();
        }// end for
       return highestGrade;
    } // end method

    // method to return the lowest grade
    public double getLowestGrade(){
        double lowestGrade = 100;
        for (int i = 0; i<students.size(); i++){
            if (students.get(i).getGrades()< lowestGrade)
                lowestGrade = students.get(i).getGrades();
        } // end for
        return lowestGrade;
    } // end method
    
   // method to set the current number of students
   public void setCurrentStudents(int currentStudents)
       throws ArrayIndexOutOfBoundsException
   {
       if (students.size() >=0)
          if (students.size() <=5)
        this.currentStudents = students.size();
       else throw new ArrayIndexOutOfBoundsException();
   } // end method
   
   // method to get the current enrolled students
   public int getCurrentStudents(){
       return currentStudents;
     } // end method
   
    @Override
    public String toString(){
        return String.format("%s %s\n\n%s %s\n\n%s\n%s\n%s\n%s\n%s\n%s\n%s%s\n\n%s %s\n%s %s\n%s %s", "Course Title: ",getCourseTitle(),"Instructor: ", getInstructor(),
                "Student Roster: ", students.get(0), students.get(1), students.get(2), students.get(3), students.get(4),
                "Current Students Enrolled: ", students.size(),"Average Grade: ", getAverageGrade(),"Highest Grade: ",
                getHighestGrade(),"Lowest Grade:",getLowestGrade());
    } // end toString method
           
    
}// end class course
