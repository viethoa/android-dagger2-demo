package com.viethoa.dagger2.Features.Views.Main;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.viethoa.dagger2.BaseApplications.BaseActivity;
import com.viethoa.dagger2.Components.Modules.ApplicationComponent;
import com.viethoa.dagger2.Features.Views.Main.ContentFragment.ContentFragment;
import com.viethoa.dagger2.Features.Views.Login.LoginActivity;
import com.viethoa.dagger2.Features.Presenters.MainPresenter.MainContract;
import com.viethoa.dagger2.R;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainContract.UserActions mMainPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMainPresenter.getMessage();
        replaceFragment(ContentFragment.newInstance(), R.id.fragment_content);
    }

    @Override
    protected void injectModule(ApplicationComponent objectGraph) {
        objectGraph.inject(this);
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
