package com.example.cricketscore;
//veruthe for hact
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //displays score of team A
    public void displayForTeamA(int score, int wicket) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score) + "-" + String.valueOf(wicket));
    }

    //displays score of team B
    public void displayForTeamB(int score, int wicket) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score) + "-" + String.valueOf(wicket));
    }

    //adds 6 runs to score of team A
    public void runs6TeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA, wicketsTeamA);
    }

    //adds 4 runs to score of team A
    public void runs4TeamA(View v) {
        scoreTeamA += 4;
        displayForTeamA(scoreTeamA, wicketsTeamA);
    }

    //adds 1 runs to score of team A
    public void runs1TeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA, wicketsTeamA);
    }

    //adds 6 runs to score of team B
    public void runs6TeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB, wicketsTeamB);
    }

    //adds 4 runs to score of team B
    public void runs4TeamB(View v) {
        scoreTeamB += 4;
        displayForTeamB(scoreTeamB, wicketsTeamB);
    }

    //adds 1 runs to score of team B
    public void runs1TeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB, wicketsTeamB);
    }

    //adds 1 to wicket to team A
    public void outForTeamA(View v) {
        wicketsTeamA += 1;
        displayForTeamA(scoreTeamA, wicketsTeamA);
    }

    //adds 1 to wicket of team B
    public void outForTeamB(View v) {
        wicketsTeamB += 1;
        displayForTeamB(scoreTeamB, wicketsTeamB);
    }

    //resets score of both team A and B
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayForTeamA(scoreTeamA, wicketsTeamA);
        displayForTeamB(scoreTeamB, wicketsTeamB);
    }
}

