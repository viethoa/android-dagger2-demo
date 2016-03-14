package com.viethoa.dagger2;

import android.app.Application;

/**
 * Created by VietHoa on 10/03/16.
 */
public class MyApplication extends Application {
    private static MyApplication mInstance;

    public static MyApplication newInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

}
