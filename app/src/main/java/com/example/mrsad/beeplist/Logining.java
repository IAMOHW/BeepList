package com.example.mrsad.beeplist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Project name:BeepList
 * Created by Mr.Sad on 2017/5/14.
 */

public class Logining extends Activity {

    private Button login_come;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logining);

        login_come = (Button) findViewById(R.id.login_comein_id);
        login_come.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Logining.this,MyHomePageActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
