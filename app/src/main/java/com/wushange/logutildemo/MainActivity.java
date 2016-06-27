package com.wushange.logutildemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.setDebug(true);
        LogUtil.d("提取xutil的logutil");
        LogUtil.e("提取xutil的logutil");
        LogUtil.i("提取xutil的logutil");
        LogUtil.v("提取xutil的logutil");
        LogUtil.w("提取xutil的logutil");
        LogUtil.wtf("提取xutil的logutil");


    }
}
