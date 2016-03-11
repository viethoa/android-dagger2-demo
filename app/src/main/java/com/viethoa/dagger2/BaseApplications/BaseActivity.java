package com.viethoa.dagger2.BaseApplications;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.viethoa.dagger2.AppComponents.Modules.ApplicationComponent;
import com.viethoa.dagger2.AppComponents.Modules.ApplicationModule;
import com.viethoa.dagger2.AppComponents.Modules.DaggerApplicationComponent;
import com.viethoa.dagger2.AppComponents.Modules.Login.LoginModule;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainModule;

/**
 * Created by VietHoa on 10/03/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeDagger();
    }

    public abstract void injectDependence(ApplicationComponent component);

    private void initializeDagger() {
        ApplicationModule applicationModule = new ApplicationModule(getApplicationContext());
        ApplicationComponent applicationComponent = DaggerApplicationComponent.builder()
                .mainModule(new MainModule(this))
                .loginModule(new LoginModule(this))
                .applicationModule(applicationModule)
                .build();

        injectDependence(applicationComponent);
    }
}
