package hcmute.edu.vn.nhom14.appfood.view;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

import hcmute.edu.vn.nhom14.appfood.Database;
import hcmute.edu.vn.nhom14.appfood.R;
import hcmute.edu.vn.nhom14.appfood.adapter.ViewPagerAdapter;
import hcmute.edu.vn.nhom14.appfood.beans.Restaurant;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener , RadioGroup.OnCheckedChangeListener{

    private ViewPager viewPagerMain;
    private RadioButton radioodau , radioangi;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerMain = (ViewPager) findViewById(R.id.view_pager);
        radioodau = (RadioButton) findViewById(R.id.radio_odau);
        radioangi = (RadioButton) findViewById(R.id.radio_angi);
        RadioGroup groupodauangi = (RadioGroup) findViewById(R.id.group_main);

        ViewPagerAdapter adapterViewPager = new ViewPagerAdapter(getSupportFragmentManager() );

        viewPagerMain.setAdapter(adapterViewPager);
        viewPagerMain.addOnPageChangeListener(this);

        groupodauangi.setOnCheckedChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                radioodau.setChecked(true);
                break;
            case 1:
                radioangi.setChecked(true);
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
        switch (i){
            case  R.id.radio_angi:
                viewPagerMain.setCurrentItem(1);
                break;
            case R.id.radio_odau:
                viewPagerMain.setCurrentItem(0);
                break;
        }
    }
}