package com.viethoa.dagger2.AppComponents.Modules;

import android.content.Context;

import dagger.Module;

/**
 * Created by VietHoa on 10/03/16.
 */
@Module
public class ApplicationModule {
    private Context applicationContext;

    public ApplicationModule(Context context) {
        this.applicationContext = context;
    }
}
