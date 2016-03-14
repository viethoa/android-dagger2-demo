package com.viethoa.dagger2.BaseApplications;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.viethoa.dagger2.AppComponents.Modules.ApplicationComponent;
import com.viethoa.dagger2.AppComponents.Modules.ApplicationGraph;

/**
 * Created by VietHoa on 10/03/16.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private ApplicationGraph mObjectGraph;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeDagger();
    }

    //----------------------------------------------------------------------------------------------
    // Setup Dagger
    //----------------------------------------------------------------------------------------------

    protected abstract void injectModule(ApplicationGraph objectGraph);

    private void initializeDagger() {
        if (mObjectGraph == null) {
            mObjectGraph = ApplicationComponent.Initializer.init(this);
        }
        injectModule(mObjectGraph);
    }

}
