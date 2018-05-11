package com.mylifeplannerco.mylifeplanner.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mylifeplannerco.mylifeplanner.Models.Feature;
import com.mylifeplannerco.mylifeplanner.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FeaturesAdapter extends RecyclerView.Adapter<FeaturesAdapter.FeaturesViewHolder>{
    private Context mContext;
    private List<Feature> mFeatures;

    public class FeaturesViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.feature_title) TextView title;
        @BindView(R.id.feature_sub_title)  TextView subTitle;
        @BindView(R.id.feature_description)  TextView description;
        @BindView(R.id.feature_action_text) TextView actionText;

        public Intent mActionIntent;

        public FeaturesViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.feature_action_text)
        public void onActionClicked(View view){
            mContext.startActivity(mActionIntent);
        }
    }

    public FeaturesAdapter(Context context, List<Feature> features){
        mContext = context;
        mFeatures = features;
    }

    @Override
    public FeaturesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FeaturesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_card, parent, false));
    }

    @Override
    public void onBindViewHolder(FeaturesViewHolder holder, int position) {
        Feature feature = mFeatures.get(position);

        holder.title.setText(feature.getTitle());
        holder.subTitle.setText(feature.getSubTitle());
        holder.description.setText(feature.getDescription());
        holder.actionText.setText(feature.getActionText());
        holder.mActionIntent = feature.getIntentAction();
    }

    @Override
    public int getItemCount() {
        return mFeatures.size();
    }
}
