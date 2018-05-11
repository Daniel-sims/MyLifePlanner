package com.mylifeplannerco.mylifeplanner.Models;

import java.util.List;

public class ExerciseRoutine {
    private int mRoutineId;
    private String mRoutineTitle;
    private List<WorkoutDay> mWorkoutDays;

    public ExerciseRoutine(int routineId, String routineTitle, List<WorkoutDay> workoutDays){
        mRoutineId = routineId;
        mRoutineTitle = routineTitle;

        mWorkoutDays = workoutDays;
    }

    public String getRoutineTitle() {
        return mRoutineTitle;
    }

    public void setRoutineTitle(String routineTitle) {
        mRoutineTitle = routineTitle;
    }

    public int getRoutineId() {
        return mRoutineId;
    }

    public void setRoutineId(int routineId) {
        mRoutineId = routineId;
    }

    public List<WorkoutDay> getWorkoutDays() {
        return mWorkoutDays;
    }

    public void setWorkoutDays(List<WorkoutDay> workoutDays) {
        mWorkoutDays = workoutDays;
    }


}
