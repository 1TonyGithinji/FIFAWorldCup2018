package com.example.android.fifaworldcup2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Eqypt
    int scoreEgypt = 0;

    // Tracks the score for Russia
    int scoreRussia = 0;

    // Tracks the score for Saudi Arabia
    int scoreSaudi = 0;

    // Tracks the score for Uruguay
    int scoreUruguay = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Egypt by 3 points.
     */
    public void add3ForEgypt(View v) {
        scoreEgypt = scoreEgypt + 3;
        displayForEgypt(scoreEgypt);
    }

    /**
     * Increase the score for Egypt by 1 point.
     */
    public void add1ForEgypt(View v) {
        scoreEgypt = scoreEgypt + 1;
        displayForEgypt(scoreEgypt);
    }

    /**
     * Increase the score for Russia by 3 points.
     */
    public void add3ForRussia(View v) {
        scoreRussia = scoreRussia + 3;
        displayForRussia(scoreRussia);
    }

    /**
     * Increase the score for Russia by 1 point.
     */
    public void add1ForRussia(View v) {
        scoreRussia = scoreRussia + 1;
        displayForRussia(scoreRussia);
    }

    /**
     * Increase the score for Saudi Arabia by 3 points.
     */
    public void add3ForSaudi(View v) {
        scoreSaudi = scoreSaudi + 3;
        displayForSaudi(scoreSaudi);
    }

    /**
     * Increase the score for Saudi Arabia by 1 point.
     */
    public void add1ForSaudi(View v) {
        scoreSaudi = scoreSaudi + 1;
        displayForSaudi(scoreSaudi);
    }

    /**
     * Increase the score for Uruguay by 3 points.
     */
    public void add3ForUruguay(View v) {
        scoreUruguay = scoreUruguay + 3;
        displayForUruguay(scoreUruguay);
    }

    /**
     * Increase the score for Uruguay by 1 point.
     */
    public void add1ForUruguay(View v) {
        scoreUruguay = scoreUruguay + 1;
        displayForUruguay(scoreUruguay);
    }
    /**
     * Resets the score for all 4 World Cup Group A teams back to 0.
     */
    public void resetScore(View v) {
        scoreEgypt = 0;
        scoreRussia = 0;
        scoreSaudi = 0;
        scoreUruguay = 0;
        displayForEgypt(scoreEgypt);
        displayForRussia(scoreRussia);
        displayForSaudi(scoreSaudi);
        displayForUruguay(scoreUruguay);
    }

    /**
     * Displays the given score for Egypt.
     */
    public void displayForEgypt(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Egypt);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Russia.
     */
    public void displayForRussia(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Russia);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Saudi Arabia.
     */
    public void displayForSaudi(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Saudi);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Uruguay.
     */
    public void displayForUruguay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Uruguay);
        scoreView.setText(String.valueOf(score));
    }
}
