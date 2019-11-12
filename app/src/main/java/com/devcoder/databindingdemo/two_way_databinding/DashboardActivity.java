package com.devcoder.databindingdemo.two_way_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.devcoder.databindingdemo.R;
import com.devcoder.databindingdemo.databinding.ActivityDashboardBinding;
import com.devcoder.databindingdemo.databinding.ActivityMainBinding;

public class DashboardActivity extends AppCompatActivity {
private ActivityDashboardBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_dashboard);
        activityMainBinding.setLifecycleOwner(this);

    }
}
