package com.viethoa.dagger2.Features.Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.viethoa.dagger2.AppComponents.Modules.ApplicationComponent;
import com.viethoa.dagger2.AppComponents.Modules.Login.LoginComponent;
import com.viethoa.dagger2.AppComponents.Modules.Login.LoginModule;
import com.viethoa.dagger2.BaseApplications.BaseActivity;
import com.viethoa.dagger2.Features.Main.MainActivity;
import com.viethoa.dagger2.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Inject
    LoginContract.UserActions mLoginPresenter;

    @Override
    public void injectDependence(ApplicationComponent component) {
        LoginComponent loginComponent = component.setLoginComponent(new LoginModule(this));
        loginComponent.inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        mLoginPresenter.getMessage();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.btn_navigation)
    protected void NavigationToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
