package com.example.vaibhavsuri.institutemanagementsystem;

import java.util.ArrayList;


public class CourseList {

    public ArrayList<CourseView> getCourseList()
    {
        ArrayList<CourseView> courseViews = new ArrayList<CourseView>();
        CourseView view = new CourseView("A010","C#","3 Months",9000);
        courseViews.add(view);

        view = new CourseView("A01","DBMS","1 MONTH ",1000);
        courseViews.add(view);

        view = new CourseView("A02","C++","2 MONTH",2000);
        courseViews.add(view);

        view = new CourseView("A03","RUBY","3 MONTH",3000);
        courseViews.add(view);

        view = new CourseView("A04","PYTHON","4 MONTH",4000);
        courseViews.add(view);

        view = new CourseView("A05","ERLANG","5 MONTH",5000);
        courseViews.add(view);

        view = new CourseView("A06","IP/TCP","6 MONTH",6000);
        courseViews.add(view);

        view = new CourseView("A07","JAVASCRIPT","7 MONTH",7000);
        courseViews.add(view);

        return courseViews;

    }
}
