package com.viethoa.dagger2.AppComponents.Modules.Login;

import com.viethoa.dagger2.Features.Login.LoginActivity;
import com.viethoa.dagger2.Features.Login.LoginPresenter;

import dagger.Subcomponent;

/**
 * Created by VietHoa on 11/03/16.
 */
@Subcomponent(
        modules = {
                LoginModule.class
        }
)
public interface LoginComponent {
    void inject(LoginActivity activity);

    LoginPresenter getLoginPresenter();
}
