package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void showToastOnClick(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();

        CharSequence text = "";
        int duration = Toast.LENGTH_SHORT;

        switch (view.getId()) {
            case R.id.btnScoresApp:
                text = "This button will launch my scores app!";
                break;
            case R.id.btnLibraryApp:
                text = "This button will launch my library app!";
                break;
            case R.id.btnBiggerApp:
                text = "This button will launch my build it bigger app!";
                break;
            case R.id.btnSpotifyApp:
                text = "This button will launch my spotify app!";
                break;
            case R.id.btnReaderApp:
                text = "This button will launch my xyz reader app!";
                break;
            case R.id.btnCapstoneApp:
                text = "This button will launch my capstone app!";
                break;
        }

        if (text.length() > 0) {
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
