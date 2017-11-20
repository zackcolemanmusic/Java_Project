package com.example.user.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

        EditText player1_name = (EditText) findViewById(R.id.name_1);
        EditText player2_name = (EditText) findViewById(R.id.name_2);

        intent.putExtra("player1_name", player1_name.getText().toString());
        intent.putExtra("player2_name", player2_name.getText().toString());

        startActivity(intent);}

    }
}
