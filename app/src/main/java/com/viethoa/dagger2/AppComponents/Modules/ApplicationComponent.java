package com.viethoa.dagger2.AppComponents.Modules;

import android.content.Context;

import com.viethoa.dagger2.AppComponents.Modules.Login.LoginModule;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by VietHoa on 10/03/16.
 */
@Singleton
@Component(
        modules = {
                MainModule.class,
                LoginModule.class,
        }
)
public interface ApplicationComponent extends ApplicationGraph {

    class Initializer {

        public static ApplicationComponent init(Context context) {
            return DaggerApplicationComponent.builder()
                    .loginModule(new LoginModule(context))
                    .mainModule(new MainModule(context))
                    .build();
        }
    }
}
