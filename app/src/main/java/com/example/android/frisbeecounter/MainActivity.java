package com.example.android.frisbeecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int numberOFaulsA = 0;
    int scoreB = 0;
    int numberOFaulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void pointA(View v) {
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }


    public void faulA(View v) {
        numberOFaulsA++;
        displayFaulsForTeamA(numberOFaulsA);
    }
    public void displayFaulsForTeamA(int numberOFaulsA){
        TextView faulsViewA =(TextView) findViewById(R.id.team_a_fouls);
        faulsViewA.setText(String.valueOf(numberOFaulsA));
    }


    public void pointB(View v) {
        scoreB++;
        displayForTeamB(scoreB);
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }


    public void faulB(View v) {
        numberOFaulsB++;
        displayFaulsForTeamB(numberOFaulsB);
    }
    public void displayFaulsForTeamB(int numberOFaulsB){
        TextView faulsViewB =(TextView) findViewById(R.id.team_b_fouls);
        faulsViewB.setText(String.valueOf(numberOFaulsB));
    }




    public void resetScore(View v){
        scoreA=0;
        numberOFaulsA=0;
        scoreB=0;
        numberOFaulsB=0;
        displayForTeamA(scoreA);
        displayFaulsForTeamA(numberOFaulsA);
        displayForTeamB(scoreB);
        displayFaulsForTeamB(numberOFaulsB);
    }
}
