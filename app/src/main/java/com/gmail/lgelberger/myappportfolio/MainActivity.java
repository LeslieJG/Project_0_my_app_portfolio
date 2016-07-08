package com.gmail.lgelberger.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handles ALL button clicks
     * Improved on from the code review done by Udacity
     *
     * @param view that calls the buttonClick
     */
    public void buttonClicked(View view) {
        int buttonId = view.getId(); //retrieving id of button clicked
        // Since we know that buttonClicked is assigned to Buttons, we first cast it to a Button `((Button) v)`
        String buttonText = ((Button) view).getText().toString(); //get the text on the button
        switch (buttonId) { //leaving the switch here so that I can actually launch the apps as needed
            case R.id.spotify_streamer_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
            case R.id.scores_app_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
            case R.id.library_app_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
            case R.id.build_it_bigger_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
            case R.id.xyz_reader_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
            case R.id.capstone_button:
                makeToast(buttonText); //replace with actual call to app, once app is made
                break;
        }
    }

    /**
     * This is a temp method used until I have actual apps made. Then I will no longer display toasts but actually
     * run the app
     *
     * @param buttonText that is on the button that was clicked
     */
    private void makeToast(String buttonText) {
        Toast.makeText(this, getString(R.string.this_button_launches) + buttonText, Toast.LENGTH_LONG).show();
    }
}
