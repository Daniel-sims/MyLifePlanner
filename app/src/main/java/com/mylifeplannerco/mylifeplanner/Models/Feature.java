package com.mylifeplannerco.mylifeplanner.Models;

import android.content.Intent;

public class Feature {

    private String mTitle;
    private String mSubTitle;
    private String mDescription;
    private String mActionText;
    private Intent mActionIntent;

    public Feature(String title, String subTitle, String description, String actionText, Intent actionIntent){
        mTitle = title;
        mSubTitle = subTitle;
        mDescription = description;
        mActionText = actionText;
        mActionIntent = actionIntent;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(String subTitle) {
        mSubTitle = subTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getActionText() {
        return mActionText;
    }

    public void setActionText(String actionText) {
        mActionText = actionText;
    }

    public Intent getIntentAction() {
        return mActionIntent;
    }

    public void setIntentAction(Intent intentAction) {
        mActionIntent = intentAction;
    }
}
