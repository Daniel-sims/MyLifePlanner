package com.mylifeplannerco.mylifeplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mylifeplannerco.mylifeplanner.Adapters.ExerciseRoutineAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExerciseActivity extends AppCompatActivity {

            @BindView(R.id.new_routine_fab)
            FloatingActionButton mNewRoutineFab;

            @BindView(R.id.routines_recycler_view)
            RecyclerView mRoutinesRecylcerView;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_exercise);

                ButterKnife.bind(this);

        // Feature RecyclerView Setup
        mRoutinesRecylcerView.setHasFixedSize(true);
        mRoutinesRecylcerView.setLayoutManager(new LinearLayoutManager(this));

        //Mock Data provider used for now
        MockDataProvider mockDataProvider = new MockDataProvider(this);
        mRoutinesRecylcerView.setAdapter(new ExerciseRoutineAdapter(this, mockDataProvider.getExerciseRoutines()));
    }

    @OnClick(R.id.new_routine_fab)
    public void onNewRoutineClick(View view){
        startActivity(new Intent(this, NewRoutineActivity.class));
    }

}
