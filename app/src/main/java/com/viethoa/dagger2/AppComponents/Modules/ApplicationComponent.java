package com.viethoa.dagger2.AppComponents.Modules;

import com.viethoa.dagger2.AppComponents.Modules.Login.LoginComponent;
import com.viethoa.dagger2.AppComponents.Modules.Login.LoginModule;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainComponent;
import com.viethoa.dagger2.AppComponents.Modules.Main.MainModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by VietHoa on 10/03/16.
 */
@Singleton
@Component(
        modules = {
                ApplicationModule.class,
                MainModule.class,
                LoginModule.class,
        }
)
public interface ApplicationComponent {

    MainComponent setMainComponent(MainModule mainModule);

    LoginComponent setLoginComponent(LoginModule loginModule);
}
