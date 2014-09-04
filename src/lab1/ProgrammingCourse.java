/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author mgreen12
 */
public abstract class ProgrammingCourse {
    
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public ProgrammingCourse(String courseName, String courseNumber, double Credits) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
    }
    
    //For courses with prereqs. 
    public ProgrammingCourse(String courseName, String courseNumber, double Credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    
}
