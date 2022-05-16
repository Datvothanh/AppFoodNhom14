package hcmute.edu.vn.nhom14.appfood.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import hcmute.edu.vn.nhom14.appfood.view.fragment.AddFragment;
import hcmute.edu.vn.nhom14.appfood.view.fragment.CartFragment;
import hcmute.edu.vn.nhom14.appfood.view.fragment.HomeFragment;
import hcmute.edu.vn.nhom14.appfood.view.fragment.UserFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new AddFragment();
            case 2:
                return new CartFragment();
            default:
                return new UserFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
