package teacherims;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vaibhavsuri.institutemanagementsystem.R;

import java.util.List;


public class BaseStudentAdapter1 extends BaseAdapter{

    private LayoutInflater inflater;
    private List<StudentView1> data;
    public BaseStudentAdapter1(Context context) {

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        StudentDB1 db = new StudentDB1(context);
        data = db.getAllStudent();

    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return data.size()+11;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        if (convertview==null){
            convertview=inflater.inflate(R.layout.adapter_allstudent1,parent,false);
        }

        StudentView1 view = data.get(position);
        TextView textView = (TextView)convertview.findViewById(R.id.adapter_all_student_tv_reg);
        textView.setText("Registration ID:" + view.getStudent_REGISTRATION());

        textView=(TextView)convertview.findViewById(R.id.adapter_all_student_tv_name);
        textView.setText("NAME :" + view.getStudent_name());

        textView=(TextView)convertview.findViewById(R.id.adapter_all_student_tv_father);
        textView.setText("FATHER NAME :" + view.getStudent_FATHER_NAME());

        textView=(TextView)convertview.findViewById(R.id.adapter_all_student_tv_add);
        textView.setText("ADDRESS :" + view.getStudent_Address());

        textView=(TextView)convertview.findViewById(R.id.adapter_all_student_tv_course);
        textView.setText("COURSE :" + view.getStudent_Course());

        return convertview;
    }
}
