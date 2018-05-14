package com.mylifeplannerco.mylifeplanner.Activities.Exercise;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mylifeplannerco.mylifeplanner.Adapters.WorkoutDaysAdapter;
import com.mylifeplannerco.mylifeplanner.DataProvider.MockDataProvider;
import com.mylifeplannerco.mylifeplanner.Models.ExerciseRoutine;
import com.mylifeplannerco.mylifeplanner.Models.WorkoutDay;
import com.mylifeplannerco.mylifeplanner.R;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewRoutineActivity extends AppCompatActivity {
    private static String ROUTINE_ID_TAG = "MyLifePlanner.ROUTINEID";

    private UUID mRoutineId;
    private List<WorkoutDay> mWorkoutDays;

    @BindView(R.id.workout_days_reycler_view)
    RecyclerView mWorkoutDaysRecyclerView;

    public static Intent newViewRoutineIntent(Context context, UUID routineId){
        Intent intent = new Intent(context, com.mylifeplannerco.mylifeplanner.Activities.Exercise.ViewRoutineActivity.class);
        intent.putExtra(ROUTINE_ID_TAG, routineId);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_routine);

        ButterKnife.bind(this);

        mRoutineId = (UUID) getIntent().getSerializableExtra(ROUTINE_ID_TAG);

        //Replace this with something nicer than this (I hope Java has something
        // nicer than this at least this is a 1 line linq query normally :( )
        mWorkoutDays = new ArrayList<>();
        MockDataProvider mockDataProvider = new MockDataProvider(this);
        for (ExerciseRoutine routine : mockDataProvider.getExerciseRoutines()){
            if(routine.getRoutineId().equals(mRoutineId)){
                mWorkoutDays = routine.getWorkoutDays();
            }
        }

        // WorkoutDays RecyclerView Setup
        mWorkoutDaysRecyclerView.setHasFixedSize(true);
        mWorkoutDaysRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mWorkoutDaysRecyclerView.setAdapter(new WorkoutDaysAdapter(this, mWorkoutDays));
    }
}
