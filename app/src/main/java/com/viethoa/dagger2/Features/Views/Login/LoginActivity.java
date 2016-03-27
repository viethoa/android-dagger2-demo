package com.viethoa.dagger2.Features.Views.Login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.viethoa.dagger2.BaseApplications.BaseActivity;
import com.viethoa.dagger2.Components.Modules.ApplicationComponent;
import com.viethoa.dagger2.Features.Presenters.LoginPresenter.LoginContract;
import com.viethoa.dagger2.Features.Views.Main.MainActivity;
import com.viethoa.dagger2.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @Inject
    LoginContract.UserActions mLoginPresenter;

    @Override
    protected void injectModule(ApplicationComponent objectGraph) {
        objectGraph.inject(this);
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
