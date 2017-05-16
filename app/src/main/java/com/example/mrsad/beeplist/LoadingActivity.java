package com.example.mrsad.beeplist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;


/**
 * Project name:BeepList
 * Created by Mr.Sad on 2017/5/14.
 */

public class LoadingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        Intent intent = new Intent(LoadingActivity.this, LoginPage.class);
        startActivity(intent);
        finish();



    }
}

