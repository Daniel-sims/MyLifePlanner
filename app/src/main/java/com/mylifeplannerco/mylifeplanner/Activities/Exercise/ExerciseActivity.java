package com.mylifeplannerco.mylifeplanner.Activities.Exercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mylifeplannerco.mylifeplanner.Adapters.ExerciseRoutineAdapter;
import com.mylifeplannerco.mylifeplanner.DataProvider.MockDataProvider;
import com.mylifeplannerco.mylifeplanner.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExerciseActivity extends AppCompatActivity {
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
}