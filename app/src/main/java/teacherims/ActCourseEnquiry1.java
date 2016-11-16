package teacherims;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.vaibhavsuri.institutemanagementsystem.R;


public class ActCourseEnquiry1 extends AppCompatActivity {

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(ActCourseEnquiry1.this, MainActivity1.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_course_enquiry1);

        ListView listView = (ListView)findViewById(R.id.courseenquiry_lv_list1);
        BaseCourseAdapter1 adapter = new BaseCourseAdapter1(this);
        listView.setAdapter(adapter);
    }
}
