package com.example.dy.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(teamAScore);
        displayForTeamB(teamAScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds three points team a
     * @param view
     */
    public void threePointsA(View view) {
      teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds two points team a
     * @param view
     */
    public void twoPointsA(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds one point team a
     * @param view
     */
    public void freeThrowA(View view) {
       teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    /**
     * Adds three points team b
     * @param view
     */
    public void threePointsB(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds two points team b
     * @param view
     */
    public void twoPointsB(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }

    /**
     * Adds one point team b
     * @param view
     */
    public void freeThrowB(View view) {
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }

    /**
     * Reset button
     */

    public void resetScore(View view) {
        teamAScore = 0;
        teamBScore = 0;

        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
