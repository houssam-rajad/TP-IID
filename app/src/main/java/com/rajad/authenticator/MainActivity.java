package com.rajad.authenticator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rajad.authenticator.databinding.ActivityCallBinding;
import com.rajad.authenticator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
    }


    public void gotoCallActivity(View view) {
        startActivity(new Intent(this,CallActivity.class));
    }

    public void gotoMailActivity(View view) {
        startActivity(new Intent(this,MailActivity.class));
    }
}