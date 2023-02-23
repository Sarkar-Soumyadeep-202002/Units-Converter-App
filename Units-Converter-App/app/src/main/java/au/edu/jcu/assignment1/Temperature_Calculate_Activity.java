package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Temperature_Calculate_Activity extends AppCompatActivity {

    private EditText temperature_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_calculate);

        temperature_input = findViewById(R.id.Temperature_value_input);
    }

    public void celcius_to_Fahrenheit(View view){

        double fahrenheit = Calculations.convert_celcius_to_fahrenheit(Double.parseDouble(temperature_input.getText().toString()));
        temperature_input.setText(Double.toString(fahrenheit));

    }

    public void celcius_to_Kelvin(View view){

        double kelvin = Calculations.convert_celcius_to_kelvin(Double.parseDouble(temperature_input.getText().toString()));
        temperature_input.setText(Double.toString(kelvin));

    }

    public void fahrenheit_to_celcius(View view){

        double celcius = Calculations.convert_fahrenheit_to_celcius(Double.parseDouble(temperature_input.getText().toString()));
        temperature_input.setText(Double.toString(celcius));

    }

}
