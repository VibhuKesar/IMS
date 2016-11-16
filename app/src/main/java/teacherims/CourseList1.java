package teacherims;


import java.util.ArrayList;


public class CourseList1 {

    public ArrayList<CourseView1> getCourseList()
    {
        ArrayList<CourseView1> courseViews = new ArrayList<CourseView1>();
        CourseView1 view = new CourseView1("A010","C#","3 Months",9000);
        courseViews.add(view);

        view = new CourseView1("A01","DBMS","1 MONTH ",1000);
        courseViews.add(view);

        view = new CourseView1("A02","C++","2 MONTH",2000);
        courseViews.add(view);

        view = new CourseView1("A03","RUBY","3 MONTH",3000);
        courseViews.add(view);

        view = new CourseView1("A04","PYTHON","4 MONTH",4000);
        courseViews.add(view);

        view = new CourseView1("A05","ERLANG","5 MONTH",5000);
        courseViews.add(view);

        view = new CourseView1("A06","IP/TCP","6 MONTH",6000);
        courseViews.add(view);

        view = new CourseView1("A07","JAVASCRIPT","7 MONTH",7000);
        courseViews.add(view);

        return courseViews;

    }
}
