package com.devcoder.databindingdemo.one_way_databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.devcoder.databindingdemo.R;
import com.devcoder.databindingdemo.one_way_databinding.adapters.MyAdapter;
import com.devcoder.databindingdemo.databinding.ActivityMainBinding;
import com.devcoder.databindingdemo.one_way_databinding.models.DataModel;

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
        list.add(new DataModel("Oreo", "8.0", "https://picsum.photos/200/300.webp", R.drawable.oreo));
        list.add(new DataModel("Nought", "7.0", "https://picsum.photos/200/300.webp", R.drawable.nought));
        list.add(new DataModel("Marshmallow", "6.0", "https://picsum.photos/200/300.webp", R.drawable.marshmallow));
        list.add(new DataModel("Lollipop", "5.0", "https://picsum.photos/200/300.webp", R.drawable.lolipop));
        list.add(new DataModel("Kitkat", "4.0", "https://picsum.photos/200/300.webp", R.drawable.kitkate));
        binding.setMyAdapter(new MyAdapter(list, this));
    }
}
