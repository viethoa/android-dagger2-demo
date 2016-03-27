package com.viethoa.dagger2.Features.Presenters.MainPresenter;

import javax.inject.Inject;

/**
 * Created by VietHoa on 11/03/16.
 */
public class MainPresenter implements MainContract.UserActions {
    @Inject
    MainContract.View mMainView;

    @Inject
    public MainPresenter() { }

    @Override
    public void getMessage() {
        mMainView.showMessage("This message call from presenter being setup by dagger2");
    }
}
