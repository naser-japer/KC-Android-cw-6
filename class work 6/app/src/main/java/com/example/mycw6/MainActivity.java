package com.example.mycw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Student> studentArrayList = new ArrayList<>();
int current = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView name = findViewById(R.id.textView);
        TextView age = findViewById(R.id.textView2);
        ImageView imge = findViewById(R.id.ImageView);
        TextView totalgrade = findViewById(R.id.textView4);
        Button next = findViewById(R.id.button);

        Student student1 = new Student("naser",16,95,R.drawable.unnamed);
        Student student2 = new Student("bader",14,94,R.drawable.badr);
        Student student3 = new Student("yosf",15,93,R.drawable.yosfe);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        imge.setImageResource(studentArrayList.get(current).getStudentimge());
        name.setText(studentArrayList.get(current).getStudentname());
        age.setText(String .valueOf(studentArrayList.get(current).getStudentage()));
        totalgrade.setText(String.valueOf(studentArrayList.get(current).getStudentgrade()));

       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               current++;
               if (current == studentArrayList.size()){
                   current = 0;
               }

           imge.setImageResource(studentArrayList.get(current).getStudentimge());
           name.setText(studentArrayList.get(current).getStudentname());
           age.setText(String .valueOf(studentArrayList.get(current).getStudentage()));
           totalgrade.setText(String.valueOf(studentArrayList.get(current).getStudentgrade()));




           }
       });


    }
}