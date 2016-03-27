package com.viethoa.dagger2.Components.Modules.Main;

import com.viethoa.dagger2.Features.Presenters.MainPresenter.MainContract;
import com.viethoa.dagger2.Features.Presenters.MainPresenter.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 10/03/16.
 */
@Module
public class MainModule {

    private Object mContext;

    public MainModule(Object context) {
        this.mContext = context;
    }

    @Provides
    @Singleton
    MainContract.View provideView() {
        return (MainContract.View) mContext;
    }

    @Provides
    @Singleton
    MainContract.UserActions provideMainPresenter(MainPresenter presenter) {
        return presenter;
    }
}
