/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author User
 */
public class Runner {

    public static void main(String[] args) {

        ProgrammingCourse myProgramIntro = 
                new IntroToProgrammingCourse("Intro to Programming", "1234", 3, 
                "No Prerequisites");
        System.out.println("Course Information: " 
                + myProgramIntro.getCourseName() + " " 
                + myProgramIntro.getCourseNumber() + " " 
                + myProgramIntro.getCredits() + " " 
                + myProgramIntro.getPrerequisites() + ".");

        ProgrammingCourse myJavaIntro = 
                new IntroJavaCourse("Intro to Java", "5678", 4, 
                "Intro to Programming");
        System.out.println("Course Information: " 
                + myJavaIntro.getCourseName() + " " 
                + myJavaIntro.getCourseNumber() + " " 
                + myJavaIntro.getCredits() + " "
                + myJavaIntro.getPrerequisites());

        ProgrammingCourse myAdvancedJava = 
                new AdvancedJavaCourse("Advanced Java", "9123", 4, 
                "Intro to Java");
        System.out.println("Course Information: " 
                + myAdvancedJava.getCourseName() + " " 
                + myAdvancedJava.getCourseNumber() + " " 
                + myAdvancedJava.getCredits() + " "
                + myAdvancedJava.getPrerequisites());

    }
}
