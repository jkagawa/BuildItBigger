package com.udacity.gradle.androidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Joshua on 8/11/2018.
 */

public class AndroidJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKES = "jokes";
    public static String mJokes;

    TextView mJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidlibrary);

        mJokeView = findViewById(R.id.joke_text_view);

        Intent intentFromMainActivity = getIntent();

        Bundle extras = intentFromMainActivity.getExtras();

        if (extras != null) {
            mJokes = intentFromMainActivity.getStringExtra(EXTRA_JOKES);

            mJokeView.setText(mJokes);

        }

    }

}
