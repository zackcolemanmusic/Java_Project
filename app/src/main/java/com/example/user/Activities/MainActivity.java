package com.example.user.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.user.cardgame.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOptionSelected(View view) {
        if (view.getId() == R.id.play)
        {Intent intent = new Intent(this, ResultActivity.class);

        startActivity(intent);}

    }
}
