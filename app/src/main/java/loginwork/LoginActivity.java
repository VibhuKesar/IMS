package loginwork;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.vaibhavsuri.institutemanagementsystem.R;

import teacherims.DecisionActivity;
import teacherims.MainActivity1;

public class LoginActivity extends AppCompatActivity {
    // User name
    private EditText et_Username;
    // Password
    private EditText et_Password;
    // Sign In
    private Button bt_SignIn;
    // Message
    private TextView tv_Message;

    public static int Time = 1000;

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(LoginActivity.this, DecisionActivity.class));
        finish();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialization
        et_Username = (EditText) findViewById(R.id.et_Username);
        et_Password = (EditText) findViewById(R.id.et_Password);
        bt_SignIn = (Button) findViewById(R.id.bt_SignIn);
        tv_Message = (TextView) findViewById(R.id.tv_Message);

        bt_SignIn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Stores User name
                String username = String.valueOf(et_Username.getText());
                // Stores Password
                String password = String.valueOf(et_Password.getText());

                // Validates the User name and Password for admin, admin
                if (username.equals("admin") && password.equals("admin")) {
                    tv_Message.setText("Login Successful!");
                    startActivity(new Intent(LoginActivity.this, MainActivity1.class));
                    finish();
                } else {
                    tv_Message.setText("Login Unsuccessful!");
                    new Handler().postDelayed(new Runnable() {                  //runnable is a class contains RUN()
                        @Override
                        public void run() {
                            startActivity(new Intent(LoginActivity.this, DecisionActivity.class));
                            finish();
                        }


                    }, Time);
                }
            }
        });
    }
}