package com.viethoa.dagger2.Features.Presenters.LoginPresenter;

import javax.inject.Inject;

/**
 * Created by VietHoa on 11/03/16.
 */
public class LoginPresenter implements LoginContract.UserActions {

    @Inject
    LoginContract.View mLoginView;

    @Inject
    public LoginPresenter() {}

    @Override
    public void getMessage() {
        mLoginView.showMessage("This message call from presenter being setup by dagger2");
    }
}
