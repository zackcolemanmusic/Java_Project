package com.example.user.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.cardgame.Game;
import com.example.user.cardgame.Player;
import com.example.user.cardgame.R;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    private Button deal_cards;
    private TextView player1_cards;
    private TextView player2_cards;
    private TextView player1_name;
    private TextView player2_name;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.result = findViewById(R.id.result);
        this.deal_cards = findViewById(R.id.deal_cards);
        this.player1_cards = findViewById(R.id.player1_cards);
        this.player2_cards = findViewById(R.id.player2_cards);
        this.player1_name = findViewById(R.id.player1_name);
        this.player2_name = findViewById(R.id.player2_name);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String player1_intent = extras.getString("player1_name");
        String player2_intent = extras.getString("player2_name");

        player1_name.setText(player1_intent);
        player2_name.setText(player2_intent);

    }

    public void onButtonClicked(View deal){
        Player player1 = new Player("Zack");
        Player player2 = new Player("Pete");
        Game game = new Game(player1, player2);
        game.shuffleDeck();
        game.dealCards();
        player1_cards.setText(player1.getHand());
        player2_cards.setText(player2.getHand());
        result.setText(game.getWinner());


    }




}
