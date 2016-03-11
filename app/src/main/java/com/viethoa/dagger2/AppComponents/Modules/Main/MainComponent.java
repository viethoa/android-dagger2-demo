package com.viethoa.dagger2.AppComponents.Modules.Main;

import com.viethoa.dagger2.Features.Main.MainActivity;
import com.viethoa.dagger2.Features.Main.MainPresenter;

import dagger.Subcomponent;

/**
 * Created by VietHoa on 11/03/16.
 */
@Subcomponent(
        modules = {
                MainModule.class
        }
)
public interface MainComponent {
    void inject(MainActivity activity);

    MainPresenter getMainPresenter();
}
