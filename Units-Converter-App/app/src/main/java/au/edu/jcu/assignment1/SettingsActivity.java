package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private EditText new_message_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        new_message_input = findViewById(R.id.welcome_message_input);
    }

    /* Change the Welcome message displayed on the main page from the Settings page. */
    public void clickDone(View view){

        TextView new_welcome_message = findViewById(R.id.main_page_welcome_message); // Find the TextView field which displays the welcome message on the main page.
        String message = new_message_input.getText().toString(); // Get the new message entered by the user and convert it to a String.
        new_welcome_message.setText(message); // Update the welcome message on the main page.

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}
