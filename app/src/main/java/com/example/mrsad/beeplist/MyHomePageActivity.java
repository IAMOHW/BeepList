package com.example.mrsad.beeplist;


import android.app.Activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyHomePageActivity extends AppCompatActivity {

    private String [] data= {"收藏夹","今天","今天后7天"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home_page);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( MyHomePageActivity.this,
                android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }


//        ActionBar actionBar = getSupportActionBar();
//        if(actionBar != null){
//            actionBar.hide();
//        }
}


