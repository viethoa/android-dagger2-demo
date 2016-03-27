package com.viethoa.dagger2.Components.Modules.Login;

import com.viethoa.dagger2.Features.Presenters.LoginPresenter.LoginContract;
import com.viethoa.dagger2.Features.Presenters.LoginPresenter.LoginPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 10/03/16.
 */
@Module
public class LoginModule {

    private Object mContext;

    public LoginModule(Object context) {
        this.mContext = context;
    }

    @Provides
    @Singleton
    LoginContract.View provideView() {
        return (LoginContract.View) mContext;
    }

    @Provides
    @Singleton
    LoginContract.UserActions provideMainPresenter(LoginPresenter presenter) {
        return presenter;
    }
}
