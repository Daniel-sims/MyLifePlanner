package com.mylifeplannerco.mylifeplanner.Activities.Exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mylifeplannerco.mylifeplanner.R;

import butterknife.ButterKnife;

public class ViewWorkoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        ButterKnife.bind(this);

    }
}
