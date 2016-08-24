package com.cs.test_viewpager.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cs.test_viewpager.R;

import java.util.List;

/**
 * Created by chenshuai on 2016/8/23.
 */
public class CustomViewPageAdapter extends PagerAdapter {
    private List<Integer> mlist;
    private Context context;
    private View view;

    public CustomViewPageAdapter(Context context,List<Integer> mlist) {
        this.mlist = mlist;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mlist.size() > 0 ?( mlist.size() == 1 ? 1 : Integer.MAX_VALUE ): 0;
        //return Integer.MAX_VALUE;代码效果是一样的

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //       container.removeView(itemView);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       view=View.inflate(context, R.layout.item_viewspager_main,null);
        ImageView imageView= (ImageView) view.findViewById(R.id.item_image);
        imageView.setBackgroundResource(mlist.get(position%mlist.size()));
        container.addView(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        return view;
    }

}

