package com.viethoa.dagger2.AppComponents.Modules.Login;

import android.content.Context;

import com.viethoa.dagger2.Features.Login.LoginContract;
import com.viethoa.dagger2.Features.Login.LoginPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 10/03/16.
 */
@Module
public class LoginModule {

    private Context mContext;

    public LoginModule(Context context) {
        this.mContext = context;
    }

    @Provides
    LoginContract.View provideView() {
        return (LoginContract.View) mContext;
    }

    @Provides
    LoginContract.UserActions provideMainPresenter(LoginPresenter presenter) {
        return presenter;
    }
}