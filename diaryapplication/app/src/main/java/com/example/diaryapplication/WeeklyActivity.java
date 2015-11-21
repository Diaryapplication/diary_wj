package com.example.diaryapplication;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.TabHost;

public class WeeklyActivity extends TabActivity {
    TabHost mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        TabHost mTab = getTabHost();
        TabHost.TabSpec spec;
        LayoutInflater.from(this).inflate(R.layout.activity_weekly, mTab.getTabContentView(), true);

        spec = mTab.newTabSpec("tab1").setIndicator("일").setContent(R.id.view1);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab2").setIndicator("월").setContent(R.id.view2);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab3").setIndicator("화").setContent(R.id.view3);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab4").setIndicator("수").setContent(R.id.view4);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab5").setIndicator("목").setContent(R.id.view5);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab6").setIndicator("금").setContent(R.id.view6);
        mTab.addTab(spec);

        spec = mTab.newTabSpec("tab7").setIndicator("일").setContent(R.id.view7);
        mTab.addTab(spec);


    }
}
