package com.devcoder.databindingdemo.one_way_databinding.adapters;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.squareup.picasso.Picasso;

public class BindingAdapterUtils {
        @BindingAdapter({"bind:imageUrl"})
        public static void loadImage(ImageView view, String url) {
            Picasso.get().load(url).into(view);
        }
}
