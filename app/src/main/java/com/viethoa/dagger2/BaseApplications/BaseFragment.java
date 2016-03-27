package com.viethoa.dagger2.BaseApplications;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.viethoa.dagger2.Components.Modules.ApplicationComponent;

import butterknife.ButterKnife;

/**
 * Created by VietHoa on 20/01/16.
 */
public abstract class BaseFragment extends Fragment {

    private ApplicationComponent component;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = setContentView(inflater, container);
        ButterKnife.bind(this, contentView);
        return contentView;
    }

    protected abstract View setContentView(LayoutInflater inflater, ViewGroup container);

    //----------------------------------------------------------------------------------------------
    // Setup Dagger
    //----------------------------------------------------------------------------------------------

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (component == null) {
            component = ApplicationComponent.newInstance.build(this);
        }
        injectModule(component);
    }

    protected abstract void injectModule(ApplicationComponent component);
}
