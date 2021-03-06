package lab1;

/**
 * An abstract class for courses offered
 * @author lheberer
 */
public abstract class CourseOffering {
    String courseName;
    String courseNumber;
    double credits;
    
    public CourseOffering(String cName, String cNumber){
        this.setCourseName(cName);
        this.setCourseNumber(cNumber);
        //this.credits = credits;
    }
    
    abstract void setCourseName(String cName);
    abstract String getCourseName();
    
    abstract void setCourseNumber(String cNumber);
    abstract String getCourseNumber();
    
    abstract void setCredits(double credits);
    abstract double getCredits();
    
}
