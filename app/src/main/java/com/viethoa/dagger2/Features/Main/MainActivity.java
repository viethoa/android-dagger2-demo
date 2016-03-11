package com.viethoa.dagger2.Features.Main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.viethoa.dagger2.AppComponents.Modules.ApplicationComponent;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainComponent;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainModule;
import com.viethoa.dagger2.BaseApplications.BaseActivity;
import com.viethoa.dagger2.Features.Login.LoginActivity;
import com.viethoa.dagger2.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainContract.UserActions mMainPresenter;

    @Override
    public void injectDependence(ApplicationComponent component) {
        MainComponent mainComponent = component.setMainComponent(new MainModule(this));
        mainComponent.inject(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMainPresenter.getMessage();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btn_navigation)
    protected void NavigationToMainActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
