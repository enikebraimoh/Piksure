package com.enike.piksure;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Welcome_Activity extends AppCompatActivity {

    ViewPager mViewPager;
    WelcomeScreenAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_);

        List<WelcomeScreenModel> model = new ArrayList<>();

        model.add(new WelcomeScreenModel(R.drawable.download));

        model.add(new WelcomeScreenModel(R.drawable.download));

        model.add(new WelcomeScreenModel(R.drawable.download));



        mViewPager.findViewById(R.id.mviewpager);
        mAdapter = new WelcomeScreenAdapter(this,model);
        mViewPager.setAdapter(mAdapter);

    }
}