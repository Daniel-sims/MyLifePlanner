package com.mylifeplannerco.mylifeplanner.Models;

public class Exercise {
    private String mExerciseName;
    private String mDescription;
    private long mReps;
    private long mSets;
    private long mRestPeriod;

    public Exercise(String exerciseName, String description, long reps, long sets, long restPeriod) {
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
