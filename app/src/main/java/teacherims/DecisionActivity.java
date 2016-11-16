package teacherims;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vaibhavsuri.institutemanagementsystem.MainActivity;
import com.example.vaibhavsuri.institutemanagementsystem.R;

import loginwork.LoginActivity;

public class DecisionActivity extends AppCompatActivity {

    Button btnstudents,btnteachers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decision);

        btnstudents=(Button)findViewById(R.id.btnstudents);
        btnteachers=(Button)findViewById(R.id.btnteachers);

        btnstudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DecisionActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnteachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DecisionActivity.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        });


    }
}
