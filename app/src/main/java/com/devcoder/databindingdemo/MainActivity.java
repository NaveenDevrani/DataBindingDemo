package com.devcoder.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.devcoder.databindingdemo.adapters.MyAdapter;
import com.devcoder.databindingdemo.databinding.ActivityMainBinding;
import com.devcoder.databindingdemo.models.DataModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initControl();
    }

    private void initControl() {
        ArrayList<DataModel> list = new ArrayList<>();
        list.add(new DataModel("Oreo", "8.0", "https://picsum.photos/200/300.webp",R.drawable.ic_launcher_background));
        list.add(new DataModel("Nought", "7.0", "https://picsum.photos/200/300.webp",R.drawable.ic_launcher_background));
        list.add(new DataModel("Mas", "6.0", "https://picsum.photos/200/300.webp",R.drawable.ic_launcher_background));
        list.add(new DataModel("lolipop", "5.0", "https://picsum.photos/200/300.webp",R.drawable.ic_launcher_background));
        list.add(new DataModel("kitkate", "4.0", "https://picsum.photos/200/300.webp",R.drawable.ic_launcher_background));
        binding.setMyAdapter(new MyAdapter(list, this));
    }
}
