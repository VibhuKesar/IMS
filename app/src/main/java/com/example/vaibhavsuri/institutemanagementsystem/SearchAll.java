package com.example.vaibhavsuri.institutemanagementsystem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class SearchAll extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allstudent_search);
        BaseStudentAdapter adapter = new BaseStudentAdapter(this);
        ListView listView = (ListView)findViewById(R.id.act_all_student_lv_listview);
        listView.setAdapter(adapter);
    }
}
