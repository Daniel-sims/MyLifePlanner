package com.mylifeplannerco.mylifeplanner.Models;

import java.util.List;

public class WorkoutDay {
    private String mWorkoutTitle;
    private String mWorkoutDay;
    private List<Exercise> mExercises;

    public WorkoutDay(String workoutTitle, String workoutDay, List<Exercise> exercises){
        mWorkoutTitle = workoutTitle;
        mWorkoutDay = workoutDay;
        mExercises = exercises;
    }

    public String getWorkoutTitle() {
        return mWorkoutTitle;
    }

    public void setWorkoutTitle(String workoutTitle) {
        mWorkoutTitle = workoutTitle;
    }

    public String getWorkoutDay() {
        return mWorkoutDay;
    }

    public void setWorkoutDay(String workoutDay) {
        mWorkoutDay = workoutDay;
    }

    public List<Exercise> getExercises() {
        return mExercises;
    }

    public void setExercises(List<Exercise> exercises) {
        mExercises = exercises;
    }
}
