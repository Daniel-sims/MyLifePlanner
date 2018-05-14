package com.mylifeplannerco.mylifeplanner.Models;

import java.util.List;
import java.util.UUID;

public class WorkoutDay {
    private UUID mWorkoutDayId;
    private List<Exercise> mExercises;
    private String mWorkoutTitle;
    private String mWorkoutDay;

    public WorkoutDay(UUID workoutDayId, String workoutTitle, String workoutDay, List<Exercise> exercises){
        mWorkoutDayId = workoutDayId;

        mWorkoutTitle = workoutTitle;
        mWorkoutDay = workoutDay;
        mExercises = exercises;
    }

    public UUID getWorkoutDayId() {
        return mWorkoutDayId;
    }

    public void setWorkoutDayId(UUID workoutDayId) {
        mWorkoutDayId = workoutDayId;
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
