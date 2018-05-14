package com.mylifeplannerco.mylifeplanner.Models;

import java.util.UUID;

public class Exercise {
    private UUID mExerciseId;
    private String mExerciseName;
    private String mDescription;
    private long mReps;
    private long mSets;
    private long mRestPeriod;

    public Exercise(UUID exerciseId, String exerciseName, String description, long reps, long sets, long restPeriod) {
        mExerciseId = exerciseId;
        mExerciseName = exerciseName;
        mDescription = description;
        mReps = reps;
        mSets = sets;
        mRestPeriod = restPeriod;
    }


    public String getExerciseName() {
        return mExerciseName;
    }

    public void setExerciseName(String exerciseName) {
        mExerciseName = exerciseName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public long getReps() {
        return mReps;
    }

    public void setReps(long reps) {
        mReps = reps;
    }

    public long getSets() {
        return mSets;
    }

    public void setSets(long sets) {
        mSets = sets;
    }

    public long getRestPeriod() {
        return mRestPeriod;
    }

    public void setRestPeriod(long restPeriod) {
        mRestPeriod = restPeriod;
    }

}
