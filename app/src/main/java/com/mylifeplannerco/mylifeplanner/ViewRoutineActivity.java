package com.mylifeplannerco.mylifeplanner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mylifeplannerco.mylifeplanner.Adapters.WorkoutDaysAdapter;
import com.mylifeplannerco.mylifeplanner.Models.ExerciseRoutine;
import com.mylifeplannerco.mylifeplanner.Models.WorkoutDay;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewRoutineActivity extends AppCompatActivity {
    private static String ROUTINE_ID_TAG = "MyLifePlanner.ROUTINEID";

    private long mRoutineId;
    private List<WorkoutDay> mWorkoutDays;

    @BindView(R.id.workout_days_reycler_view)
    RecyclerView mWorkoutDaysRecyclerView;

    public static Intent newViewRoutineIntent(Context context, long routineId){
        Intent intent = new Intent(context, ViewRoutineActivity.class);
        intent.putExtra(ROUTINE_ID_TAG, routineId);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_routine);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        mRoutineId = (long) intent.getSerializableExtra(ROUTINE_ID_TAG);


        //Replace this with something nicer than this (I hope Java has something
        // nicer than this atleast this is a 1 line linq query normally :( )
        MockDataProvider mockDataProvider = new MockDataProvider(this);
        List<ExerciseRoutine> exerciseRoutines = mockDataProvider.getExerciseRoutines();

        for (ExerciseRoutine routine : exerciseRoutines){
            if(routine.getRoutineId() == mRoutineId){
                mWorkoutDays = routine.getWorkoutDays();
            }
        }

        // WorkoutDays RecyclerView Setup
        mWorkoutDaysRecyclerView.setHasFixedSize(true);
        mWorkoutDaysRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mWorkoutDaysRecyclerView.setAdapter(new WorkoutDaysAdapter(this, mWorkoutDays));
    }
}
