package lab1;

public class IntroToProgrammingCourse extends ProgrammingCourse{
   

    public IntroToProgrammingCourse(String courseName, 
            String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }
    
}
