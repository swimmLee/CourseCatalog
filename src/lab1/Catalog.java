
package lab1;


public class Catalog {

    
    public static void main(String[] args) {
        CourseOffering advJavaTuesday = new AdvancedJavaCourse("AdvJavFun", "251");
        System.out.println("Course Name: " + advJavaTuesday.getCourseName() + 
                "\tCourse Number: " + advJavaTuesday.getCourseNumber());
        advJavaTuesday.setCredits(4);
        System.out.println("\tCredits: " + advJavaTuesday.getCredits() + "\n");
        
        CourseOffering introJavaTuesday = new IntroJavaCourse("IntroJavaFun", "151");
        System.out.println("Course Name: " + introJavaTuesday.getCourseName() + 
                "\tCourse Number: " + introJavaTuesday.getCourseNumber());
        introJavaTuesday.setCredits(3);
        System.out.println("\tCredits: " + introJavaTuesday.getCredits() + "\n");
        
        CourseOffering introProgramTuesday = new IntroToProgrammingCourse("IntroProgram", "101");
        System.out.println("Course Name: " + introProgramTuesday.getCourseName() + 
                "\tCourse Number: " + introProgramTuesday.getCourseNumber());
        introProgramTuesday.setCredits(2);
        System.out.println("\tCredits: " + introProgramTuesday.getCredits() + "\n");
        
    }
    
}
