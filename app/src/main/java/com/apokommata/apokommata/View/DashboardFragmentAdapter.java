package com.apokommata.apokommata.View;

import android.app.Service;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.apokommata.apokommata.R;

/**
 * Created by dito on 29/03/17.
 */

public class DashboardFragmentAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Timeline", "Ongoing", "Profile" };
    private int[] tabIcon = { R.drawable.loc_icon, R.drawable.loc_icon, R.drawable.loc_icon};
    private Context context;

    public DashboardFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public View getTabView(int position) {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView
        View v = LayoutInflater.from(context).inflate(R.layout.tab_menu_layout, null);
        TextView tv = (TextView) v.findViewById(R.id.title_tab);
        tv.setText(tabTitles[position]);
        ImageView img = (ImageView) v.findViewById(R.id.icon_tab);
        img.setImageResource(tabIcon[position]);
        return v;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return TimelineFragment.newInstance(position + 1);
            case 1:
                return OngoingFragment.newInstance(position + 1);
            case 2:
                return ProfileFragment.newInstance(position + 1);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
