package com.cs.test_viewpager.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cs.test_viewpager.MainActivity;
import com.cs.test_viewpager.R;

import java.util.List;

/**
 * Created by chenshuai on 2016/8/23.
 */
public class WelcomeViewPageAdapter extends PagerAdapter{
    private List<Integer> mList;
    private Context context;
    private View itemView;
    public WelcomeViewPageAdapter(Context context, List<Integer> list) {
        this.context=context;
        this.mList=list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override//决定是否与一个特定的页面视图返回的关键对象instantiateItem(ViewGroup,int)
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override//为给定的位置创建页面。
    public Object instantiateItem(final ViewGroup container, int position) {
        itemView=View .inflate(context, R.layout.item_viewpage_content,null);
        ImageView imageView= (ImageView) itemView.findViewById(R.id.image);
        final TextView start= (TextView) itemView.findViewById(R.id.start);

        imageView.setBackgroundResource(mList.get(position));

        start.setVisibility(position == mList.size()-1 ? View.VISIBLE:View.GONE);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.start(context);
            }
        });
        container.addView(itemView,ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        return itemView;


    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //        container.removeView(itemView);
    }
}
