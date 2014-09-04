
package lab1;

/**
 *
 * @author mgreen12
 */
public class Startup {
    
    public static void main(String[] args) {
        
        //Tests to show working inheritance.
        AdvancedJavaCourse course1 = new AdvancedJavaCourse("Advanced Java", "112233");
        course1.setPrerequisites("prereq test");
        System.out.println(course1.getCourseName() + ", " + course1.getCourseNumber() + ", " + course1.getPrerequisites());
        
    }
    
}
