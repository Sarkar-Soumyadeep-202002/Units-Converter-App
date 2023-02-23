package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /* Store the current state of the app when the screen is rotated. */
    protected void onSaveInstanceState(Bundle outstate){
        super.onSaveInstanceState(outstate);
    }

    public void clickLength(View view){

        Toast.makeText(MainActivity.this, "FUN FACT: The CGS Unit of Length is cm", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Length_Calculate_Activity.class);
        startActivity(intent);
    }

    public void clickMass(View view){

        Toast.makeText(MainActivity.this, "FUN FACT: The SI Unit of Mass is kg", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Mass_Calculate_Activity.class);
        startActivity(intent);
    }

    public void clickTemperature(View view){

        Toast.makeText(MainActivity.this, "FUN FACT: The SI Unit of Temperature is kelvin", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Temperature_Calculate_Activity.class);
        startActivity(intent);
    }

    public void clickTime(View view){

        Toast.makeText(MainActivity.this, "FUN FACT: The CGS Unit of Time is seconds", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Time_Calculate_Activity.class);
        startActivity(intent);
    }

    public void clickSettings(View view){

        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}
