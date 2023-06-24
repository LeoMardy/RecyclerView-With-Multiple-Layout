package com.example.multiviewrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model_Class> MyArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager= new LinearLayoutManager(MainActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        itemList();

        MyAdapter myAdapter = new MyAdapter(MyArrayList);
        recyclerView.setAdapter(myAdapter);

    }
    private void itemList (){
        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.images,"Leo Mardy","Professional Native Android Application Software Developer"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.o));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.social_app));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.images,"Pius Mardy","Professional Digital Marketer "));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.w));

        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.x,"MD.Asif Hossain","Professional Responsive Web Application Developer"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.z));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.images));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.w,"MD.Srizon","Professional Digital Creator and Management Expert "));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.setu));

        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.setu,"MD Delowar Hossain","Professional Native Android Application Software Developer"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.j));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.x));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.sk,"Sivam Raj","Professional Website Developer "));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.w));

        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.images,"MD.Linkon ","Professional Python Developer"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.z));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.w));
        MyArrayList.add(new Model_Class(Model_Class.ADS_LAYOUT,"Show Ads"));
        MyArrayList.add(new Model_Class(Model_Class.USER_INFO_LAYOUT,R.drawable.engineer,"MD.Riyad ","Professional Mechanical Engineer"));
        MyArrayList.add(new Model_Class(Model_Class.IMAGE_LAYOUT,R.drawable.setu));


    }
}