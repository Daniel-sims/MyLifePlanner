package com.mylifeplannerco.mylifeplanner.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mylifeplannerco.mylifeplanner.Models.Exercise;
import com.mylifeplannerco.mylifeplanner.R;

import java.util.List;

import butterknife.ButterKnife;

public class ExercisesAdapter extends RecyclerView.Adapter<ExercisesAdapter.ExerciseViewHolder>{
    private Context mContext;
    private List<Exercise> mExericses;

    public class ExerciseViewHolder extends RecyclerView.ViewHolder {

        public ExerciseViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bind(Exercise exercise){

        }
    }

    public ExercisesAdapter(Context context, List<Exercise> exercises){
        mContext = context;
        mExericses = exercises;
    }

    @Override
    public ExercisesAdapter.ExerciseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExercisesAdapter.ExerciseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_workout_day, parent, false));
    }

    @Override
    public void onBindViewHolder(ExercisesAdapter.ExerciseViewHolder holder, int position) {
        holder.bind(mExericses.get(position));
    }

    @Override
    public int getItemCount() {
        return mExericses.size();
    }
}
