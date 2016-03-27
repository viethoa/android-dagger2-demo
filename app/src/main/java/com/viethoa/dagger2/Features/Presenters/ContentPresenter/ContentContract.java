package com.viethoa.dagger2.Features.Presenters.ContentPresenter;

/**
 * Created by VietHoa on 27/03/16.
 */
public interface ContentContract {
    interface View {
        void showMessage(String message);
    }

    interface UserActions {
        void getMessage();
    }
}
