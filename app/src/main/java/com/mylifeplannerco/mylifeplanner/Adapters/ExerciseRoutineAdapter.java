package com.mylifeplannerco.mylifeplanner.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mylifeplannerco.mylifeplanner.Activities.Exercise.ViewRoutineActivity;
import com.mylifeplannerco.mylifeplanner.Models.ExerciseRoutine;
import com.mylifeplannerco.mylifeplanner.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExerciseRoutineAdapter extends RecyclerView.Adapter<ExerciseRoutineAdapter.ExerciseRoutineViewHolder>{
    private Context mContext;
    private List<ExerciseRoutine> mExerciseRoutines;

    public class ExerciseRoutineViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.exercise_routine_title) TextView mExerciseRoutineTitle;

        public Intent mViewRoutineIntent;

        public ExerciseRoutineViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bind(ExerciseRoutine exerciseRoutine){
            mExerciseRoutineTitle.setText(exerciseRoutine.getRoutineTitle());
            mViewRoutineIntent = ViewRoutineActivity.newViewRoutineIntent(mContext, exerciseRoutine.getRoutineId());
        }

        @OnClick()
        public void onRoutineCardClicked(View view){
            mContext.startActivity(mViewRoutineIntent);
        }
    }

    public ExerciseRoutineAdapter(Context context, List<ExerciseRoutine> exerciseRoutines){
        mContext = context;
        mExerciseRoutines = exerciseRoutines;
    }

    @Override
    public ExerciseRoutineAdapter.ExerciseRoutineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExerciseRoutineAdapter.ExerciseRoutineViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_exercise_routine, parent, false));
    }

    @Override
    public void onBindViewHolder(ExerciseRoutineAdapter.ExerciseRoutineViewHolder holder, int position) {
        holder.bind(mExerciseRoutines.get(position));
    }

    @Override
    public int getItemCount() {
        return mExerciseRoutines.size();
    }
}
