package teacherims;


public class CourseView1 {

    private String CourseID;
    private String CourseName;
    private String CourseDuration;
    private int CourseFee;




    public CourseView1(String courseId, String courseName, String courseDuration, int courseFee) {
        this.CourseID = courseId;
        this.CourseName = courseName;
        this.CourseDuration = courseDuration;
        this.CourseFee = courseFee;
    }

    public String getCourseID() {
        return CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public String getCourseDuration() {
        return CourseDuration;
    }

    public int getCourseFee() {
        return CourseFee;
    }


}
