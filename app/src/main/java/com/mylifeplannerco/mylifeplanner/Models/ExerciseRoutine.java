package com.mylifeplannerco.mylifeplanner.Models;

import java.util.List;
import java.util.UUID;

public class ExerciseRoutine {
    private UUID mRoutineId;

    private String mRoutineTitle;
    private List<WorkoutDay> mWorkoutDays;

    public ExerciseRoutine(UUID routineId, String routineTitle, List<WorkoutDay> workoutDays){
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

    public UUID getRoutineId() {
        return mRoutineId;
    }

    public void setRoutineId(UUID routineId) {
        mRoutineId = routineId;
    }

    public List<WorkoutDay> getWorkoutDays() {
        return mWorkoutDays;
    }

    public void setWorkoutDays(List<WorkoutDay> workoutDays) {
        mWorkoutDays = workoutDays;
    }


}
