package com.viethoa.dagger2.Features.Main;

/**
 * Created by VietHoa on 11/03/16.
 */
public interface MainContract {
    interface View {
        void showMessage(String message);
    }

    interface UserActions {
        void getMessage();
    }
}
