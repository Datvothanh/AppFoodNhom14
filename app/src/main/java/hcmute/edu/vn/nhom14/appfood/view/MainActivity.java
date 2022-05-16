package hcmute.edu.vn.nhom14.appfood.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import hcmute.edu.vn.nhom14.appfood.R;
import hcmute.edu.vn.nhom14.appfood.adapter.ViewPagerAdapter;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerMain;
    private BottomNavigationView bottomNavigationView;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPagerMain = (ViewPager) findViewById(R.id.view_paper);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        ViewPagerAdapter adapterViewPager = new ViewPagerAdapter(getSupportFragmentManager() , FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT );


        viewPagerMain.setAdapter(adapterViewPager);
        viewPagerMain.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            switch (position){
                case 0:
                    bottomNavigationView.getMenu().findItem(R.id.menu_tab_1).setChecked(true);
                    break;
                case 1:
                    bottomNavigationView.getMenu().findItem(R.id.menu_tab_2).setChecked(true);
                    break;
                case 2:
                    bottomNavigationView.getMenu().findItem(R.id.menu_tab_3).setChecked(true);
                    break;
                case 3:
                    bottomNavigationView.getMenu().findItem(R.id.menu_tab_4).setChecked(true);
                    break;
            }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_tab_1:
                        viewPagerMain.setCurrentItem(0);
                        break;
                    case R.id.menu_tab_2:
                        viewPagerMain.setCurrentItem(1);
                        break;

                    case R.id.menu_tab_3:
                        viewPagerMain.setCurrentItem(2);
                        break;
                    case R.id.menu_tab_4:
                        viewPagerMain.setCurrentItem(3);
                        break;
                }

                return true;
            }
        });

    }


}