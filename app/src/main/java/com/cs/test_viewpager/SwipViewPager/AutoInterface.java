package com.cs.test_viewpager.SwipViewPager;

import android.support.v4.view.PagerAdapter;

/**
 * Created by chenshuai on 2016/8/23.
 */
public interface AutoInterface {
    void updateIndicatorView(int size);

    void setAdapter(PagerAdapter adapter);

    void startScorll();

    void endScorll();
}
