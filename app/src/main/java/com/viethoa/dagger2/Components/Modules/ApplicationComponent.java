package com.viethoa.dagger2.Components.Modules;

import com.viethoa.dagger2.Components.Modules.Fragment.FragmentModule;
import com.viethoa.dagger2.Components.Modules.Login.LoginModule;
import com.viethoa.dagger2.Components.Modules.Main.MainModule;
import com.viethoa.dagger2.Components.Services.AppService;
import com.viethoa.dagger2.Features.Views.Main.ContentFragment.ContentFragment;
import com.viethoa.dagger2.Features.Views.Login.LoginActivity;
import com.viethoa.dagger2.Features.Views.Main.MainActivity;

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
                FragmentModule.class,
        }
)
public interface ApplicationComponent {
    final class newInstance
    {
        public static ApplicationComponent build(Object viewImpl) {
            return DaggerApplicationComponent.builder()
                    .loginModule(new LoginModule(viewImpl))
                    .mainModule(new MainModule(viewImpl))
                    .fragmentModule(new FragmentModule(viewImpl))
                    .build();
        }
    }

    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);

    void inject(ContentFragment fragment);

    void inject(AppService appService);
}
