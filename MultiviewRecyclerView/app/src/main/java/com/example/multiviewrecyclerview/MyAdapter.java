package com.example.multiviewrecyclerview;

import static com.example.multiviewrecyclerview.Model_Class.ADS_LAYOUT;
import static com.example.multiviewrecyclerview.Model_Class.IMAGE_LAYOUT;
import static com.example.multiviewrecyclerview.Model_Class.USER_INFO_LAYOUT;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public  class MyAdapter extends RecyclerView.Adapter {

    /*----------------------All Data received -----------------------*/
    private final ArrayList<Model_Class> MyDataArrayList;

    public MyAdapter(ArrayList<Model_Class> myDataArrayList) {
        MyDataArrayList = myDataArrayList;
    }

    /*----------------------All Holders -----------------------*/
private static class MyProfileLayout_Holder extends RecyclerView.ViewHolder{

    CircleImageView circleImageView;
    MaterialTextView recycler_TextViewHeader,recycler_TextViewDesc;

    public MyProfileLayout_Holder(@NonNull View itemView) {
        super(itemView);

        circleImageView = itemView.findViewById(R.id.CircleImageView);
        recycler_TextViewHeader = itemView.findViewById(R.id.recycler_TextViewHeader);
        recycler_TextViewDesc = itemView.findViewById(R.id.recycler_TextViewDesc);
    }
    private void setProfileLayout_Data(int profilePhoto, String headerText, String DescText){
        circleImageView.setImageResource(profilePhoto);
        recycler_TextViewHeader.setText(headerText);
        recycler_TextViewDesc.setText(DescText);
    }
}

private static class MyImageLayout_Holder extends RecyclerView.ViewHolder{

    ImageView imageView;
    public MyImageLayout_Holder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
    }
    private void setImageView_Data (int img){
        imageView.setImageResource(img);
    }
}

private static class MyAdsLayout_Holder extends RecyclerView.ViewHolder{

    TextView AdstextView;
    public MyAdsLayout_Holder(@NonNull View itemView) {
        super(itemView);
        AdstextView = itemView.findViewById(R.id.AdstextView);
    }
    private void setAdstextView_Data(String adstext){
        AdstextView.setText(adstext);
    }
}

    @Override
    public int getItemViewType(int position) {

    switch (MyDataArrayList.get(position).getViewType()){
        case 0:
            return USER_INFO_LAYOUT;
        case 1:
            return IMAGE_LAYOUT;
        case 2:
            return ADS_LAYOUT;
        default:
            return -1;

    }

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    switch (viewType){
        case USER_INFO_LAYOUT:
            View userInfoLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row_xml_design,parent,false);
            return new MyProfileLayout_Holder(userInfoLayout);
        case IMAGE_LAYOUT:
            View imageLayut = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_layout,parent,false);
            return new MyImageLayout_Holder(imageLayut);
        case ADS_LAYOUT:
            View AdsLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.ad_layout,parent,false);
            return new MyAdsLayout_Holder(AdsLayout);

        default:
            return null;

    }

}

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    switch (MyDataArrayList.get(position).getViewType()){
        case USER_INFO_LAYOUT:
            int pImage = MyDataArrayList.get(position).getProfile_Image();
            String pTitle = MyDataArrayList.get(position).getProfile_Title();
            String pDesc = MyDataArrayList.get(position).getProfile_Description();

            ((MyProfileLayout_Holder)holder).setProfileLayout_Data(pImage,pTitle,pDesc);
            break;

        case IMAGE_LAYOUT:
            int image = MyDataArrayList.get(position).getImage();

            ((MyImageLayout_Holder)holder).setImageView_Data(image);
            break;

        case ADS_LAYOUT:
            String adstext = MyDataArrayList.get(position).getAds();

            ((MyAdsLayout_Holder)holder).setAdstextView_Data(adstext);
            break;

    }

}

    @Override
    public int getItemCount() {
        return MyDataArrayList.size();
    }
}
