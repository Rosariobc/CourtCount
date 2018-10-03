package com.example.android.courtcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int periodNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the increase3 button is clicked.
     */
    public void increase3a(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void increase3b(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the increase2 button is clicked.
     */
    public void increase2a(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void increase2b(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the increase1 button is clicked.
     */
    public void increase1a(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void increase1b(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the increasePeriod button is clicked.
     */
    public void increasePeriod(View view) {
        periodNumber = periodNumber + 1;
        displayForPeriod(periodNumber);
    }


    /**
     * This method is called when the reset button is clicked.
     */

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        periodNumber = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForPeriod(periodNumber);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the Period Number.
     */
    private void displayForPeriod(int periodNumber) {
        TextView periodView = (TextView) findViewById(R.id.period_button);
        periodView.setText(String.valueOf(periodNumber));
    }
}
