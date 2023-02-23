package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Time_Calculate_Activity extends AppCompatActivity {

    private EditText time_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_calculate);

        time_input = findViewById(R.id.Time_value_input);
    }

    public void minutes_to_seconds(View view){

        double seconds = Calculations.convert_minutes_to_seconds(Double.parseDouble(time_input.getText().toString()));
        time_input.setText(Double.toString(seconds));

    }

    public void years_to_months(View view){

        double months = Calculations.convert_years_to_months(Double.parseDouble(time_input.getText().toString()));
        time_input.setText(Double.toString(months));

    }

}
