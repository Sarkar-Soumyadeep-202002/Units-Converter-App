package au.edu.jcu.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_activity);
    }

    public void start(View view){

        Toast.makeText(HomePageActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show(); // Display a message.

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); // Start MainActivity.
    }

}
