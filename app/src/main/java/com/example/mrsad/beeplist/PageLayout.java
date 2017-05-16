package com.example.mrsad.beeplist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Project name:BeepList
 * Created by Mr.Sad on 2017/5/14.
 */

public class PageLayout extends LinearLayout {
    public PageLayout(final Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        ImageButton backicon = (ImageButton) findViewById(R.id.page_back);
        ImageButton nexticon = (ImageButton) findViewById(R.id.page_next);
        ImageView homeicon = (ImageView) findViewById(R.id.home_img);

        backicon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish(); //返回上一个页面
            }
        });
        nexticon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,LoginPage.class);
                context.startActivity(intent);
            }
        });

        homeicon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable drawable = getResources().getDrawable(R.drawable.icon_car_sel);

            }
        });
    }
}
