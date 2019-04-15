package com.example.lenovo.myapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import util.Test0415;

//import com.race604.drawable.wave.WaveDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WaveDrawable waveDrawable = new WaveDrawable(this, R.drawable.boat);//本地图片
        waveDrawable.setWaveLength(500);//设置波长
        waveDrawable.setWaveSpeed(20);//设定波的移动速度
        waveDrawable.setWaveAmplitude(20);//设置波幅
        waveDrawable.setIndeterminate(true);//运行不确定模式,一直运行
        waveDrawable.setLevel(10);//设置水位
//waveDrawable.setIndeterminateAnimator();//自定义动画,设置不确定模式下的波浪加载动画

        //layout背景设置动图
        LinearLayout linearLayout=(LinearLayout)findViewById(R.id.layout);
        linearLayout.setBackground(waveDrawable);

        Test0415 test0415 = new Test0415();

//        //字体水位上升下降
//        TitanicTextView tv = (TitanicTextView) findViewById(R.id.my_text_view);
//// set fancy typeface设置花式字体
//        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "Satisfy-Regular.ttf");
//        tv.setTypeface(typeface);
//// start animation开始动画
//        new Titanic().start(tv);
    }
}
