/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author User
 */
public abstract class ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseNumber
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * @param courseNumber the courseNumber to set
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    /**
     * @return the credits
     */
    public double getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(double credits) {
        this.credits = credits;
    }
    
}
