package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      mgreen12
 * @version     1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
