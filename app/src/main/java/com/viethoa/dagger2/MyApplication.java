package com.viethoa.dagger2;

import android.app.Application;
import android.content.Context;

/**
 * Created by VietHoa on 10/03/16.
 */
public class MyApplication extends Application {

    public static MyApplication newInstance(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
