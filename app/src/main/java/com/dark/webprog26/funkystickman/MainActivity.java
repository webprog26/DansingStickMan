package com.dark.webprog26.funkystickman;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ivStickman)
    ImageView animImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        final AnimationDrawable animationDrawable = (AnimationDrawable) animImage.getDrawable();
        animImage.post(new Runnable() {
            @Override
            public void run() {
                animationDrawable.start();
            }
        });
    }
}
