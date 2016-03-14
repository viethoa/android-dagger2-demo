package com.viethoa.dagger2.AppComponents.Modules;

import com.viethoa.dagger2.Features.Login.LoginActivity;
import com.viethoa.dagger2.Features.Main.MainActivity;

/**
 * Created by VietHoa on 14/03/16.
 */
public interface ApplicationGraph {

    void inject(MainActivity mainActivity);

    void inject(LoginActivity loginActivity);
}
