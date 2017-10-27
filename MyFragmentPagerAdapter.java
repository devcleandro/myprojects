package br.edu.ufam.icet.rocha.cleandro.appeduc.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.edu.ufam.icet.rocha.cleandro.appeduc.fragments.FragmentMA;
import br.edu.ufam.icet.rocha.cleandro.appeduc.fragments.FragmentMB;
import br.edu.ufam.icet.rocha.cleandro.appeduc.fragments.FragmentMC;

/**
 * Created by Cleandro Rocha on 25/07/2016.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles;

    public MyFragmentPagerAdapter(FragmentManager fm, String[] mTabTitles) {
        super(fm);
        this.mTabTitles = mTabTitles;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return new FragmentMA();
            case 1:
                return new FragmentMB();
            case 2:
                return new FragmentMC();
            default:
                return null;
        }
    }
    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}
