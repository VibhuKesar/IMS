package com.example.vaibhavsuri.institutemanagementsystem;

public class CourseView {

    private String CourseID;
    private String CourseName;
    private String CourseDuration;
    private int CourseFee;




    public CourseView(String courseId, String courseName, String courseDuration, int courseFee) {
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

