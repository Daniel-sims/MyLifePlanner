package com.mylifeplannerco.mylifeplanner.DataProvider;

import android.content.Context;
import android.content.Intent;

import com.mylifeplannerco.mylifeplanner.Activities.Exercise.ExerciseActivity;
import com.mylifeplannerco.mylifeplanner.Models.Exercise;
import com.mylifeplannerco.mylifeplanner.Models.ExerciseRoutine;
import com.mylifeplannerco.mylifeplanner.Models.Feature;
import com.mylifeplannerco.mylifeplanner.Models.WorkoutDay;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MockDataProvider {
    private Context mContext;

    public MockDataProvider(Context context){
        mContext = context;
    }

    public List<Feature> getFeatures(){
        List<Feature> features = new ArrayList<>();

        Intent exerciseIntent = new Intent(mContext, ExerciseActivity.class);
        features.add(new Feature("Health And Fitness", "Track your workouts and weight", "Use this to create, follow and track your workouts along with how you’re progressing.", "Go To Health And Fitness", exerciseIntent));

        return features;
    }

    public List<ExerciseRoutine> getExerciseRoutines(){
        List<ExerciseRoutine> exerciseRoutines = new ArrayList<>();

        exerciseRoutines.add(getExerciseRoutineOne());
        exerciseRoutines.add(getExerciseRoutineTwo());

        return exerciseRoutines;
    }

    //Statically allocated UUIDS until I can turn this into a singleton as randomUUID()
    //will create a new one in every onCreate()
    private ExerciseRoutine getExerciseRoutineOne(){
        UUID exerciseRoutineUUID = UUID.fromString("e22ae2a6-57af-11e8-9c2d-fa7ae01bbebc");
        return new ExerciseRoutine(exerciseRoutineUUID, "Push, Pull, Legs", getPPLWorkoutDays(exerciseRoutineUUID));
    }

    private ExerciseRoutine getExerciseRoutineTwo(){
        UUID exerciseRoutineUUID = UUID.fromString("0c084a0a-57b0-11e8-9c2d-fa7ae01bbebc");
        return new ExerciseRoutine(exerciseRoutineUUID,"BroSplit", getBroSplitWorkoutDays(exerciseRoutineUUID));
    }

    private List<WorkoutDay> getPPLWorkoutDays(UUID uuid){
        List<WorkoutDay> workoutDays = new ArrayList<>();

        workoutDays.add(new WorkoutDay(uuid,"Push", "Day One", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Pull", "Day Two", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Legs", "Day Three", getExercisesOne(uuid)));

        return workoutDays;
    }

    private List<WorkoutDay> getBroSplitWorkoutDays(UUID uuid){
        List<WorkoutDay> workoutDays = new ArrayList<>();

        workoutDays.add(new WorkoutDay(uuid,"Chest", "Day One", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Back", "Day Two", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Shoulders", "Day Three", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Arms", "Day Three", getExercisesOne(uuid)));
        workoutDays.add(new WorkoutDay(uuid,"Legs", "Day Three", getExercisesOne(uuid)));

        return workoutDays;
    }


    private List<Exercise> getExercisesOne(UUID uuid){
        List<Exercise> exercises = new ArrayList<>();

        exercises.add(new Exercise(uuid, "Bench press", "Push bar from chest upwards", 5, 5, 60));
        exercises.add(new Exercise(uuid, "Dumbbell press", "Use bench and push with chest", 5, 5, 60));
        exercises.add(new Exercise(uuid, "Dumbell flies", "Use dumbells on a bench to do a flapping movement, flap flap", 5, 5, 60));
        exercises.add(new Exercise(uuid, "Rope pushdowns", "Using cables push ropes down...", 5, 5, 60));
        exercises.add(new Exercise(uuid, "Rope overheads", "Using cables push ropes up...", 5, 5, 60));

        return exercises;
    }



}
