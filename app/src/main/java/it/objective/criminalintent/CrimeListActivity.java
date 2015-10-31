package it.objective.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Roberto on 31/10/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
