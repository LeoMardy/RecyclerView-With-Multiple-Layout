package com.example.multiviewrecyclerview;

public class Model_Class {

    public static final int USER_INFO_LAYOUT = 0;
    public static final int IMAGE_LAYOUT = 1;
    public static final int ADS_LAYOUT = 2;


    /*------------------------ Common Parameter -----------------------------*/
    int ViewType;

    public int getViewType() {
        return ViewType;
    }

    public void setViewType(int viewType) {
        ViewType = viewType;
    }

    /*------------------------ Profile Layout -----------------------------*/
    int profile_Image;
    String profile_Title;
    String profile_Description;

    public Model_Class(int ViewType,int profile_Image, String profile_Title, String profile_Description){
        this.profile_Image= profile_Image;
        this.profile_Title = profile_Title;
        this.profile_Description = profile_Description;
        this.ViewType = ViewType;
    }

    public int getProfile_Image() {
        return profile_Image;
    }

    public void setProfile_Image(int profile_Image) {
        this.profile_Image = profile_Image;
    }

    public String getProfile_Title() {
        return profile_Title;
    }

    public void setProfile_Title(String profile_Title) {
        this.profile_Title = profile_Title;
    }

    public String getProfile_Description() {
        return profile_Description;
    }

    public void setProfile_Description(String profile_Description) {
        this.profile_Description = profile_Description;
    }

    /*----------------------------- Image Layout ---------------------------------*/

    int image;

    public Model_Class(int ViewType,int image){
        this.image = image;
        this.ViewType = ViewType;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    /*----------------------------- Ads Layout ---------------------------------*/

    String Ads;

    public Model_Class(int ViewType,String Ads){
        this.Ads = Ads;
        this.ViewType = ViewType;
    }

    public String getAds() {
        return Ads;
    }

    public void setAds(String ads) {
        Ads = ads;
    }
}
