package sg.edu.rp.c346.id22000765.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime= findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textViewDisplay);
        btnReset=findViewById(R.id.btnReset);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setIs24HourView(true);
                int Hour = tp.getCurrentHour();
                int Minute =tp.getCurrentMinute();

                tvDisplay.setText("The time is "+Hour+":"+Minute);

            }

        });
        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Year = dp.getYear();
                int Month = dp.getMonth()+1;
                int DayOfMonth = dp.getDayOfMonth();

                tvDisplay.setText("The date is "+DayOfMonth+"/"+Month+"/"+Year);


            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setIs24HourView(true);

                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);

                dp.updateDate(2020,0,1);

            }
        });



    }


    }