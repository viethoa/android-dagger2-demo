package com.viethoa.dagger2.Components.Modules.Fragment;

import com.viethoa.dagger2.Features.Presenters.ContentPresenter.ContentContract;
import com.viethoa.dagger2.Features.Presenters.ContentPresenter.ContentPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 27/03/16.
 */
@Module
public class FragmentModule {

    private Object mFragmentViewImpl;

    public FragmentModule(Object viewImpl) {
        this.mFragmentViewImpl = viewImpl;
    }

    @Provides
    @Singleton
    ContentContract.View provideView() {
        return (ContentContract.View) mFragmentViewImpl;
    }

    @Provides
    @Singleton
    ContentContract.UserActions provideFragmentPresenter(ContentPresenter presenter) {
        return presenter;
    }
}
