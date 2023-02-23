package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Length_Calculate_Activity extends AppCompatActivity {

    private EditText length_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_calculate);

        length_input = findViewById(R.id.Length_value_input); // Find the EditText field in which the user input's a value.
    }

    public void meter_to_feet(View view){
        double feet = Calculations.convert_meters_to_feet(Double.parseDouble(length_input.getText().toString())); // Send the value entered in the EditText field to the converter function after type casting it to a String.
        length_input.setText(Double.toString(feet)); // Display the value returned by the converter function in the EditText field.
    }

    public void feet_to_meter(View view){
        double meter = Calculations.convert_feet_to_meters(Double.parseDouble(length_input.getText().toString()));
        length_input.setText(Double.toString(meter));
    }

}
