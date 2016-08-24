package com.cs.test_viewpager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.cs.test_viewpager.SwipViewPager.SwipeViewPager;
import com.cs.test_viewpager.adapter.CustomViewPageAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    public static void start(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);


        SwipeViewPager mSwipeView = (SwipeViewPager) findViewById(R.id.swip_main_viewpager);
        //初始化PageAdapter 根据自己的需求自定义样式
        CustomViewPageAdapter adapter = new CustomViewPageAdapter(this, getAdData());

        //初始化 轮播图指示点
        mSwipeView.updateIndicatorView(getAdData().size());

        mSwipeView.setAdapter(adapter);
        //广告图开启滚动功能
        mSwipeView.startScorll();
    }


    // 广告数据
    public static List<Integer> getAdData() {
        List<Integer> adList = new ArrayList<>();
        adList.add(R.mipmap.guide_bg1);
        adList.add(R.mipmap.guide_bg2);
        adList.add(R.mipmap.guide_bg3);
        adList.add(R.mipmap.guide_bg3);
        return adList;
    }
}
