package temple.edu.coloractivity;

import android.graphics.Color;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ArrayList<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.add("teal");
        colors.add("cyan");
        colors.add("darkgray");
        colors.add("aqua");
        colors.add("white");
        colors.add("lime");

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setPrompt("Choose A Color");
        BaseAdapter adapter = new ColorAdapter(this, colors);
        spinner.setAdapter(adapter);


        final ConstraintLayout constraintLayout =  findViewById(R.id.colorSpinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                constraintLayout.setBackgroundColor(Color.parseColor(colors.get(position)));


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}