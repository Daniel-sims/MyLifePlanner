package com.mylifeplannerco.mylifeplanner;

import android.content.Context;
import android.content.Intent;

import com.mylifeplannerco.mylifeplanner.Models.Exercise;
import com.mylifeplannerco.mylifeplanner.Models.ExerciseRoutine;
import com.mylifeplannerco.mylifeplanner.Models.Feature;
import com.mylifeplannerco.mylifeplanner.Models.WorkoutDay;

import java.util.ArrayList;
import java.util.List;

public class MockDataProvider {
    private Context mContext;

    public MockDataProvider(Context context){
        mContext = context;
    }

    public List<Feature> getFeatures(){
        List<Feature> features = new ArrayList<>();

        Intent exerciseIntent = new Intent(mContext, ExerciseActivity.class);
        features.add(new Feature("Exercise", "Push Day", "Your exercise routine for today is Push.", "View Exercise", exerciseIntent));

        return features;
    }

    public List<ExerciseRoutine> getExerciseRoutines(){
        List<ExerciseRoutine> exerciseRoutines = new ArrayList<>();

        exerciseRoutines.add(getExerciseRoutineOne());
        exerciseRoutines.add(getExerciseRoutineTwo());

        return exerciseRoutines;
    }

    private ExerciseRoutine getExerciseRoutineOne(){
        return new ExerciseRoutine(1, "Push, Pull, Legs", getPPLWorkoutDays());
    }

    private ExerciseRoutine getExerciseRoutineTwo(){
        return new ExerciseRoutine(2, "BroSplit", getBroSplitWorkoutDays());
    }

    private List<WorkoutDay> getPPLWorkoutDays(){
        List<WorkoutDay> workoutDays = new ArrayList<>();

        workoutDays.add(new WorkoutDay("Push", "Day One", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Pull", "Day Two", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Legs", "Day Three", getExercisesOne()));

        return workoutDays;
    }

    private List<WorkoutDay> getBroSplitWorkoutDays(){
        List<WorkoutDay> workoutDays = new ArrayList<>();

        workoutDays.add(new WorkoutDay("Chest", "Day One", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Back", "Day Two", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Shoulders", "Day Three", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Arms", "Day Three", getExercisesOne()));
        workoutDays.add(new WorkoutDay("Legs", "Day Three", getExercisesOne()));

        return workoutDays;
    }


    private List<Exercise> getExercisesOne(){
        List<Exercise> exercises = new ArrayList<>();

        exercises.add(new Exercise("Bench press", "Push bar from chest upwards", 5, 5, 60));
        exercises.add(new Exercise("Dumbbell press", "Use bench and push with chest", 5, 5, 60));
        exercises.add(new Exercise("Dumbell flies", "Use dumbells on a bench to do a flapping movement, flap flap", 5, 5, 60));
        exercises.add(new Exercise("Rope pushdowns", "Using cables push ropes down...", 5, 5, 60));
        exercises.add(new Exercise("Rope overheads", "Using cables push ropes up...", 5, 5, 60));

        return exercises;
    }



}
