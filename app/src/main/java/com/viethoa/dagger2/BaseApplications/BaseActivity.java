package com.viethoa.dagger2.BaseApplications;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.viethoa.dagger2.Components.Modules.ApplicationComponent;

/**
 * Created by VietHoa on 10/03/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private ApplicationComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeDagger();
    }

    //----------------------------------------------------------------------------------------------
    // Setup Dagger
    //----------------------------------------------------------------------------------------------

    protected abstract void injectModule(ApplicationComponent component);

    private void initializeDagger() {
        if (component == null) {
            component = ApplicationComponent.newInstance.build(this);
        }
        injectModule(component);
    }

    //----------------------------------------------------------------------------------------------
    // Helpers
    //----------------------------------------------------------------------------------------------

    protected void replaceFragment(final Fragment fg, final int containerResId) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(containerResId, fg);
        //tx.addToBackStack(LOG_TAG);
        tx.commit();
        fm.executePendingTransactions();
    }

}
