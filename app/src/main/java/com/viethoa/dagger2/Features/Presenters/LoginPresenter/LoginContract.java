package com.viethoa.dagger2.Features.Presenters.LoginPresenter;

/**
 * Created by VietHoa on 11/03/16.
 */
public interface LoginContract {

    interface View {
        void showMessage(String message);
    }

    interface UserActions {
        void getMessage();
    }

}
