package com.mylifeplannerco.mylifeplanner.Models;

import android.app.PendingIntent;

public class Feature {

    private String mTitle;
    private String mSubTitle;
    private String mDescription;
    private String mActionText;
    private PendingIntent mIntentAction;

    public Feature(String title, String subTitle, String description, String actionText, PendingIntent intentAction){
        mTitle = title;
        mSubTitle = subTitle;
        mDescription = description;
        mActionText = actionText;

        mIntentAction = intentAction;
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

    public PendingIntent getIntentAction() {
        return mIntentAction;
    }

    public void setIntentAction(PendingIntent intentAction) {
        mIntentAction = intentAction;
    }
}
