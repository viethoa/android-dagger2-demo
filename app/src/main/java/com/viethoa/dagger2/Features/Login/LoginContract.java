package com.viethoa.dagger2.Features.Login;

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
