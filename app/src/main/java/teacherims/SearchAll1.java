package teacherims;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.vaibhavsuri.institutemanagementsystem.R;

/**
 * Created by Libbna Mathew on 26-07-2016.
 */
public class SearchAll1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allstudent_search1);
        BaseStudentAdapter1 adapter = new BaseStudentAdapter1(this);
        ListView listView = (ListView)findViewById(R.id.act_all_student_lv_listview);
        listView.setAdapter(adapter);
    }
}
