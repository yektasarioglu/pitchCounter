package com.example.yekta.pitchcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int team0 = 0;
    private int team1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreForTeam0(View view){
        team0++;
        displayScoreForTeam0(team0);
    }

    public void scoreForTeam1(View view){
        team1++;
        displayScoreForTeam1(team1);
    }

    private void displayScoreForTeam0(int score){
        TextView scoreview = (TextView) findViewById(R.id.button_team_a);
        scoreview.setText(String.valueOf(score));
    }

    private void displayScoreForTeam1(int score){
        TextView scoreview = (TextView) findViewById(R.id.button_team_b);
        scoreview.setText(String.valueOf(score));
    }
}
