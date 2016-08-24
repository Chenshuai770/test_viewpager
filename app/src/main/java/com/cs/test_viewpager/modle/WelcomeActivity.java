package com.cs.test_viewpager.modle;

import android.app.Activity;
import android.os.Bundle;

import com.cs.test_viewpager.R;
import com.cs.test_viewpager.SwipViewPager.SwipeViewPager;
import com.cs.test_viewpager.adapter.WelcomeViewPageAdapter;
import com.cs.test_viewpager.uitls.StatusBarUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenshuai on 2016/8/23.
 */
public class WelcomeActivity extends Activity {
    private SwipeViewPager mSwipeView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //设置状态栏透明
        StatusBarUtil.setTranslucentBackground(this);
        mSwipeView= (SwipeViewPager) findViewById(R.id.swip_viewpager);
        WelcomeViewPageAdapter adapter = new WelcomeViewPageAdapter(this,getAdData());
        //初始化轮播图下面小点
        mSwipeView.updateIndicatorView(getAdData().size());
        mSwipeView.setAdapter(adapter);


    }

    private List<Integer> getAdData() {
        List<Integer> adList=new ArrayList<>();
        adList.add(R.mipmap.guide_bg1);
        adList.add(R.mipmap.guide_bg2);
        adList.add(R.mipmap.guide_bg3);
        return adList;
    }
}
