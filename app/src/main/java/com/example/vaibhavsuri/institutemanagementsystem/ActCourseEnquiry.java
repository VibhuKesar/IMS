package com.example.vaibhavsuri.institutemanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import teacherims.DecisionActivity;

public class ActCourseEnquiry extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(ActCourseEnquiry.this, DecisionActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_course_enquiry);

        ListView listView = (ListView)findViewById(R.id.courseenquiry_lv_list);
        BaseCourseAdapter adapter = new BaseCourseAdapter(this);
        listView.setAdapter(adapter);
    }
}
