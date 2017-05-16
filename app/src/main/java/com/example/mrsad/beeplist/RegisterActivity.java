package com.example.mrsad.beeplist;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Project name:BeepList
 * Created by Mr.Sad on 2017/5/14.
 */

public class RegisterActivity extends Activity{
    private Button registerB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        registerB = (Button)findViewById(R.id.subumit_register_button);
        registerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(RegisterActivity.this);
                progressDialog.setTitle("");
                progressDialog.setMessage("注册成功，即将跳转到首页");
                progressDialog.setCancelable(true);
                progressDialog.show();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(RegisterActivity.this,MyHomePageActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
