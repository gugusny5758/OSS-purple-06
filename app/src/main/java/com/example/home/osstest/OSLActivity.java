package com.example.home.osstest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mojihwan on 2017. 12. 1..
 */

public class OSLActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //osl 레이아웃 불러옴
        setContentView(R.layout.osl);
    }
}
