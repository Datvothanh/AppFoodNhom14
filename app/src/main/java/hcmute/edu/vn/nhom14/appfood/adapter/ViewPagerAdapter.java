package hcmute.edu.vn.nhom14.appfood.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import hcmute.edu.vn.nhom14.appfood.view.fragment.AngiFragment;
import hcmute.edu.vn.nhom14.appfood.view.fragment.OdauFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public ViewPagerAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OdauFragment();
            default:
                return new AngiFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
