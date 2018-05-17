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
        @BindView(R.id.feature_title) TextView mTitle;
        @BindView(R.id.feature_sub_title)  TextView mSubTitle;
        @BindView(R.id.feature_description)  TextView mDescription;
        @BindView(R.id.feature_action_text) TextView mActionText;

        public Intent mActionIntent;

        public FeaturesViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }

        public void bind(Feature feature){
            mTitle.setText(feature.getTitle());
            mSubTitle.setText(feature.getSubTitle());
            mDescription.setText(feature.getDescription());
            mActionText.setText(feature.getActionText());
            mActionIntent = feature.getIntentAction();
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
        return new FeaturesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_feature, parent, false));
    }

    @Override
    public void onBindViewHolder(FeaturesViewHolder holder, int position) {
        holder.bind(mFeatures.get(position));
    }

    @Override
    public int getItemCount() {
        return mFeatures.size();
    }
}
