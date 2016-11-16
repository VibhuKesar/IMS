package teacherims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vaibhavsuri.institutemanagementsystem.ActCourseEnquiry;
import com.example.vaibhavsuri.institutemanagementsystem.R;

import teacherims.DecisionActivity;

public class MainActivity1 extends AppCompatActivity {

    Button btnstudent,btncourse,btnsearch,btnexit,btnabout;

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(MainActivity1.this, DecisionActivity.class));
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btnstudent=(Button)findViewById(R.id.btnstudent);
        btncourse=(Button)findViewById(R.id.btncourse);
        btnsearch=(Button)findViewById(R.id.btnsearch);
        btnexit=(Button)findViewById(R.id.btnexit);
        btnabout=(Button)findViewById(R.id.btnabout);

        btnstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity1.this,StudentActivity1.class);
                startActivity(i);
                finish();
            }
        });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity1.this,SearchActivity1.class);
                startActivity(i);
                finish();

            }
        });

        btncourse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this,ActCourseEnquiry1.class);
                startActivity(i);
                finish();
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity1.this.finishAffinity();
            }
        });

        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity1.this,AboutMe1.class);
                startActivity(i);
            }
        });



    }
}
