package shoping.softices.com.fragmentdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;


import shoping.softices.com.fragmentdemo.Adepter.ViewPagerAdapter;
import shoping.softices.com.fragmentdemo.FRAGMENT.OneFragment;
import shoping.softices.com.fragmentdemo.FRAGMENT.TwoFragment;


public class FragmentActivity extends AppCompatActivity {
    ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adepter=new ViewPagerAdapter(getSupportFragmentManager());
        adepter.addFradment(new OneFragment(),"ONE");
        adepter.addFradment(new TwoFragment(),"TWO");
        viewPager.setAdapter(adepter);

    }

}
