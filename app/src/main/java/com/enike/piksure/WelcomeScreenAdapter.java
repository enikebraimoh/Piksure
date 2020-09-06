package com.enike.piksure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class WelcomeScreenAdapter extends PagerAdapter {

    Context mContext;
    List<WelcomeScreenModel> model;

    public WelcomeScreenAdapter(Context context, List<WelcomeScreenModel> model) {
        mContext = context;
        this.model = model;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =  layoutInflater.inflate(R.layout.welcome_layouts,container,false);

        ImageView image = view.findViewById(R.id.dimage);
        image.setImageResource(model.get(position).getImage());

        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view  == (RelativeLayout) object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
