package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfTeamA = 0;
    int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreOfTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeForTeamA(View v) {
        scoreOfTeamA += 3;
        displayForTeamA(scoreOfTeamA);
    }

    public void plusTwoForTeamA(View v) {
        scoreOfTeamA += 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void plusOneForTeamA(View v) {
        scoreOfTeamA += 1;
        displayForTeamA(scoreOfTeamA);
    }

    public void plusThreeForTeamB(View v) {
        scoreOfTeamB += 3;
        displayForTeamB(scoreOfTeamB);
    }

    public void plusTwoForTeamB(View v) {
        scoreOfTeamB += 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void plusOneForTeamB(View v) {
        scoreOfTeamB += 1;
        displayForTeamB(scoreOfTeamB);
    }

    public void resetScore(View v) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayForTeamA(scoreOfTeamA);
        displayForTeamB(scoreOfTeamB);
    }

}

