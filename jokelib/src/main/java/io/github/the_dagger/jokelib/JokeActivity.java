package io.github.the_dagger.jokelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by the-dagger on 6/9/16.
 */
public class JokeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra("joke");
        TextView jokeScreen = (TextView) findViewById(R.id.jokeScreen);
        jokeScreen.setText(joke);
    }

}