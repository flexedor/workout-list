package com.example.fedor.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_WORKOUT_ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        workoutDetailFragment frag = (workoutDetailFragment)getSupportFragmentManager().findFragmentById(R.id.detail_flag);
       int workoutId =(int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
       frag.setWorkout(workoutId);
    }
}
