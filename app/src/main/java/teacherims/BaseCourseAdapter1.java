package teacherims;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vaibhavsuri.institutemanagementsystem.R;

import java.util.ArrayList;


public class BaseCourseAdapter1 extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<CourseView1> data;

    BaseCourseAdapter1(Context context) {
        CourseList1 list = new CourseList1();
        data = list.getCourseList();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount () {
        return data.size();
    }

    @Override
    public Object getItem ( int position){
        return data.get(position);
    }

    @Override
    public long getItemId ( int position){
        return data.size() + 11;
    }

    @Override
    public View getView ( int position, View convertView, ViewGroup parent){
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.adapter_course1, parent, false);
        }

        CourseView1 courseView = data.get(position);

        TextView textView = (TextView) convertView.findViewById(R.id.adapter_course_tv_ID);
        textView.setText("Course ID:" + courseView.getCourseID());

        textView = (TextView) convertView.findViewById(R.id.adapter_course_tv_NAME);
        textView.setText("Course Name:" + courseView.getCourseName());

        textView = (TextView) convertView.findViewById(R.id.adapter_course_Duration);
        textView.setText("Course Duration:" + courseView.getCourseDuration());

        textView = (TextView) convertView.findViewById(R.id.adapter_course_Fee);
        textView.setText("Course Fee:" + courseView.getCourseFee());

        return convertView;


    }
}
