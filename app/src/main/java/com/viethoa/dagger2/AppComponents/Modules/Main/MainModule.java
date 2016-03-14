package com.viethoa.dagger2.AppComponents.Modules.Main;

import android.content.Context;

import com.viethoa.dagger2.Features.Main.MainContract;
import com.viethoa.dagger2.Features.Main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by VietHoa on 10/03/16.
 */
@Module
public class MainModule {

    private Context mContext;

    public MainModule(Context context) {
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
