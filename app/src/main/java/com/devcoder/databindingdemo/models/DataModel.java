package com.devcoder.databindingdemo.models;

public class DataModel {

    public String androidVersion, androidName;

    public DataModel(String androidName, String androidVersion) {

        this.androidName = androidName;
        this.androidVersion = androidVersion;
    }

    public String getAndroidVersion() {
        return androidVersion;
    }

    public void setAndroidVersion(String androidVersion) {
        this.androidVersion = androidVersion;
    }

    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
    }
}