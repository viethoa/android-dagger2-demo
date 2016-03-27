package com.viethoa.dagger2.Features.Presenters.ContentPresenter;

import javax.inject.Inject;

/**
 * Created by VietHoa on 27/03/16.
 */
public class ContentPresenter implements ContentContract.UserActions {

    @Inject
    ContentContract.View mFragmentView;

    @Inject
    public ContentPresenter() {
    }

    @Override
    public void getMessage() {
        mFragmentView.showMessage("This message call from FragmentPresenter being setup by dagger2");
    }
}
