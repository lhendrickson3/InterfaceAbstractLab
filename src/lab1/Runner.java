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
                new IntroToProgrammingCourse("Intro to Programming", "1234", 3);
        System.out.println("Course Information: " 
                + myProgramIntro.getCourseName() + " " 
                + myProgramIntro.getCourseNumber() + " " 
                + myProgramIntro.getCredits() + ".");

        ProgrammingCourse myJavaIntro = 
                new IntroJavaCourse("Intro to Java", "5678", 4);

        ProgrammingCourse myAdvancedJava = 
                new AdvancedJavaCourse("Advanced Java", "9123", 4);

    }
}
