package com.mylifeplannerco.mylifeplanner.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mylifeplannerco.mylifeplanner.Models.WorkoutDay;
import com.mylifeplannerco.mylifeplanner.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WorkoutDaysAdapter extends RecyclerView.Adapter<WorkoutDaysAdapter.WorkoutDaysViewHolder>{
    private Context mContext;
    private List<WorkoutDay> mWorkoutDays;

    public class WorkoutDaysViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.workout_day_title) TextView mWorkoutDayTitle;

        public WorkoutDaysViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bind(WorkoutDay workoutDay){
            mWorkoutDayTitle.setText(workoutDay.getWorkoutTitle());
        }
    }

    public WorkoutDaysAdapter(Context context, List<WorkoutDay> workoutDays){
        mContext = context;
        mWorkoutDays = workoutDays;
    }

    @Override
    public WorkoutDaysAdapter.WorkoutDaysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WorkoutDaysAdapter.WorkoutDaysViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.workout_day_card, parent, false));
    }

    @Override
    public void onBindViewHolder(WorkoutDaysAdapter.WorkoutDaysViewHolder holder, int position) {
        holder.bind(mWorkoutDays.get(position));
    }

    @Override
    public int getItemCount() {
        return mWorkoutDays.size();
    }
}
