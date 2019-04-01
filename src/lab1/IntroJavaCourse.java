 package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends CourseOffering{

    //private String courseName;
    //private String courseNumber;
    //private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
        //this.courseName = courseName;
        //this.courseNumber = courseNumber;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    @Override
    void setCourseName(String courseName){
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    
    
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

}
