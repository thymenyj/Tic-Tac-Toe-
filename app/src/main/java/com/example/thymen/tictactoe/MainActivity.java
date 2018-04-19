package com.example.thymen.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Game game;
    Tile tile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game = new Game();
        TextView newtext = findViewById(R.id.message);
        newtext.setText("Lets Play");
    }

    public void tileClicked(View view) {
        if (view.getId()==R.id.b1){
            tile = game.draw(0, 0);
        }
        else if(view.getId()==R.id.b2) {
            tile = game.draw(0, 1);
        }
        else if(view.getId()==R.id.b3) {
            tile = game.draw(0, 2);
        }
        else if(view.getId()==R.id.b4) {
            tile = game.draw(1, 0);
        }
        else if(view.getId()==R.id.b5) {
            tile = game.draw(1, 1);
        }
        else if(view.getId()==R.id.b6) {
            tile = game.draw(1, 2);
        }
        else if(view.getId()==R.id.b7) {
            tile = game.draw(2, 0);
        }
        else if(view.getId()==R.id.b8) {
            tile = game.draw(2, 1);
        }
        else if(view.getId()==R.id.b9) {
            tile = game.draw(2, 2);
        }

        switch(tile) {
            case CROSS:
                TextView cross = findViewById(view.getId());
                cross.setText("X");
                TextView newtextCross = findViewById(R.id.message);
                newtextCross.setText("Player Two is now");
                break;
            case CIRCLE:
                TextView circle = findViewById(view.getId());
                circle.setText("O");
                TextView newtextCircle = findViewById(R.id.message);
                newtextCircle.setText("Player One is now");
                break;
            case INVALID:
                TextView newtextInvalid = findViewById(R.id.message);
                newtextInvalid.setText("Cannot chose this tile");
                break;
        }

    }

    public void resetClicked(View view) {
    }
}
