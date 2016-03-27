package com.viethoa.dagger2.Components.Services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import com.viethoa.dagger2.Components.Modules.ApplicationComponent;
import com.viethoa.dagger2.MyApplication;

/**
 * Created by VietHoa on 27/03/16.
 */
public class AppService extends IntentService {
    private static final String NAME = AppService.class.getSimpleName();

    public AppService() {
        super(NAME);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        MyApplication application = MyApplication.newInstance();
        ApplicationComponent component = ApplicationComponent.newInstance.build(application);
        component.inject(this);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(NAME, NAME + " called");
    }
}
