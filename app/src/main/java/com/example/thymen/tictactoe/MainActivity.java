package com.example.thymen.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
    }

    public void tileClicked(View view) {
        int id = view.getId();
        int row = view.getLayoutParams()
        Tile tile = game.draw(row, column);
        switch(tile) {
            case CROSS:
                final TextView textViewToChange = findViewById(R.id.message);
                textViewToChange.setText(
                        "The new text that I'd like to display now that the user has pushed a button.");
                break;
            case CIRCLE:
                // do something
                break;
            case INVALID:

                break;
        }

    }

    public void resetClicked(View view) {
    }
}
