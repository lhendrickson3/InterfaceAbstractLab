/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public interface ProgrammingCourse {
    
   
    public String getCourseName();
    public void setCourseName(String courseName);
    public String getCourseNumber();
    public void setCourseNumber(String courseNumber);
    public double getCredits();
    public void setCredits(double credits);
    public String getPrerequisites();
    public void setPrerequisites(String prerequisites);
    
}
