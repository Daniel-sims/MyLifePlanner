package com.mylifeplannerco.mylifeplanner.Models;

public class Feature {

    private String mTitle;
    private String mSubTitle;
    private String mDescription;
    private String mActionText;

    public Feature(String title, String subTitle, String description, String actionText){
        mTitle = title;
        mSubTitle = subTitle;
        mDescription = description;
        mActionText = actionText;
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
}
