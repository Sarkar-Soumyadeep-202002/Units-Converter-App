package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Mass_Calculate_Activity extends AppCompatActivity {

    private EditText mass_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_calculate);

        mass_input = findViewById(R.id.Mass_value_input);
    }

   public void kg_to_Lbs(View view){

        double lbs = Calculations.convert_kg_to_pounds(Double.parseDouble(mass_input.getText().toString()));
        mass_input.setText(Double.toString(lbs));

    }

    public void lbs_to_Kg(View view){
        double kg = Calculations.convert_lbs_to_Kg(Double.parseDouble(mass_input.getText().toString()));
        mass_input.setText(Double.toString(kg));
    }

}
