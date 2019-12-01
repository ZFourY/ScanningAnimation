package com.zmm.scanninganimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView mIvDeviceCaliShoes;
    ImageView mIvDeviceCaliScanning;
    private Animation mScanningAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvDeviceCaliShoes = (ImageView)findViewById(R.id.iv_device_cali_shoes);
        mIvDeviceCaliScanning = (ImageView)findViewById(R.id.iv_device_cali_scanning);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        int left = mIvDeviceCaliShoes.getLeft();
        int right = mIvDeviceCaliShoes.getRight();
        int top = mIvDeviceCaliShoes.getTop();
        int bottom = mIvDeviceCaliShoes.getBottom();

        int height = mIvDeviceCaliScanning.getHeight()/2;

        mScanningAnimation = new TranslateAnimation(left, left, top-height, bottom-height);
        mScanningAnimation.setDuration(1000); // 动画持续时间
        mScanningAnimation.setRepeatCount(Animation.INFINITE); // 无限循环
        mScanningAnimation.setRepeatMode(Animation.REVERSE);

        // 播放动画
        mIvDeviceCaliScanning.setAnimation(mScanningAnimation);
        mScanningAnimation.startNow();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mScanningAnimation.cancel();
    }
}
